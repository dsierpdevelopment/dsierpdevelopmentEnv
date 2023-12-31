/**
 * ACTAtekAgentLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hectrix.www.ACTAtekAgent_service;

public class ACTAtekAgentLocator extends org.apache.axis.client.Service implements com.hectrix.www.ACTAtekAgent_service.ACTAtekAgent {

private static final long serialVersionUID = 1L;

/**
 * WebService API for ACTAtek Agent
 */

    public ACTAtekAgentLocator() {
    }


    public ACTAtekAgentLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ACTAtekAgentLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ACTAtekAgent
    private java.lang.String ACTAtekAgent_address = "http://www.hectrix.com/ACTAtekAgent.wsdl";

    public java.lang.String getACTAtekAgentAddress() {
        return ACTAtekAgent_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ACTAtekAgentWSDDServiceName = "ACTAtekAgent";

    public java.lang.String getACTAtekAgentWSDDServiceName() {
        return ACTAtekAgentWSDDServiceName;
    }

    public void setACTAtekAgentWSDDServiceName(java.lang.String name) {
        ACTAtekAgentWSDDServiceName = name;
    }

    public com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentPortType getACTAtekAgent() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ACTAtekAgent_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getACTAtekAgent(endpoint);
    }

    public com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentPortType getACTAtekAgent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentStub _stub = new com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentStub(portAddress, this);
            _stub.setPortName(getACTAtekAgentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setACTAtekAgentEndpointAddress(java.lang.String address) {
        ACTAtekAgent_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentStub _stub = new com.hectrix.www.ACTAtekAgent_service.ACTAtekAgentStub(new java.net.URL(ACTAtekAgent_address), this);
                _stub.setPortName(getACTAtekAgentWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ACTAtekAgent".equals(inputPortName)) {
            return getACTAtekAgent();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.hectrix.com/ACTAtekAgent.service", "ACTAtekAgent");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.hectrix.com/ACTAtekAgent.service", "ACTAtekAgent"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ACTAtekAgent".equals(portName)) {
            setACTAtekAgentEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
