/*
 * Copyright (c) 2000, 2003, Oracle and/or its affiliates. All rights reserved.
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

package org.jboss.com.sun.corba.se.impl.ior;

import org.omg.CORBA.INTERNAL ;
import org.omg.CORBA.OctetSeqHolder ;

import org.omg.CORBA_2_3.portable.InputStream ;
import org.omg.CORBA_2_3.portable.OutputStream ;

import org.jboss.com.sun.corba.se.spi.orb.ORB ;
import org.jboss.com.sun.corba.se.spi.orb.ORBVersion ;
import org.jboss.com.sun.corba.se.spi.orb.ORBVersionFactory ;

import org.jboss.com.sun.corba.se.impl.ior.ObjectKeyFactoryImpl ;

/**
 * @author Ken Cavanaugh
 */
public final class OldPOAObjectKeyTemplate extends OldObjectKeyTemplateBase
{
    /** This constructor reads the template ONLY from the stream
    */
    public OldPOAObjectKeyTemplate( ORB orb, int magic, int scid, InputStream is )
    {
        this( orb, magic, scid, is.read_long(), is.read_long(), is.read_long() ) ;
    }

    /** This constructor reads a complete ObjectKey (template and Id)
    * from the stream.
    */
    public OldPOAObjectKeyTemplate( ORB orb, int magic, int scid, InputStream is,
        OctetSeqHolder osh )
    {
        this( orb, magic, scid, is ) ;
        osh.value = readObjectKey( is ) ;
    }

    public OldPOAObjectKeyTemplate( ORB orb, int magic, int scid, int serverid,
        int orbid, int poaid)
    {
        super( orb, magic, scid, serverid,
            Integer.toString( orbid ),
            new ObjectAdapterIdNumber( poaid ) ) ;
    }

    public void writeTemplate(OutputStream os)
    {
        os.write_long( getMagic() ) ;
        os.write_long( getSubcontractId() ) ;
        os.write_long( getServerId() ) ;

        int orbid = Integer.parseInt( getORBId() ) ;
        os.write_long( orbid ) ;

        ObjectAdapterIdNumber oaid = (ObjectAdapterIdNumber)(getObjectAdapterId()) ;
        int poaid = oaid.getOldPOAId()  ;
        os.write_long( poaid ) ;
    }

    public ORBVersion getORBVersion()
    {
        if (getMagic() == ObjectKeyFactoryImpl.JAVAMAGIC_OLD)
            return ORBVersionFactory.getOLD() ;
        else if (getMagic() == ObjectKeyFactoryImpl.JAVAMAGIC_NEW)
            return ORBVersionFactory.getNEW() ;
        else
            throw new INTERNAL() ;
    }
}
