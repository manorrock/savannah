/*
 * XML Type:  v6IaPdOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6IaPdOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6IaPdOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6IaPdOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6IaPdOption
{
    private static final long serialVersionUID = 1L;
    
    public V6IaPdOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IAID$0 = 
        new javax.xml.namespace.QName("", "iaId");
    private static final javax.xml.namespace.QName T1$2 = 
        new javax.xml.namespace.QName("", "t1");
    private static final javax.xml.namespace.QName T2$4 = 
        new javax.xml.namespace.QName("", "t2");
    private static final javax.xml.namespace.QName CONFIGOPTIONS$6 = 
        new javax.xml.namespace.QName("", "configOptions");
    private static final javax.xml.namespace.QName IAPREFIXOPTIONLIST$8 = 
        new javax.xml.namespace.QName("", "iaPrefixOptionList");
    private static final javax.xml.namespace.QName CODE$10 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "iaId" element
     */
    public long getIaId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IAID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "iaId" element
     */
    public com.jagornet.dhcp.xml.IaId xgetIaId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IaId target = null;
            target = (com.jagornet.dhcp.xml.IaId)get_store().find_element_user(IAID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "iaId" element
     */
    public void setIaId(long iaId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IAID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IAID$0);
            }
            target.setLongValue(iaId);
        }
    }
    
    /**
     * Sets (as xml) the "iaId" element
     */
    public void xsetIaId(com.jagornet.dhcp.xml.IaId iaId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.IaId target = null;
            target = (com.jagornet.dhcp.xml.IaId)get_store().find_element_user(IAID$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.IaId)get_store().add_element_user(IAID$0);
            }
            target.set(iaId);
        }
    }
    
    /**
     * Gets the "t1" element
     */
    public long getT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T1$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "t1" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(T1$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "t1" element
     */
    public void setT1(long t1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(T1$2);
            }
            target.setLongValue(t1);
        }
    }
    
    /**
     * Sets (as xml) the "t1" element
     */
    public void xsetT1(org.apache.xmlbeans.XmlUnsignedInt t1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(T1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(T1$2);
            }
            target.set(t1);
        }
    }
    
    /**
     * Gets the "t2" element
     */
    public long getT2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T2$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "t2" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetT2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(T2$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "t2" element
     */
    public void setT2(long t2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(T2$4);
            }
            target.setLongValue(t2);
        }
    }
    
    /**
     * Sets (as xml) the "t2" element
     */
    public void xsetT2(org.apache.xmlbeans.XmlUnsignedInt t2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(T2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(T2$4);
            }
            target.set(t2);
        }
    }
    
    /**
     * Gets the "configOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(CONFIGOPTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configOptions" element
     */
    public void setConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType configOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(CONFIGOPTIONS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(CONFIGOPTIONS$6);
            }
            target.set(configOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "configOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(CONFIGOPTIONS$6);
            return target;
        }
    }
    
    /**
     * Gets the "iaPrefixOptionList" element
     */
    public com.jagornet.dhcp.xml.V6IaPrefixOptionListType getIaPrefixOptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOptionListType target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOptionListType)get_store().find_element_user(IAPREFIXOPTIONLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "iaPrefixOptionList" element
     */
    public void setIaPrefixOptionList(com.jagornet.dhcp.xml.V6IaPrefixOptionListType iaPrefixOptionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOptionListType target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOptionListType)get_store().find_element_user(IAPREFIXOPTIONLIST$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6IaPrefixOptionListType)get_store().add_element_user(IAPREFIXOPTIONLIST$8);
            }
            target.set(iaPrefixOptionList);
        }
    }
    
    /**
     * Appends and returns a new empty "iaPrefixOptionList" element
     */
    public com.jagornet.dhcp.xml.V6IaPrefixOptionListType addNewIaPrefixOptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOptionListType target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOptionListType)get_store().add_element_user(IAPREFIXOPTIONLIST$8);
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
