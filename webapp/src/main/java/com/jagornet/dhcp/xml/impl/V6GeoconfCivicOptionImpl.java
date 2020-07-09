/*
 * XML Type:  v6GeoconfCivicOption
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6GeoconfCivicOption
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6GeoconfCivicOption(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6GeoconfCivicOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6GeoconfCivicOption
{
    private static final long serialVersionUID = 1L;
    
    public V6GeoconfCivicOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHAT$0 = 
        new javax.xml.namespace.QName("", "what");
    private static final javax.xml.namespace.QName COUNTRYCODE$2 = 
        new javax.xml.namespace.QName("", "countryCode");
    private static final javax.xml.namespace.QName CIVICADDRESSELEMENT$4 = 
        new javax.xml.namespace.QName("", "civicAddressElement");
    private static final javax.xml.namespace.QName CODE$6 = 
        new javax.xml.namespace.QName("", "code");
    
    
    /**
     * Gets the "what" element
     */
    public short getWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHAT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "what" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(WHAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "what" element
     */
    public void setWhat(short what)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHAT$0);
            }
            target.setShortValue(what);
        }
    }
    
    /**
     * Sets (as xml) the "what" element
     */
    public void xsetWhat(org.apache.xmlbeans.XmlUnsignedByte what)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(WHAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(WHAT$0);
            }
            target.set(what);
        }
    }
    
    /**
     * Gets the "countryCode" element
     */
    public java.lang.String getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryCode" element
     */
    public com.jagornet.dhcp.xml.CountryCode xgetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CountryCode target = null;
            target = (com.jagornet.dhcp.xml.CountryCode)get_store().find_element_user(COUNTRYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "countryCode" element
     */
    public void setCountryCode(java.lang.String countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$2);
            }
            target.setStringValue(countryCode);
        }
    }
    
    /**
     * Sets (as xml) the "countryCode" element
     */
    public void xsetCountryCode(com.jagornet.dhcp.xml.CountryCode countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CountryCode target = null;
            target = (com.jagornet.dhcp.xml.CountryCode)get_store().find_element_user(COUNTRYCODE$2, 0);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.CountryCode)get_store().add_element_user(COUNTRYCODE$2);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Gets a List of "civicAddressElement" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.CivicAddressElement> getCivicAddressElementList()
    {
        final class CivicAddressElementList extends java.util.AbstractList<com.jagornet.dhcp.xml.CivicAddressElement>
        {
            public com.jagornet.dhcp.xml.CivicAddressElement get(int i)
                { return V6GeoconfCivicOptionImpl.this.getCivicAddressElementArray(i); }
            
            public com.jagornet.dhcp.xml.CivicAddressElement set(int i, com.jagornet.dhcp.xml.CivicAddressElement o)
            {
                com.jagornet.dhcp.xml.CivicAddressElement old = V6GeoconfCivicOptionImpl.this.getCivicAddressElementArray(i);
                V6GeoconfCivicOptionImpl.this.setCivicAddressElementArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.CivicAddressElement o)
                { V6GeoconfCivicOptionImpl.this.insertNewCivicAddressElement(i).set(o); }
            
            public com.jagornet.dhcp.xml.CivicAddressElement remove(int i)
            {
                com.jagornet.dhcp.xml.CivicAddressElement old = V6GeoconfCivicOptionImpl.this.getCivicAddressElementArray(i);
                V6GeoconfCivicOptionImpl.this.removeCivicAddressElement(i);
                return old;
            }
            
            public int size()
                { return V6GeoconfCivicOptionImpl.this.sizeOfCivicAddressElementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CivicAddressElementList();
        }
    }
    
    /**
     * Gets array of all "civicAddressElement" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.CivicAddressElement[] getCivicAddressElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.CivicAddressElement> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.CivicAddressElement>();
            get_store().find_all_element_users(CIVICADDRESSELEMENT$4, targetList);
            com.jagornet.dhcp.xml.CivicAddressElement[] result = new com.jagornet.dhcp.xml.CivicAddressElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "civicAddressElement" element
     */
    public com.jagornet.dhcp.xml.CivicAddressElement getCivicAddressElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CivicAddressElement target = null;
            target = (com.jagornet.dhcp.xml.CivicAddressElement)get_store().find_element_user(CIVICADDRESSELEMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "civicAddressElement" element
     */
    public int sizeOfCivicAddressElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIVICADDRESSELEMENT$4);
        }
    }
    
    /**
     * Sets array of all "civicAddressElement" element
     */
    public void setCivicAddressElementArray(com.jagornet.dhcp.xml.CivicAddressElement[] civicAddressElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(civicAddressElementArray, CIVICADDRESSELEMENT$4);
        }
    }
    
    /**
     * Sets ith "civicAddressElement" element
     */
    public void setCivicAddressElementArray(int i, com.jagornet.dhcp.xml.CivicAddressElement civicAddressElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CivicAddressElement target = null;
            target = (com.jagornet.dhcp.xml.CivicAddressElement)get_store().find_element_user(CIVICADDRESSELEMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(civicAddressElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "civicAddressElement" element
     */
    public com.jagornet.dhcp.xml.CivicAddressElement insertNewCivicAddressElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CivicAddressElement target = null;
            target = (com.jagornet.dhcp.xml.CivicAddressElement)get_store().insert_element_user(CIVICADDRESSELEMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "civicAddressElement" element
     */
    public com.jagornet.dhcp.xml.CivicAddressElement addNewCivicAddressElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.CivicAddressElement target = null;
            target = (com.jagornet.dhcp.xml.CivicAddressElement)get_store().add_element_user(CIVICADDRESSELEMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "civicAddressElement" element
     */
    public void removeCivicAddressElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIVICADDRESSELEMENT$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$6);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_default_attribute_value(CODE$6);
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
            return get_store().find_attribute_user(CODE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$6);
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
            target = (com.jagornet.dhcp.xml.Code)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (com.jagornet.dhcp.xml.Code)get_store().add_attribute_user(CODE$6);
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
            get_store().remove_attribute(CODE$6);
        }
    }
}
