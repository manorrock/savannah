/*
 * XML Type:  v6IaAddrOptionListType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6IaAddrOptionListType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6IaAddrOptionListType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6IaAddrOptionListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6IaAddrOptionListType
{
    private static final long serialVersionUID = 1L;
    
    public V6IaAddrOptionListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IAADDROPTION$0 = 
        new javax.xml.namespace.QName("", "iaAddrOption");
    
    
    /**
     * Gets a List of "iaAddrOption" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.V6IaAddrOption> getIaAddrOptionList()
    {
        final class IaAddrOptionList extends java.util.AbstractList<com.jagornet.dhcp.xml.V6IaAddrOption>
        {
            public com.jagornet.dhcp.xml.V6IaAddrOption get(int i)
                { return V6IaAddrOptionListTypeImpl.this.getIaAddrOptionArray(i); }
            
            public com.jagornet.dhcp.xml.V6IaAddrOption set(int i, com.jagornet.dhcp.xml.V6IaAddrOption o)
            {
                com.jagornet.dhcp.xml.V6IaAddrOption old = V6IaAddrOptionListTypeImpl.this.getIaAddrOptionArray(i);
                V6IaAddrOptionListTypeImpl.this.setIaAddrOptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.V6IaAddrOption o)
                { V6IaAddrOptionListTypeImpl.this.insertNewIaAddrOption(i).set(o); }
            
            public com.jagornet.dhcp.xml.V6IaAddrOption remove(int i)
            {
                com.jagornet.dhcp.xml.V6IaAddrOption old = V6IaAddrOptionListTypeImpl.this.getIaAddrOptionArray(i);
                V6IaAddrOptionListTypeImpl.this.removeIaAddrOption(i);
                return old;
            }
            
            public int size()
                { return V6IaAddrOptionListTypeImpl.this.sizeOfIaAddrOptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IaAddrOptionList();
        }
    }
    
    /**
     * Gets array of all "iaAddrOption" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.V6IaAddrOption[] getIaAddrOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.V6IaAddrOption> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.V6IaAddrOption>();
            get_store().find_all_element_users(IAADDROPTION$0, targetList);
            com.jagornet.dhcp.xml.V6IaAddrOption[] result = new com.jagornet.dhcp.xml.V6IaAddrOption[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "iaAddrOption" element
     */
    public com.jagornet.dhcp.xml.V6IaAddrOption getIaAddrOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOption)get_store().find_element_user(IAADDROPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "iaAddrOption" element
     */
    public int sizeOfIaAddrOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IAADDROPTION$0);
        }
    }
    
    /**
     * Sets array of all "iaAddrOption" element
     */
    public void setIaAddrOptionArray(com.jagornet.dhcp.xml.V6IaAddrOption[] iaAddrOptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iaAddrOptionArray, IAADDROPTION$0);
        }
    }
    
    /**
     * Sets ith "iaAddrOption" element
     */
    public void setIaAddrOptionArray(int i, com.jagornet.dhcp.xml.V6IaAddrOption iaAddrOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOption)get_store().find_element_user(IAADDROPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iaAddrOption);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "iaAddrOption" element
     */
    public com.jagornet.dhcp.xml.V6IaAddrOption insertNewIaAddrOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOption)get_store().insert_element_user(IAADDROPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "iaAddrOption" element
     */
    public com.jagornet.dhcp.xml.V6IaAddrOption addNewIaAddrOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6IaAddrOption target = null;
            target = (com.jagornet.dhcp.xml.V6IaAddrOption)get_store().add_element_user(IAADDROPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "iaAddrOption" element
     */
    public void removeIaAddrOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IAADDROPTION$0, i);
        }
    }
}
