/*
 * XML Type:  v6PrefixBindingsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6PrefixBindingsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6PrefixBindingsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6PrefixBindingsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6PrefixBindingsType
{
    private static final long serialVersionUID = 1L;
    
    public V6PrefixBindingsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINDING$0 = 
        new javax.xml.namespace.QName("", "binding");
    
    
    /**
     * Gets a List of "binding" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.V6PrefixBinding> getBindingList()
    {
        final class BindingList extends java.util.AbstractList<com.jagornet.dhcp.xml.V6PrefixBinding>
        {
            public com.jagornet.dhcp.xml.V6PrefixBinding get(int i)
                { return V6PrefixBindingsTypeImpl.this.getBindingArray(i); }
            
            public com.jagornet.dhcp.xml.V6PrefixBinding set(int i, com.jagornet.dhcp.xml.V6PrefixBinding o)
            {
                com.jagornet.dhcp.xml.V6PrefixBinding old = V6PrefixBindingsTypeImpl.this.getBindingArray(i);
                V6PrefixBindingsTypeImpl.this.setBindingArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.V6PrefixBinding o)
                { V6PrefixBindingsTypeImpl.this.insertNewBinding(i).set(o); }
            
            public com.jagornet.dhcp.xml.V6PrefixBinding remove(int i)
            {
                com.jagornet.dhcp.xml.V6PrefixBinding old = V6PrefixBindingsTypeImpl.this.getBindingArray(i);
                V6PrefixBindingsTypeImpl.this.removeBinding(i);
                return old;
            }
            
            public int size()
                { return V6PrefixBindingsTypeImpl.this.sizeOfBindingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BindingList();
        }
    }
    
    /**
     * Gets array of all "binding" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.V6PrefixBinding[] getBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.V6PrefixBinding> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.V6PrefixBinding>();
            get_store().find_all_element_users(BINDING$0, targetList);
            com.jagornet.dhcp.xml.V6PrefixBinding[] result = new com.jagornet.dhcp.xml.V6PrefixBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "binding" element
     */
    public com.jagornet.dhcp.xml.V6PrefixBinding getBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBinding target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBinding)get_store().find_element_user(BINDING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "binding" element
     */
    public int sizeOfBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINDING$0);
        }
    }
    
    /**
     * Sets array of all "binding" element
     */
    public void setBindingArray(com.jagornet.dhcp.xml.V6PrefixBinding[] bindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bindingArray, BINDING$0);
        }
    }
    
    /**
     * Sets ith "binding" element
     */
    public void setBindingArray(int i, com.jagornet.dhcp.xml.V6PrefixBinding binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBinding target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBinding)get_store().find_element_user(BINDING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(binding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "binding" element
     */
    public com.jagornet.dhcp.xml.V6PrefixBinding insertNewBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBinding target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBinding)get_store().insert_element_user(BINDING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "binding" element
     */
    public com.jagornet.dhcp.xml.V6PrefixBinding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6PrefixBinding target = null;
            target = (com.jagornet.dhcp.xml.V6PrefixBinding)get_store().add_element_user(BINDING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "binding" element
     */
    public void removeBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINDING$0, i);
        }
    }
}
