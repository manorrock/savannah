/*
 * XML Type:  opaqueDataOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.OpaqueDataOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML opaqueDataOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class OpaqueDataOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.OpaqueDataOptionType
{
    private static final long serialVersionUID = 1L;
    
    public OpaqueDataOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPAQUEDATA$0 = 
        new javax.xml.namespace.QName("", "opaqueData");
    
    
    /**
     * Gets the "opaqueData" element
     */
    public com.jagornet.dhcp.xml.OpaqueData getOpaqueData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(OPAQUEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "opaqueData" element
     */
    public void setOpaqueData(com.jagornet.dhcp.xml.OpaqueData opaqueData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(OPAQUEDATA$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(OPAQUEDATA$0);
            }
            target.set(opaqueData);
        }
    }
    
    /**
     * Appends and returns a new empty "opaqueData" element
     */
    public com.jagornet.dhcp.xml.OpaqueData addNewOpaqueData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(OPAQUEDATA$0);
            return target;
        }
    }
}
