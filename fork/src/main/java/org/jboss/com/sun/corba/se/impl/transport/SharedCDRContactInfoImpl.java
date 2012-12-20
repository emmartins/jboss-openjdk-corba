/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.jboss.com.sun.corba.se.impl.transport;

import org.jboss.com.sun.corba.se.pept.broker.Broker;
import org.jboss.com.sun.corba.se.pept.encoding.OutputObject;
import org.jboss.com.sun.corba.se.pept.protocol.ClientRequestDispatcher;
import org.jboss.com.sun.corba.se.pept.protocol.MessageMediator;
import org.jboss.com.sun.corba.se.pept.transport.Connection;
import org.jboss.com.sun.corba.se.pept.transport.ContactInfo;

import org.jboss.com.sun.corba.se.spi.orb.ORB;
import org.jboss.com.sun.corba.se.spi.ior.IOR;
import org.jboss.com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.jboss.com.sun.corba.se.spi.logging.CORBALogDomains;
import org.jboss.com.sun.corba.se.spi.protocol.CorbaMessageMediator;
import org.jboss.com.sun.corba.se.spi.transport.CorbaContactInfoList;

import org.jboss.com.sun.corba.se.impl.encoding.BufferManagerFactory;
import org.jboss.com.sun.corba.se.impl.encoding.CDROutputObject;
import org.jboss.com.sun.corba.se.impl.encoding.CDROutputStream;
import org.jboss.com.sun.corba.se.impl.logging.ORBUtilSystemException;
import org.jboss.com.sun.corba.se.impl.protocol.CorbaMessageMediatorImpl;
import org.jboss.com.sun.corba.se.impl.protocol.SharedCDRClientRequestDispatcherImpl;

public class SharedCDRContactInfoImpl
    extends
        CorbaContactInfoBase
{
    // This is only necessary for the pi.clientrequestinfo test.
    // It tests that request ids are different.
    // Rather than rewrite the test, just fake it.
    private static int requestId = 0;

    protected ORBUtilSystemException wrapper;

    public SharedCDRContactInfoImpl(
        ORB orb,
        CorbaContactInfoList contactInfoList,
        IOR effectiveTargetIOR,
        short addressingDisposition)
    {
        this.orb = orb;
        this.contactInfoList = contactInfoList;
        this.effectiveTargetIOR = effectiveTargetIOR;
        this.addressingDisposition = addressingDisposition;
    }

    ////////////////////////////////////////////////////
    //
    // pept.transport.ContactInfo
    //

    public ClientRequestDispatcher getClientRequestDispatcher()
    {
        // REVISIT - use registry
        return new SharedCDRClientRequestDispatcherImpl();
    }

    public boolean isConnectionBased()
    {
        return false;
    }

    public boolean shouldCacheConnection()
    {
        return false;
    }

    public String getConnectionCacheType()
    {
        throw getWrapper().methodShouldNotBeCalled();
    }

    public Connection createConnection()
    {
        throw getWrapper().methodShouldNotBeCalled();
    }

    // Called when client making an invocation.
    public MessageMediator createMessageMediator(Broker broker,
                                                 ContactInfo contactInfo,
                                                 Connection connection,
                                                 String methodName,
                                                 boolean isOneWay)
    {
        if (connection != null) {
            /// XXX LOGGING
            throw new RuntimeException("connection is not null");
        }

        CorbaMessageMediator messageMediator =
            new CorbaMessageMediatorImpl(
                (ORB) broker,
                contactInfo,
                null, // Connection;
                GIOPVersion.chooseRequestVersion( (ORB)broker,
                     effectiveTargetIOR),
                effectiveTargetIOR,
                requestId++, // Fake RequestId
                getAddressingDisposition(),
                methodName,
                isOneWay);

        return messageMediator;
    }

    public OutputObject createOutputObject(MessageMediator messageMediator)
    {
        CorbaMessageMediator corbaMessageMediator = (CorbaMessageMediator)
            messageMediator;
        // NOTE: GROW.
        OutputObject outputObject =
            new CDROutputObject(orb, messageMediator,
                                corbaMessageMediator.getRequestHeader(),
                                corbaMessageMediator.getStreamFormatVersion(),
                                BufferManagerFactory.GROW);
        messageMediator.setOutputObject(outputObject);
        return outputObject;
    }

    ////////////////////////////////////////////////////
    //
    // spi.transport.CorbaContactInfo
    //

    public String getMonitoringName()
    {
        throw getWrapper().methodShouldNotBeCalled();
    }

    ////////////////////////////////////////////////////
    //
    // java.lang.Object
    //

    ////////////////////////////////////////////////////
    //
    // java.lang.Object
    //

    public String toString()
    {
        return
            "SharedCDRContactInfoImpl["
            + "]";
    }

    //////////////////////////////////////////////////
    //
    // Implementation
    //

    protected ORBUtilSystemException getWrapper()
    {
        if (wrapper == null) {
            wrapper = ORBUtilSystemException.get( orb,
                          CORBALogDomains.RPC_TRANSPORT ) ;
        }
        return wrapper;
    }
}

// End of file.
