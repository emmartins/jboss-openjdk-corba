/*
 * Copyright (c) 1996, 2003, Oracle and/or its affiliates. All rights reserved.
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
/*
 * Licensed Materials - Property of IBM
 * RMI-IIOP v1.0
 * Copyright IBM Corp. 1998 1999  All Rights Reserved
 *
 */

package org.jboss.com.sun.corba.se.impl.corba;

import org.omg.CORBA.Any;
import org.omg.CORBA.Context;
import org.omg.CORBA.NO_IMPLEMENT;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.NVList;

import org.jboss.com.sun.corba.se.spi.logging.CORBALogDomains ;
import org.jboss.com.sun.corba.se.impl.logging.ORBUtilSystemException ;

public final class ContextImpl extends Context {

    private org.omg.CORBA.ORB _orb;
    private ORBUtilSystemException wrapper ;

    public ContextImpl(org.omg.CORBA.ORB orb)
    {
        _orb = orb;
        wrapper = ORBUtilSystemException.get(
            (org.jboss.com.sun.corba.se.spi.orb.ORB)orb,
            CORBALogDomains.RPC_PRESENTATION ) ;
    }

    public ContextImpl(Context parent)
    {
        throw wrapper.contextNotImplemented() ;
    }

    public String context_name()
    {
        throw wrapper.contextNotImplemented() ;
    }

    public Context parent()
    {
        throw wrapper.contextNotImplemented() ;
    }

    public Context create_child(String name)
    {
        throw wrapper.contextNotImplemented() ;
    }

    public void set_one_value(String propName, Any propValue)
    {
        throw wrapper.contextNotImplemented() ;
    }

    public void set_values(NVList values)
    {
        throw wrapper.contextNotImplemented() ;
    }


    public void delete_values(String propName)
    {
        throw wrapper.contextNotImplemented() ;
    }

    public NVList get_values(String startScope,
                             int opFlags,
                             String propName)
    {
        throw wrapper.contextNotImplemented() ;
    }
};
