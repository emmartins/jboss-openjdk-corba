package org.jboss.com.sun.corba.se.spi.activation;


/**
* org.jboss.com.sun.corba/se/spi/activation/ServerNotRegistered.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:52 AM WET
*/

public final class ServerNotRegistered extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerNotRegistered ()
  {
    super(ServerNotRegisteredHelper.id());
  } // ctor

  public ServerNotRegistered (int _serverId)
  {
    super(ServerNotRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotRegistered (String $reason, int _serverId)
  {
    super(ServerNotRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotRegistered
