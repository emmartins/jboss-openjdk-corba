package org.jboss.com.sun.corba.se.PortableActivationIDL;

/**
* org.jboss.com.sun.corba/se/PortableActivationIDL/NoSuchEndPointHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/PortableActivationIDL/activation.idl
* Monday, November 5, 2012 3:44:56 AM WET
*/

public final class NoSuchEndPointHolder implements org.omg.CORBA.portable.Streamable
{
  public org.jboss.com.sun.corba.se.PortableActivationIDL.NoSuchEndPoint value = null;

  public NoSuchEndPointHolder ()
  {
  }

  public NoSuchEndPointHolder (org.jboss.com.sun.corba.se.PortableActivationIDL.NoSuchEndPoint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jboss.com.sun.corba.se.PortableActivationIDL.NoSuchEndPointHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jboss.com.sun.corba.se.PortableActivationIDL.NoSuchEndPointHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jboss.com.sun.corba.se.PortableActivationIDL.NoSuchEndPointHelper.type ();
  }

}
