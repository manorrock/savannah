/*
 * XML Type:  v6AuthenticationOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6AuthenticationOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6AuthenticationOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6AuthenticationOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6AuthenticationOption
{
    private static final long serialVersionUID = 1L;
    
    public V6AuthenticationOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTOCOL$0 = 
        new javax.xml.namespace.QName("", "protocol");
    private static final javax.xml.namespace.QName ALGORITHM$2 = 
        new javax.xml.namespace.QName("", "algorithm");
    private static final javax.xml.namespace.QName RDM$4 = 
        new javax.xml.namespace.QName("", "rdm");
    private static final javax.xml.namespace.QName REPLAYDETECTION$6 = 
        new javax.xml.namespace.QName("", "replayDetection");
    private static final javax.xml.namespace.QName AUTHINFO$8 = 
        new javax.xml.namespace.QName("", "authInfo");
    private static final javax.xml.namespace.QName CODE$10 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "protocol" element
     */
    public short getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "protocol" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PROTOCOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "protocol" element
     */
    public void setProtocol(short protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTOCOL$0);
            }
            target.setShortValue(protocol);
        }
    }
    
    /**
     * Sets (as xml) the "protocol" element
     */
    public void xsetProtocol(org.apache.xmlbeans.XmlUnsignedByte protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(PROTOCOL$0);
            }
            target.set(protocol);
        }
    }
    
    /**
     * Gets the "algorithm" element
     */
    public short getAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALGORITHM$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "algorithm" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(ALGORITHM$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "algorithm" element
     */
    public void setAlgorithm(short algorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALGORITHM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALGORITHM$2);
            }
            target.setShortValue(algorithm);
        }
    }
    
    /**
     * Sets (as xml) the "algorithm" element
     */
    public void xsetAlgorithm(org.apache.xmlbeans.XmlUnsignedByte algorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(ALGORITHM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(ALGORITHM$2);
            }
            target.set(algorithm);
        }
    }
    
    /**
     * Gets the "rdm" element
     */
    public short getRdm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RDM$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "rdm" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetRdm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(RDM$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rdm" element
     */
    public void setRdm(short rdm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RDM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RDM$4);
            }
            target.setShortValue(rdm);
        }
    }
    
    /**
     * Sets (as xml) the "rdm" element
     */
    public void xsetRdm(org.apache.xmlbeans.XmlUnsignedByte rdm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(RDM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(RDM$4);
            }
            target.set(rdm);
        }
    }
    
    /**
     * Gets the "replayDetection" element
     */
    public java.math.BigInteger getReplayDetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLAYDETECTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "replayDetection" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong xgetReplayDetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(REPLAYDETECTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "replayDetection" element
     */
    public void setReplayDetection(java.math.BigInteger replayDetection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLAYDETECTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLAYDETECTION$6);
            }
            target.setBigIntegerValue(replayDetection);
        }
    }
    
    /**
     * Sets (as xml) the "replayDetection" element
     */
    public void xsetReplayDetection(org.apache.xmlbeans.XmlUnsignedLong replayDetection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(REPLAYDETECTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(REPLAYDETECTION$6);
            }
            target.set(replayDetection);
        }
    }
    
    /**
     * Gets the "authInfo" element
     */
    public com.jagornet.dhcp.xml.OpaqueData getAuthInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(AUTHINFO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authInfo" element
     */
    public void setAuthInfo(com.jagornet.dhcp.xml.OpaqueData authInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(AUTHINFO$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(AUTHINFO$8);
            }
            target.set(authInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "authInfo" element
     */
    public com.jagornet.dhcp.xml.OpaqueData addNewAuthInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(AUTHINFO$8);
            return target;
        }
    }
    
    /**
     * Gets the "code" attribute
     */
    public int getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$10);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" attribute
     */
    public com.jagornet.dhcp.xml.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Code target = null;
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_default_attribute_value(CODE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$10) != null;
        }
    }
    
    /**
     * Sets the "code" attribute
     */
    public void setCode(int code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$10);
            }
            target.setIntValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" attribute
     */
    public void xsetCode(com.jagornet.dhcp.xml.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Code target = null;
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$10);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$10);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$10);
        }
    }
}
