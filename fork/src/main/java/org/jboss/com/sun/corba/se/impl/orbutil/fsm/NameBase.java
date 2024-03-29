/*
 * Copyright (c) 2002, 2003, Oracle and/or its affiliates. All rights reserved.
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

package org.jboss.com.sun.corba.se.impl.orbutil.fsm ;

import org.jboss.com.sun.corba.se.spi.orbutil.fsm.Action ;
import org.jboss.com.sun.corba.se.spi.orbutil.fsm.State ;
import org.jboss.com.sun.corba.se.spi.orbutil.fsm.Guard ;
import org.jboss.com.sun.corba.se.spi.orbutil.fsm.Input ;

import java.util.StringTokenizer ;

public class NameBase {
    private String name ;
    private String toStringName ;

    // Return just the name of the class, not the full qualified name.
    private String getClassName()
    {
        String fqn = this.getClass().getName() ;
        StringTokenizer st = new StringTokenizer( fqn, "." ) ;
        String token = st.nextToken() ;
        while (st.hasMoreTokens())
            token = st.nextToken() ;
        return token ;
    }

    private String getPreferredClassName()
    {
        if (this instanceof Action)
            return "Action" ;
        if (this instanceof State)
            return "State" ;
        if (this instanceof Guard)
            return "Guard" ;
        if (this instanceof Input)
            return "Input" ;
        return getClassName() ;
    }

    public NameBase( String name )
    {
        this.name = name ;
        toStringName = getPreferredClassName() + "[" + name + "]" ;
    }

    public String getName()
    {
        return name ;
    }

    public String toString() {
        return toStringName ;
    }
}
