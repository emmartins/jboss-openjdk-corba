/*
 * Copyright (c) 2001, 2003, Oracle and/or its affiliates. All rights reserved.
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

package org.jboss.com.sun.corba.se.impl.protocol;

import java.util.Iterator;

import org.jboss.com.sun.corba.se.spi.orb.ORB;

import org.jboss.com.sun.corba.se.pept.protocol.ClientInvocationInfo;
import org.jboss.com.sun.corba.se.pept.protocol.MessageMediator;

import org.jboss.com.sun.corba.se.pept.protocol.ClientRequestDispatcher;

/**
 * @author Harold Carr
 */
public class CorbaInvocationInfo implements ClientInvocationInfo
{
    // REVISIT - these needs to be an interface-based impl.

    private boolean isRetryInvocation;
    private int entryCount;
    private ORB orb;
    private Iterator contactInfoListIterator;
    private ClientRequestDispatcher clientRequestDispatcher;
    private MessageMediator messageMediator;

    private CorbaInvocationInfo()
    {
    }

    public CorbaInvocationInfo(ORB orb)
    {
        this.orb = orb;
        isRetryInvocation = false;
        entryCount = 0;
    }

    public Iterator getContactInfoListIterator()
    {
        return contactInfoListIterator;
    }

    public void setContactInfoListIterator(Iterator contactInfoListIterator)
    {
        this.contactInfoListIterator = contactInfoListIterator;
    }

    public boolean isRetryInvocation()
    {
        return isRetryInvocation;
    }

    public void setIsRetryInvocation(boolean isRetryInvocation)
    {
        this.isRetryInvocation = isRetryInvocation;
    }

    public int getEntryCount()
    {
        return entryCount;
    }

    public void incrementEntryCount()
    {
        entryCount++;
    }

    public void decrementEntryCount()
    {
        entryCount--;
    }

    public void setClientRequestDispatcher(ClientRequestDispatcher clientRequestDispatcher)
    {
        this.clientRequestDispatcher = clientRequestDispatcher;
    }

    public ClientRequestDispatcher getClientRequestDispatcher()
    {
        return clientRequestDispatcher;
    }

    public void setMessageMediator(MessageMediator messageMediator)
    {
        this.messageMediator = messageMediator;
    }

    public MessageMediator getMessageMediator()
    {
        return messageMediator;
    }
}

// End of file.
