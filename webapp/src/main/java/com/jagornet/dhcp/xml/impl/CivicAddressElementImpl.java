/*
 * XML Type:  civicAddressElement
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.CivicAddressElement
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML civicAddressElement(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class CivicAddressElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.CivicAddressElement
{
    private static final long serialVersionUID = 1L;
    
    public CivicAddressElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATYPE$0 = 
        new javax.xml.namespace.QName("", "caType");
    private static final javax.xml.namespace.QName CAVALUE$2 = 
        new javax.xml.namespace.QName("", "caValue");
    
    
    /**
     * Gets the "caType" element
     */
    public short getCaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATYPE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "caType" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CATYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "caType" element
     */
    public void setCaType(short caType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATYPE$0);
            }
            target.setShortValue(caType);
        }
    }
    
    /**
     * Sets (as xml) the "caType" element
     */
    public void xsetCaType(org.apache.xmlbeans.XmlUnsignedByte caType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CATYPE$0);
            }
            target.set(caType);
        }
    }
    
    /**
     * Gets the "caValue" element
     */
    public java.lang.String getCaValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caValue" element
     */
    public org.apache.xmlbeans.XmlString xgetCaValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "caValue" element
     */
    public void setCaValue(java.lang.String caValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAVALUE$2);
            }
            target.setStringValue(caValue);
        }
    }
    
    /**
     * Sets (as xml) the "caValue" element
     */
    public void xsetCaValue(org.apache.xmlbeans.XmlString caValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAVALUE$2);
            }
            target.set(caValue);
        }
    }
}
