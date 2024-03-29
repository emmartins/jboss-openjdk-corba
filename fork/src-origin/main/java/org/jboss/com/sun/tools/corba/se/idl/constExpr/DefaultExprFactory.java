/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
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
 * COMPONENT_NAME: idl.parser
 *
 * ORIGINS: 27
 *
 * Licensed Materials - Property of IBM
 * 5639-D57 (C) COPYRIGHT International Business Machines Corp. 1997, 1999
 * RMI-IIOP v1.0
 *
 */

package org.jboss.com.sun.tools.corba.se.idl.constExpr;

// NOTES:

import org.jboss.com.sun.tools.corba.se.idl.ConstEntry;
import java.math.BigInteger;

public class DefaultExprFactory implements ExprFactory
{
  public And and (Expression left, Expression right)
  {
    return new And (left, right);
  } // and

  public BooleanAnd booleanAnd (Expression left, Expression right)
  {
    return new BooleanAnd (left, right);
  } // booleanAnd

  public BooleanNot booleanNot (Expression operand)
  {
    return new BooleanNot (operand);
  } // booleanNot

  public BooleanOr booleanOr (Expression left, Expression right)
  {
    return new BooleanOr (left, right);
  } // booleanOr

  public Divide divide (Expression left, Expression right)
  {
    return new Divide (left, right);
  } // divide

  public Equal equal (Expression left, Expression right)
  {
    return new Equal (left, right);
  } // equal

  public GreaterEqual greaterEqual (Expression left, Expression right)
  {
    return new GreaterEqual (left, right);
  } // greaterEqual

  public GreaterThan greaterThan (Expression left, Expression right)
  {
    return new GreaterThan (left, right);
  } // greaterThan

  public LessEqual lessEqual (Expression left, Expression right)
  {
    return new LessEqual (left, right);
  } // lessEqual

  public LessThan lessThan (Expression left, Expression right)
  {
    return new LessThan (left, right);
  } // lessThan

  public Minus minus (Expression left, Expression right)
  {
    return new Minus (left, right);
  } // minus

  public Modulo modulo (Expression left, Expression right)
  {
    return new Modulo (left, right);
  } // modulo

  public Negative negative (Expression operand)
  {
    return new Negative (operand);
  } // negative

  public Not not (Expression operand)
  {
    return new Not (operand);
  } // not

  public NotEqual notEqual (Expression left, Expression right)
  {
    return new NotEqual (left, right);
  } // notEqual

  public Or or (Expression left, Expression right)
  {
    return new Or (left, right);
  } // or

  public Plus plus (Expression left, Expression right)
  {
    return new Plus (left, right);
  } // plus

  public Positive positive (Expression operand)
  {
    return new Positive (operand);
  } // positive

  public ShiftLeft shiftLeft (Expression left, Expression right)
  {
    return new ShiftLeft (left, right);
  } // shiftLeft

  public ShiftRight shiftRight (Expression left, Expression right)
  {
    return new ShiftRight (left, right);
  } // shiftRight

  public Terminal terminal (String representation, Character charValue,
    boolean isWide )
  {
    return new Terminal (representation, charValue, isWide );
  } // ctor

  public Terminal terminal (String representation, Boolean booleanValue)
  {
    return new Terminal (representation, booleanValue);
  } // ctor

  // Support long long <daz>
  public Terminal terminal (String representation, BigInteger bigIntegerValue)
  {
    return new Terminal (representation, bigIntegerValue);
  } // ctor

  //daz  public Terminal terminal (String representation, Long longValue)
  //       {
  //       return new Terminal (representation, longValue);
  //       } // ctor

  public Terminal terminal (String representation, Double doubleValue)
  {
    return new Terminal (representation, doubleValue);
  } // ctor

  public Terminal terminal (String stringValue, boolean isWide )
  {
    return new Terminal (stringValue, isWide);
  } // ctor

  public Terminal terminal (ConstEntry constReference)
  {
    return new Terminal (constReference);
  } // ctor

  public Times times (Expression left, Expression right)
  {
    return new Times (left, right);
  } // times

  public Xor xor (Expression left, Expression right)
  {
    return new Xor (left, right);
  } // xor
} // class DefaultExprFactory
