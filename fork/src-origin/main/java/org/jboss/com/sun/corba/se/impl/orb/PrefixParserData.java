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

package org.jboss.com.sun.corba.se.impl.orb ;

import java.util.Properties ;

import org.jboss.com.sun.corba.se.spi.orb.StringPair ;
import org.jboss.com.sun.corba.se.spi.orb.Operation ;
import org.jboss.com.sun.corba.se.spi.orb.PropertyParser ;

public class PrefixParserData extends ParserDataBase {

    private StringPair[] testData ;
    private Class componentType ;

    public PrefixParserData( String  propertyName,
        Operation operation, String fieldName, Object defaultValue,
        Object testValue, StringPair[] testData, Class componentType )
    {
        super( propertyName, operation, fieldName, defaultValue, testValue ) ;
        this.testData = testData ;
        this.componentType = componentType ;
    }

    public void addToParser( PropertyParser parser )
    {
        parser.addPrefix( getPropertyName(), getOperation(), getFieldName(),
            componentType ) ;
    }

    public void addToProperties( Properties props )
    {
        for (int ctr=0; ctr<testData.length; ctr++) {
            StringPair sp = testData[ctr] ;

            String propName = getPropertyName() ;
            if (propName.charAt( propName.length() - 1 ) != '.')
                propName += "." ;

            props.setProperty( propName + sp.getFirst(), sp.getSecond() ) ;
        }
    }
}
