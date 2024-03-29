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

package org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders;


/**
* org.jboss.com.sun.corba/se/impl/protocol/giopmsgheaders/TargetAddress.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../../../src/share/classes/org.jboss.com.sun.corba/se/GiopIDL/g.idl
* Sunday, June 4, 2000 5:18:54 PM PDT
*/

public final class TargetAddress implements org.omg.CORBA.portable.IDLEntity
{
  private byte[] ___object_key;
  private org.omg.IOP.TaggedProfile ___profile;
  private org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.IORAddressingInfo ___ior;
  private short __discriminator;
  private boolean __uninitialized = true;

  public TargetAddress ()
  {
  }

  public short discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public byte[] object_key ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyobject_key (__discriminator);
    return ___object_key;
  }

  public void object_key (byte[] value)
  {
    __discriminator = org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.KeyAddr.value;
    ___object_key = value;
    __uninitialized = false;
  }

  private void verifyobject_key (short discriminator)
  {
    if (discriminator != org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.KeyAddr.value)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public org.omg.IOP.TaggedProfile profile ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyprofile (__discriminator);
    return ___profile;
  }

  public void profile (org.omg.IOP.TaggedProfile value)
  {
    __discriminator = org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.ProfileAddr.value;
    ___profile = value;
    __uninitialized = false;
  }

  private void verifyprofile (short discriminator)
  {
    if (discriminator != org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.ProfileAddr.value)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.IORAddressingInfo ior ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyior (__discriminator);
    return ___ior;
  }

  public void ior (org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.IORAddressingInfo value)
  {
    __discriminator = org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.ReferenceAddr.value;
    ___ior = value;
    __uninitialized = false;
  }

  private void verifyior (short discriminator)
  {
    if (discriminator != org.jboss.com.sun.corba.se.impl.protocol.giopmsgheaders.ReferenceAddr.value)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public void _default ()
  {
    __discriminator = -32768;
    __uninitialized = false;
  }

} // class TargetAddress
