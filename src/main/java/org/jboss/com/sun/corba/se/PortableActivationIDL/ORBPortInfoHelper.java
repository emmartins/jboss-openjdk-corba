package org.jboss.com.sun.corba.se.PortableActivationIDL;


/**
* org.jboss.com.sun.corba/se/PortableActivationIDL/ORBPortInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/PortableActivationIDL/activation.idl
* Monday, November 5, 2012 3:44:56 AM WET
*/

abstract public class ORBPortInfoHelper
{
  private static String  _id = "IDL:PortableActivationIDL/ORBPortInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfo extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.PortableInterceptor.ORBIdHelper.id (), "ORBId", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "orbId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.jboss.com.sun.corba.se.PortableActivationIDL.TCPPortHelper.id (), "TCPPort", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "port",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.id (), "ORBPortInfo", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfo value = new org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfo ();
    value.orbId = istream.read_string ();
    value.port = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.jboss.com.sun.corba.se.PortableActivationIDL.ORBPortInfo value)
  {
    ostream.write_string (value.orbId);
    ostream.write_long (value.port);
  }

}
