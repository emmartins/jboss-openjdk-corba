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

import java.util.Vector;

import org.omg.CORBA.Any;
import org.omg.CORBA.Bounds;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;

import org.jboss.com.sun.corba.se.spi.orb.ORB ;

public class NVListImpl extends NVList
{
    private final int    INITIAL_CAPACITY       = 4;
    private final int    CAPACITY_INCREMENT     = 2;

    private Vector _namedValues;
    private ORB orb;

    public NVListImpl(ORB orb)
    {
        // Note: This orb could be an instanceof ORBSingleton or ORB
        this.orb = orb;
        _namedValues = new Vector(INITIAL_CAPACITY, CAPACITY_INCREMENT);
    }

    public NVListImpl(ORB orb, int size)
    {
        this.orb = orb;

        // Note: the size arg is only a hint of the size of the NVList.
        _namedValues = new Vector(size);
    }


    public int count()
    {
        return _namedValues.size();
    }

    public NamedValue add(int flags)
    {
        NamedValue tmpVal = new NamedValueImpl(orb, "", new AnyImpl(orb), flags);
        _namedValues.addElement(tmpVal);
        return tmpVal;
    }

    public NamedValue add_item(String itemName, int flags)
    {
        NamedValue tmpVal = new NamedValueImpl(orb, itemName, new AnyImpl(orb),
                                               flags);
        _namedValues.addElement(tmpVal);
        return tmpVal;
    }

    public NamedValue add_value(String itemName, Any val, int flags)
    {
        NamedValue tmpVal = new NamedValueImpl(orb, itemName, val, flags);
        _namedValues.addElement(tmpVal);
        return tmpVal;
    }

    public NamedValue item(int index)
        throws Bounds
    {
        try {
            return (NamedValue) _namedValues.elementAt(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Bounds();
        }
    }

    public void remove(int index)
        throws Bounds
    {
        try {
            _namedValues.removeElementAt(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Bounds();
        }
    }
}
