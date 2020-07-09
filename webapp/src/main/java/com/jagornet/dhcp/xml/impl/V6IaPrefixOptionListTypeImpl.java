/*
 * XML Type:  v6IaPrefixOptionListType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6IaPrefixOptionListType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6IaPrefixOptionListType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6IaPrefixOptionListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6IaPrefixOptionListType
{
    private static final long serialVersionUID = 1L;
    
    public V6IaPrefixOptionListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IAPREFIXOPTION$0 = 
        new javax.xml.namespace.QName("", "iaPrefixOption");
    
    
    /**
     * Gets a List of "iaPrefixOption" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.V6IaPrefixOption> getIaPrefixOptionList()
    {
        final class IaPrefixOptionList extends java.util.AbstractList<com.jagornet.dhcp.xml.V6IaPrefixOption>
        {
            public com.jagornet.dhcp.xml.V6IaPrefixOption get(int i)
                { return V6IaPrefixOptionListTypeImpl.this.getIaPrefixOptionArray(i); }
            
            public com.jagornet.dhcp.xml.V6IaPrefixOption set(int i, com.jagornet.dhcp.xml.V6IaPrefixOption o)
            {
                com.jagornet.dhcp.xml.V6IaPrefixOption old = V6IaPrefixOptionListTypeImpl.this.getIaPrefixOptionArray(i);
                V6IaPrefixOptionListTypeImpl.this.setIaPrefixOptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.V6IaPrefixOption o)
                { V6IaPrefixOptionListTypeImpl.this.insertNewIaPrefixOption(i).set(o); }
            
            public com.jagornet.dhcp.xml.V6IaPrefixOption remove(int i)
            {
                com.jagornet.dhcp.xml.V6IaPrefixOption old = V6IaPrefixOptionListTypeImpl.this.getIaPrefixOptionArray(i);
                V6IaPrefixOptionListTypeImpl.this.removeIaPrefixOption(i);
                return old;
            }
            
            public int size()
                { return V6IaPrefixOptionListTypeImpl.this.sizeOfIaPrefixOptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IaPrefixOptionList();
        }
    }
    
    /**
     * Gets array of all "iaPrefixOption" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.V6IaPrefixOption[] getIaPrefixOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.V6IaPrefixOption> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.V6IaPrefixOption>();
            get_store().find_all_element_users(IAPREFIXOPTION$0, targetList);
            com.jagornet.dhcp.xml.V6IaPrefixOption[] result = new com.jagornet.dhcp.xml.V6IaPrefixOption[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "iaPrefixOption" element
     */
    public com.jagornet.dhcp.xml.V6IaPrefixOption getIaPrefixOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOption)get_store().find_element_user(IAPREFIXOPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "iaPrefixOption" element
     */
    public int sizeOfIaPrefixOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IAPREFIXOPTION$0);
        }
    }
    
    /**
     * Sets array of all "iaPrefixOption" element
     */
    public void setIaPrefixOptionArray(com.jagornet.dhcp.xml.V6IaPrefixOption[] iaPrefixOptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iaPrefixOptionArray, IAPREFIXOPTION$0);
        }
    }
    
    /**
     * Sets ith "iaPrefixOption" element
     */
    public void setIaPrefixOptionArray(int i, com.jagornet.dhcp.xml.V6IaPrefixOption iaPrefixOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOption)get_store().find_element_user(IAPREFIXOPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iaPrefixOption);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "iaPrefixOption" element
     */
    public com.jagornet.dhcp.xml.V6IaPrefixOption insertNewIaPrefixOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOption)get_store().insert_element_user(IAPREFIXOPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "iaPrefixOption" element
     */
    public com.jagornet.dhcp.xml.V6IaPrefixOption addNewIaPrefixOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaPrefixOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaPrefixOption)get_store().add_element_user(IAPREFIXOPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "iaPrefixOption" element
     */
    public void removeIaPrefixOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IAPREFIXOPTION$0, i);
        }
    }
}
