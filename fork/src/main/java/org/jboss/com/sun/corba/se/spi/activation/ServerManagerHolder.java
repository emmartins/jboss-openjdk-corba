package org.jboss.com.sun.corba.se.spi.activation;

/**
* org.jboss.com.sun.corba/se/spi/activation/ServerManagerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:53 AM WET
*/

public final class ServerManagerHolder implements org.omg.CORBA.portable.Streamable
{
  public org.jboss.com.sun.corba.se.spi.activation.ServerManager value = null;

  public ServerManagerHolder ()
  {
  }

  public ServerManagerHolder (org.jboss.com.sun.corba.se.spi.activation.ServerManager initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jboss.com.sun.corba.se.spi.activation.ServerManagerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jboss.com.sun.corba.se.spi.activation.ServerManagerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jboss.com.sun.corba.se.spi.activation.ServerManagerHelper.type ();
  }

}