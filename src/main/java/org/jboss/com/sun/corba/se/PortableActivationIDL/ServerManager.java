package org.jboss.com.sun.corba.se.PortableActivationIDL;


/**
* org.jboss.com.sun.corba/se/PortableActivationIDL/ServerManager.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/PortableActivationIDL/activation.idl
* Monday, November 5, 2012 3:44:56 AM WET
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public interface ServerManager extends ServerManagerOperations, org.jboss.com.sun.corba.se.PortableActivationIDL.Activator, org.jboss.com.sun.corba.se.PortableActivationIDL.Locator
{
} // interface ServerManager
