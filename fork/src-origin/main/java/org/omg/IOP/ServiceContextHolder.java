package org.omg.IOP;

/**
* org/omg/IOP/ServiceContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, November 5, 2012 3:41:50 AM WET
*/

public final class ServiceContextHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.ServiceContext value = null;

  public ServiceContextHolder ()
  {
  }

  public ServiceContextHolder (org.omg.IOP.ServiceContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.ServiceContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.ServiceContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.ServiceContextHelper.type ();
  }

}
