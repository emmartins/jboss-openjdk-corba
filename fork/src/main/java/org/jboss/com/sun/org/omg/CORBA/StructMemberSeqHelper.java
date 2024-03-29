/*
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
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
package org.jboss.com.sun.org.omg.CORBA;


/**
* org.jboss.com.sun.org.omg/CORBA/StructMemberSeqHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:44 AM PDT
*/

// This file has been _CHANGED_

public final class StructMemberSeqHelper
{
    private static String  _id = "IDL:omg.org/CORBA/StructMemberSeq:1.0";

    public StructMemberSeqHelper()
    {
    }

    // _CHANGED_
    //public static void insert (org.omg.CORBA.Any a, org.jboss.com.sun.org.omg.CORBA.StructMember[] that)
    public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.StructMember[] that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    // _CHANGED_
    //public static org.jboss.com.sun.org.omg.CORBA.StructMember[] extract (org.omg.CORBA.Any a)
    public static org.omg.CORBA.StructMember[] extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = org.jboss.com.sun.org.omg.CORBA.StructMemberHelper.type ();
                __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
                __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.jboss.com.sun.org.omg.CORBA.StructMemberSeqHelper.id (), "StructMemberSeq", __typeCode);
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    // _CHANGED_
    //public static org.jboss.com.sun.org.omg.CORBA.StructMember[] read (org.omg.CORBA.portable.InputStream istream)
    public static org.omg.CORBA.StructMember[] read (org.omg.CORBA.portable.InputStream istream)
    {
        // _CHANGED_
        //org.jboss.com.sun.org.omg.CORBA.StructMember value[] = null;
        org.omg.CORBA.StructMember value[] = null;
        int _len0 = istream.read_long ();
        // _CHANGED_
        //value = new org.jboss.com.sun.org.omg.CORBA.StructMember[_len0];
        value = new org.omg.CORBA.StructMember[_len0];
        for (int _o1 = 0;_o1 < value.length; ++_o1)
            value[_o1] = org.jboss.com.sun.org.omg.CORBA.StructMemberHelper.read (istream);
        return value;
    }

    // _CHANGED_
    //public static void write (org.omg.CORBA.portable.OutputStream ostream, org.jboss.com.sun.org.omg.CORBA.StructMember[] value)
    public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.StructMember[] value)
    {
        ostream.write_long (value.length);
        for (int _i0 = 0;_i0 < value.length; ++_i0)
            org.jboss.com.sun.org.omg.CORBA.StructMemberHelper.write (ostream, value[_i0]);
    }

}
