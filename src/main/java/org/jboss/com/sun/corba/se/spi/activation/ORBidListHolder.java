package org.jboss.com.sun.corba.se.spi.activation;


/**
* org.jboss.com.sun.corba/se/spi/activation/ORBidListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:52 AM WET
*/

public final class ORBidListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ORBidListHolder ()
  {
  }

  public ORBidListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jboss.com.sun.corba.se.spi.activation.ORBidListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jboss.com.sun.corba.se.spi.activation.ORBidListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jboss.com.sun.corba.se.spi.activation.ORBidListHelper.type ();
  }

}
