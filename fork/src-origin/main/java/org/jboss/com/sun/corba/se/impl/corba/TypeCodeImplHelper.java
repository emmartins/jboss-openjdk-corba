/*
 * Copyright (c) 1999, 2004, Oracle and/or its affiliates. All rights reserved.
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

abstract public class TypeCodeImplHelper
{
    private static String  _id = "IDL:omg.org/CORBA/TypeCode:1.0";

    public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.TypeCode that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static org.omg.CORBA.TypeCode extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_TypeCode);
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static org.omg.CORBA.TypeCode read (org.omg.CORBA.portable.InputStream istream)
    {
        return istream.read_TypeCode ();
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.TypeCode value)
    {
        ostream.write_TypeCode (value);
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, TypeCodeImpl value)
    {
        ostream.write_TypeCode (value);
    }

}
