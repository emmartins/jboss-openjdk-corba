package org.jboss.com.sun.corba.se.spi.activation;


/**
* org.jboss.com.sun.corba/se/spi/activation/EndpointInfoListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:52 AM WET
*/

abstract public class EndpointInfoListHelper
{
  private static String  _id = "IDL:activation/EndpointInfoList:1.0";

  public static void insert (org.omg.CORBA.Any a, org.jboss.com.sun.corba.se.spi.activation.EndPointInfo[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.jboss.com.sun.corba.se.spi.activation.EndPointInfo[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.jboss.com.sun.corba.se.spi.activation.EndPointInfoHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.jboss.com.sun.corba.se.spi.activation.EndpointInfoListHelper.id (), "EndpointInfoList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.jboss.com.sun.corba.se.spi.activation.EndPointInfo[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.jboss.com.sun.corba.se.spi.activation.EndPointInfo value[] = null;
    int _len0 = istream.read_long ();
    value = new org.jboss.com.sun.corba.se.spi.activation.EndPointInfo[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.jboss.com.sun.corba.se.spi.activation.EndPointInfoHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.jboss.com.sun.corba.se.spi.activation.EndPointInfo[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.jboss.com.sun.corba.se.spi.activation.EndPointInfoHelper.write (ostream, value[_i0]);
  }

}
