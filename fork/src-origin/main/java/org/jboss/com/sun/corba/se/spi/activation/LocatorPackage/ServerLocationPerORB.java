package org.jboss.com.sun.corba.se.spi.activation.LocatorPackage;


/**
* org.jboss.com.sun.corba/se/spi/activation/LocatorPackage/ServerLocationPerORB.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:53 AM WET
*/

public final class ServerLocationPerORB implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public org.jboss.com.sun.corba.se.spi.activation.EndPointInfo ports[] = null;

  public ServerLocationPerORB ()
  {
  } // ctor

  public ServerLocationPerORB (String _hostname, org.jboss.com.sun.corba.se.spi.activation.EndPointInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocationPerORB
