/*
 * XML Type:  filterExpression
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.FilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML filterExpression(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class FilterExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.FilterExpression
{
    private static final long serialVersionUID = 1L;
    
    public FilterExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTCLASSEXPRESSION$0 = 
        new javax.xml.namespace.QName("", "clientClassExpression");
    private static final javax.xml.namespace.QName OPTIONEXPRESSION$2 = 
        new javax.xml.namespace.QName("", "optionExpression");
    private static final javax.xml.namespace.QName CUSTOMEXPRESSION$4 = 
        new javax.xml.namespace.QName("", "customExpression");
    
    
    /**
     * Gets the "clientClassExpression" element
     */
    public com.jagornet.dhcp.xml.ClientClassExpression getClientClassExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.ClientClassExpression target = null;
            target = (com.jagornet.dhcp.xml.ClientClassExpression)get_store().find_element_user(CLIENTCLASSEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clientClassExpression" element
     */
    public boolean isSetClientClassExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTCLASSEXPRESSION$0) != 0;
        }
    }
    
    /**
     * Sets the "clientClassExpression" element
     */
    public void setClientClassExpression(com.jagornet.dhcp.xml.ClientClassExpression clientClassExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.ClientClassExpression target = null;
            target = (com.jagornet.dhcp.xml.ClientClassExpression)get_store().find_element_user(CLIENTCLASSEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.ClientClassExpression)get_store().add_element_user(CLIENTCLASSEXPRESSION$0);
            }
            target.set(clientClassExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "clientClassExpression" element
     */
    public com.jagornet.dhcp.xml.ClientClassExpression addNewClientClassExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.ClientClassExpression target = null;
            target = (com.jagornet.dhcp.xml.ClientClassExpression)get_store().add_element_user(CLIENTCLASSEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "clientClassExpression" element
     */
    public void unsetClientClassExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTCLASSEXPRESSION$0, 0);
        }
    }
    
    /**
     * Gets the "optionExpression" element
     */
    public com.jagornet.dhcp.xml.OptionExpression getOptionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionExpression target = null;
            target = (com.jagornet.dhcp.xml.OptionExpression)get_store().find_element_user(OPTIONEXPRESSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "optionExpression" element
     */
    public boolean isSetOptionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONEXPRESSION$2) != 0;
        }
    }
    
    /**
     * Sets the "optionExpression" element
     */
    public void setOptionExpression(com.jagornet.dhcp.xml.OptionExpression optionExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionExpression target = null;
            target = (com.jagornet.dhcp.xml.OptionExpression)get_store().find_element_user(OPTIONEXPRESSION$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.OptionExpression)get_store().add_element_user(OPTIONEXPRESSION$2);
            }
            target.set(optionExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "optionExpression" element
     */
    public com.jagornet.dhcp.xml.OptionExpression addNewOptionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionExpression target = null;
            target = (com.jagornet.dhcp.xml.OptionExpression)get_store().add_element_user(OPTIONEXPRESSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "optionExpression" element
     */
    public void unsetOptionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONEXPRESSION$2, 0);
        }
    }
    
    /**
     * Gets the "customExpression" element
     */
    public java.lang.String getCustomExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMEXPRESSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "customExpression" element
     */
    public com.jagornet.dhcp.xml.CustomExpression xgetCustomExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CustomExpression target = null;
            target = (com.jagornet.dhcp.xml.CustomExpression)get_store().find_element_user(CUSTOMEXPRESSION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "customExpression" element
     */
    public boolean isSetCustomExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMEXPRESSION$4) != 0;
        }
    }
    
    /**
     * Sets the "customExpression" element
     */
    public void setCustomExpression(java.lang.String customExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMEXPRESSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMEXPRESSION$4);
            }
            target.setStringValue(customExpression);
        }
    }
    
    /**
     * Sets (as xml) the "customExpression" element
     */
    public void xsetCustomExpression(com.jagornet.dhcp.xml.CustomExpression customExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CustomExpression target = null;
            target = (com.jagornet.dhcp.xml.CustomExpression)get_store().find_element_user(CUSTOMEXPRESSION$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.CustomExpression)get_store().add_element_user(CUSTOMEXPRESSION$4);
            }
            target.set(customExpression);
        }
    }
    
    /**
     * Unsets the "customExpression" element
     */
    public void unsetCustomExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMEXPRESSION$4, 0);
        }
    }
}
