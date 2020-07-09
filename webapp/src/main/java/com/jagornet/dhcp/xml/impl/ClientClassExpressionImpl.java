/*
 * XML Type:  clientClassExpression
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.ClientClassExpression
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML clientClassExpression(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class ClientClassExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.ClientClassExpression
{
    private static final long serialVersionUID = 1L;
    
    public ClientClassExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V6USERCLASSOPTION$0 = 
        new javax.xml.namespace.QName("", "v6UserClassOption");
    private static final javax.xml.namespace.QName V6VENDORCLASSOPTION$2 = 
        new javax.xml.namespace.QName("", "v6VendorClassOption");
    private static final javax.xml.namespace.QName V4VENDORCLASSOPTION$4 = 
        new javax.xml.namespace.QName("", "v4VendorClassOption");
    private static final javax.xml.namespace.QName OPERATOR$6 = 
        new javax.xml.namespace.QName("", "operator");
    
    
    /**
     * Gets the "v6UserClassOption" element
     */
    public com.jagornet.dhcp.xml.V6UserClassOption getV6UserClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6UserClassOption target = null;
            target = (com.jagornet.dhcp.xml.V6UserClassOption)get_store().find_element_user(V6USERCLASSOPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6UserClassOption" element
     */
    public boolean isSetV6UserClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6USERCLASSOPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "v6UserClassOption" element
     */
    public void setV6UserClassOption(com.jagornet.dhcp.xml.V6UserClassOption v6UserClassOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6UserClassOption target = null;
            target = (com.jagornet.dhcp.xml.V6UserClassOption)get_store().find_element_user(V6USERCLASSOPTION$0, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6UserClassOption)get_store().add_element_user(V6USERCLASSOPTION$0);
            }
            target.set(v6UserClassOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6UserClassOption" element
     */
    public com.jagornet.dhcp.xml.V6UserClassOption addNewV6UserClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6UserClassOption target = null;
            target = (com.jagornet.dhcp.xml.V6UserClassOption)get_store().add_element_user(V6USERCLASSOPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "v6UserClassOption" element
     */
    public void unsetV6UserClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6USERCLASSOPTION$0, 0);
        }
    }
    
    /**
     * Gets the "v6VendorClassOption" element
     */
    public com.jagornet.dhcp.xml.V6VendorClassOption getV6VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6VendorClassOption target = null;
            target = (com.jagornet.dhcp.xml.V6VendorClassOption)get_store().find_element_user(V6VENDORCLASSOPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v6VendorClassOption" element
     */
    public boolean isSetV6VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V6VENDORCLASSOPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "v6VendorClassOption" element
     */
    public void setV6VendorClassOption(com.jagornet.dhcp.xml.V6VendorClassOption v6VendorClassOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6VendorClassOption target = null;
            target = (com.jagornet.dhcp.xml.V6VendorClassOption)get_store().find_element_user(V6VENDORCLASSOPTION$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V6VendorClassOption)get_store().add_element_user(V6VENDORCLASSOPTION$2);
            }
            target.set(v6VendorClassOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v6VendorClassOption" element
     */
    public com.jagornet.dhcp.xml.V6VendorClassOption addNewV6VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6VendorClassOption target = null;
            target = (com.jagornet.dhcp.xml.V6VendorClassOption)get_store().add_element_user(V6VENDORCLASSOPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "v6VendorClassOption" element
     */
    public void unsetV6VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V6VENDORCLASSOPTION$2, 0);
        }
    }
    
    /**
     * Gets the "v4VendorClassOption" element
     */
    public com.jagornet.dhcp.xml.V4VendorClassOption getV4VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4VendorClassOption target = null;
            target = (com.jagornet.dhcp.xml.V4VendorClassOption)get_store().find_element_user(V4VENDORCLASSOPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "v4VendorClassOption" element
     */
    public boolean isSetV4VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V4VENDORCLASSOPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "v4VendorClassOption" element
     */
    public void setV4VendorClassOption(com.jagornet.dhcp.xml.V4VendorClassOption v4VendorClassOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4VendorClassOption target = null;
            target = (com.jagornet.dhcp.xml.V4VendorClassOption)get_store().find_element_user(V4VENDORCLASSOPTION$4, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.V4VendorClassOption)get_store().add_element_user(V4VENDORCLASSOPTION$4);
            }
            target.set(v4VendorClassOption);
        }
    }
    
    /**
     * Appends and returns a new empty "v4VendorClassOption" element
     */
    public com.jagornet.dhcp.xml.V4VendorClassOption addNewV4VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V4VendorClassOption target = null;
            target = (com.jagornet.dhcp.xml.V4VendorClassOption)get_store().add_element_user(V4VENDORCLASSOPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "v4VendorClassOption" element
     */
    public void unsetV4VendorClassOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V4VENDORCLASSOPTION$4, 0);
        }
    }
    
    /**
     * Gets the "operator" attribute
     */
    public com.jagornet.dhcp.xml.Operator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$6);
            }
            if (target == null)
            {
                return null;
            }
            return (com.jagornet.dhcp.xml.Operator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public com.jagornet.dhcp.xml.Operator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Operator target = null;
            target = (com.jagornet.dhcp.xml.Operator)get_store().find_attribute_user(OPERATOR$6);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Operator)get_default_attribute_value(OPERATOR$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$6) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(com.jagornet.dhcp.xml.Operator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$6);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(com.jagornet.dhcp.xml.Operator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.Operator target = null;
            target = (com.jagornet.dhcp.xml.Operator)get_store().find_attribute_user(OPERATOR$6);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Operator)get_store().add_attribute_user(OPERATOR$6);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$6);
        }
    }
}
