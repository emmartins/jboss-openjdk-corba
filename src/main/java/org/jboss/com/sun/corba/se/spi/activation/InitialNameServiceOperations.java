package org.jboss.com.sun.corba.se.spi.activation;


/**
* org.jboss.com.sun.corba/se/spi/activation/InitialNameServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org.jboss.com.sun.corba/se/spi/activation/activation.idl
* Monday, November 5, 2012 3:44:53 AM WET
*/

public interface InitialNameServiceOperations 
{

  // bind initial name
  void bind (String name, org.omg.CORBA.Object obj, boolean isPersistant) throws org.jboss.com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound;
} // interface InitialNameServiceOperations
