package org.jboss.com.sun.corba.se.spi.activation;

/**
* org.jboss.com.sun.corba/se/spi/activation/ServerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:52 AM WET
*/


/** Server callback API, passed to Activator in active method.
    */
public final class ServerHolder implements org.omg.CORBA.portable.Streamable
{
  public org.jboss.com.sun.corba.se.spi.activation.Server value = null;

  public ServerHolder ()
  {
  }

  public ServerHolder (org.jboss.com.sun.corba.se.spi.activation.Server initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jboss.com.sun.corba.se.spi.activation.ServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jboss.com.sun.corba.se.spi.activation.ServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jboss.com.sun.corba.se.spi.activation.ServerHelper.type ();
  }

}
