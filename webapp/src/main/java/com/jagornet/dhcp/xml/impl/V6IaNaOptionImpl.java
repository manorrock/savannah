/*
 * XML Type:  v6IaNaOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6IaNaOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6IaNaOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6IaNaOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6IaNaOption
{
    private static final long serialVersionUID = 1L;
    
    public V6IaNaOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IAID$0 = 
        new javax.xml.namespace.QName("", "iaId");
    private static final javax.xml.namespace.QName T1$2 = 
        new javax.xml.namespace.QName("", "t1");
    private static final javax.xml.namespace.QName T2$4 = 
        new javax.xml.namespace.QName("", "t2");
    private static final javax.xml.namespace.QName IACONFIGOPTIONS$6 = 
        new javax.xml.namespace.QName("", "iaConfigOptions");
    private static final javax.xml.namespace.QName ADDRCONFIGOPTIONS$8 = 
        new javax.xml.namespace.QName("", "addrConfigOptions");
    private static final javax.xml.namespace.QName IAADDROPTIONLIST$10 = 
        new javax.xml.namespace.QName("", "iaAddrOptionList");
    private static final javax.xml.namespace.QName CODE$12 = 
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
     * Gets the "iaConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getIaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(IACONFIGOPTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "iaConfigOptions" element
     */
    public void setIaConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType iaConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(IACONFIGOPTIONS$6, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(IACONFIGOPTIONS$6);
            }
            target.set(iaConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "iaConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewIaConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(IACONFIGOPTIONS$6);
            return target;
        }
    }
    
    /**
     * Gets the "addrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType getAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addrConfigOptions" element
     */
    public void setAddrConfigOptions(com.jagornet.dhcp.xml.V6ConfigOptionsType addrConfigOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().find_element_user(ADDRCONFIGOPTIONS$8, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$8);
            }
            target.set(addrConfigOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "addrConfigOptions" element
     */
    public com.jagornet.dhcp.xml.V6ConfigOptionsType addNewAddrConfigOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6ConfigOptionsType target = null;
            target = (com.jagornet.dhcp.xml.V6ConfigOptionsType)get_store().add_element_user(ADDRCONFIGOPTIONS$8);
            return target;
        }
    }
    
    /**
     * Gets the "iaAddrOptionList" element
     */
    public com.jagornet.dhcp.xml.V6IaAddrOptionListType getIaAddrOptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOptionListType target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOptionListType)get_store().find_element_user(IAADDROPTIONLIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "iaAddrOptionList" element
     */
    public void setIaAddrOptionList(com.jagornet.dhcp.xml.V6IaAddrOptionListType iaAddrOptionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOptionListType target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOptionListType)get_store().find_element_user(IAADDROPTIONLIST$10, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6IaAddrOptionListType)get_store().add_element_user(IAADDROPTIONLIST$10);
            }
            target.set(iaAddrOptionList);
        }
    }
    
    /**
     * Appends and returns a new empty "iaAddrOptionList" element
     */
    public com.jagornet.dhcp.xml.V6IaAddrOptionListType addNewIaAddrOptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOptionListType target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOptionListType)get_store().add_element_user(IAADDROPTIONLIST$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$12);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$12);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_default_attribute_value(CODE$12);
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
            return get_store().find_attribute_user(CODE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$12);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$12);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$12);
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
            get_store().remove_attribute(CODE$12);
        }
    }
}
