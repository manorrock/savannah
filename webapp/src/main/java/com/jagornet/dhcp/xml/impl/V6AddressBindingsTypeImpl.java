/*
 * XML Type:  v6AddressBindingsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.V6AddressBindingsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML v6AddressBindingsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class V6AddressBindingsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.V6AddressBindingsType
{
    private static final long serialVersionUID = 1L;
    
    public V6AddressBindingsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINDING$0 = 
        new javax.xml.namespace.QName("", "binding");
    
    
    /**
     * Gets a List of "binding" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.V6AddressBinding> getBindingList()
    {
        final class BindingList extends java.util.AbstractList<com.jagornet.dhcp.xml.V6AddressBinding>
        {
            public com.jagornet.dhcp.xml.V6AddressBinding get(int i)
                { return V6AddressBindingsTypeImpl.this.getBindingArray(i); }
            
            public com.jagornet.dhcp.xml.V6AddressBinding set(int i, com.jagornet.dhcp.xml.V6AddressBinding o)
            {
                com.jagornet.dhcp.xml.V6AddressBinding old = V6AddressBindingsTypeImpl.this.getBindingArray(i);
                V6AddressBindingsTypeImpl.this.setBindingArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.V6AddressBinding o)
                { V6AddressBindingsTypeImpl.this.insertNewBinding(i).set(o); }
            
            public com.jagornet.dhcp.xml.V6AddressBinding remove(int i)
            {
                com.jagornet.dhcp.xml.V6AddressBinding old = V6AddressBindingsTypeImpl.this.getBindingArray(i);
                V6AddressBindingsTypeImpl.this.removeBinding(i);
                return old;
            }
            
            public int size()
                { return V6AddressBindingsTypeImpl.this.sizeOfBindingArray(); }
            
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
    public com.jagornet.dhcp.xml.V6AddressBinding[] getBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.V6AddressBinding> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.V6AddressBinding>();
            get_store().find_all_element_users(BINDING$0, targetList);
            com.jagornet.dhcp.xml.V6AddressBinding[] result = new com.jagornet.dhcp.xml.V6AddressBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "binding" element
     */
    public com.jagornet.dhcp.xml.V6AddressBinding getBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBinding target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBinding)get_store().find_element_user(BINDING$0, i);
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
    public void setBindingArray(com.jagornet.dhcp.xml.V6AddressBinding[] bindingArray)
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
    public void setBindingArray(int i, com.jagornet.dhcp.xml.V6AddressBinding binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBinding target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBinding)get_store().find_element_user(BINDING$0, i);
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
    public com.jagornet.dhcp.xml.V6AddressBinding insertNewBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBinding target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBinding)get_store().insert_element_user(BINDING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "binding" element
     */
    public com.jagornet.dhcp.xml.V6AddressBinding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.V6AddressBinding target = null;
            target = (com.jagornet.dhcp.xml.V6AddressBinding)get_store().add_element_user(BINDING$0);
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
