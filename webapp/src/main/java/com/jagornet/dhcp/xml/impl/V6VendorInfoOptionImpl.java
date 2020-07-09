/*
 * XML Type:  v6VendorInfoOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6VendorInfoOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6VendorInfoOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6VendorInfoOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6VendorInfoOption
{
    private static final long serialVersionUID = 1L;
    
    public V6VendorInfoOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTERPRISENUMBER$0 = 
        new javax.xml.namespace.QName("", "enterpriseNumber");
    private static final javax.xml.namespace.QName SUBOPTIONLIST$2 = 
        new javax.xml.namespace.QName("", "suboptionList");
    private static final javax.xml.namespace.QName CODE$4 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "enterpriseNumber" element
     */
    public long getEnterpriseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTERPRISENUMBER$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "enterpriseNumber" element
     */
    public com.jagornet.dhcp.xml.EnterpriseNumber xgetEnterpriseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.EnterpriseNumber target = null;
            target = (com.jagornet.dhcp.xml.EnterpriseNumber)get_store().find_element_user(ENTERPRISENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "enterpriseNumber" element
     */
    public void setEnterpriseNumber(long enterpriseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTERPRISENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTERPRISENUMBER$0);
            }
            target.setLongValue(enterpriseNumber);
        }
    }
    
    /**
     * Sets (as xml) the "enterpriseNumber" element
     */
    public void xsetEnterpriseNumber(com.jagornet.dhcp.xml.EnterpriseNumber enterpriseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.EnterpriseNumber target = null;
            target = (com.jagornet.dhcp.xml.EnterpriseNumber)get_store().find_element_user(ENTERPRISENUMBER$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.EnterpriseNumber)get_store().add_element_user(ENTERPRISENUMBER$0);
            }
            target.set(enterpriseNumber);
        }
    }
    
    /**
     * Gets the "suboptionList" element
     */
    public com.jagornet.dhcp.xml.GenericOptionsType getSuboptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().find_element_user(SUBOPTIONLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "suboptionList" element
     */
    public void setSuboptionList(com.jagornet.dhcp.xml.GenericOptionsType suboptionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().find_element_user(SUBOPTIONLIST$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().add_element_user(SUBOPTIONLIST$2);
            }
            target.set(suboptionList);
        }
    }
    
    /**
     * Appends and returns a new empty "suboptionList" element
     */
    public com.jagornet.dhcp.xml.GenericOptionsType addNewSuboptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.GenericOptionsType target = null;
            target = (com.jagornet.dhcp.xml.GenericOptionsType)get_store().add_element_user(SUBOPTIONLIST$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$4);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_default_attribute_value(CODE$4);
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
            return get_store().find_attribute_user(CODE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$4);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$4);
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
            get_store().remove_attribute(CODE$4);
        }
    }
}
