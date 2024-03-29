package org.jboss.com.sun.corba.se.spi.activation;


/**
* org.jboss.com.sun.corba/se/spi/activation/ServerManagerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:53 AM WET
*/

abstract public class ServerManagerHelper
{
  private static String  _id = "IDL:activation/ServerManager:1.0";

  public static void insert (org.omg.CORBA.Any a, org.jboss.com.sun.corba.se.spi.activation.ServerManager that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.jboss.com.sun.corba.se.spi.activation.ServerManager extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.jboss.com.sun.corba.se.spi.activation.ServerManagerHelper.id (), "ServerManager");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.jboss.com.sun.corba.se.spi.activation.ServerManager read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServerManagerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.jboss.com.sun.corba.se.spi.activation.ServerManager value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.jboss.com.sun.corba.se.spi.activation.ServerManager narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.jboss.com.sun.corba.se.spi.activation.ServerManager)
      return (org.jboss.com.sun.corba.se.spi.activation.ServerManager)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.jboss.com.sun.corba.se.spi.activation._ServerManagerStub stub = new org.jboss.com.sun.corba.se.spi.activation._ServerManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.jboss.com.sun.corba.se.spi.activation.ServerManager unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.jboss.com.sun.corba.se.spi.activation.ServerManager)
      return (org.jboss.com.sun.corba.se.spi.activation.ServerManager)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.jboss.com.sun.corba.se.spi.activation._ServerManagerStub stub = new org.jboss.com.sun.corba.se.spi.activation._ServerManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
