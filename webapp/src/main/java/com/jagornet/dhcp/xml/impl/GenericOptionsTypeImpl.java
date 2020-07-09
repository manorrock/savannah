/*
 * XML Type:  genericOptionsType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.GenericOptionsType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML genericOptionsType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class GenericOptionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.GenericOptionsType
{
    private static final long serialVersionUID = 1L;
    
    public GenericOptionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONDEF$0 = 
        new javax.xml.namespace.QName("", "optionDef");
    
    
    /**
     * Gets a List of "optionDef" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.OptionDefType> getOptionDefList()
    {
        final class OptionDefList extends java.util.AbstractList<com.jagornet.dhcp.xml.OptionDefType>
        {
            public com.jagornet.dhcp.xml.OptionDefType get(int i)
                { return GenericOptionsTypeImpl.this.getOptionDefArray(i); }
            
            public com.jagornet.dhcp.xml.OptionDefType set(int i, com.jagornet.dhcp.xml.OptionDefType o)
            {
                com.jagornet.dhcp.xml.OptionDefType old = GenericOptionsTypeImpl.this.getOptionDefArray(i);
                GenericOptionsTypeImpl.this.setOptionDefArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.OptionDefType o)
                { GenericOptionsTypeImpl.this.insertNewOptionDef(i).set(o); }
            
            public com.jagornet.dhcp.xml.OptionDefType remove(int i)
            {
                com.jagornet.dhcp.xml.OptionDefType old = GenericOptionsTypeImpl.this.getOptionDefArray(i);
                GenericOptionsTypeImpl.this.removeOptionDef(i);
                return old;
            }
            
            public int size()
                { return GenericOptionsTypeImpl.this.sizeOfOptionDefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OptionDefList();
        }
    }
    
    /**
     * Gets array of all "optionDef" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.OptionDefType[] getOptionDefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.OptionDefType> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.OptionDefType>();
            get_store().find_all_element_users(OPTIONDEF$0, targetList);
            com.jagornet.dhcp.xml.OptionDefType[] result = new com.jagornet.dhcp.xml.OptionDefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "optionDef" element
     */
    public com.jagornet.dhcp.xml.OptionDefType getOptionDefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionDefType target = null;
            target = (com.jagornet.dhcp.xml.OptionDefType)get_store().find_element_user(OPTIONDEF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "optionDef" element
     */
    public int sizeOfOptionDefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONDEF$0);
        }
    }
    
    /**
     * Sets array of all "optionDef" element
     */
    public void setOptionDefArray(com.jagornet.dhcp.xml.OptionDefType[] optionDefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionDefArray, OPTIONDEF$0);
        }
    }
    
    /**
     * Sets ith "optionDef" element
     */
    public void setOptionDefArray(int i, com.jagornet.dhcp.xml.OptionDefType optionDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionDefType target = null;
            target = (com.jagornet.dhcp.xml.OptionDefType)get_store().find_element_user(OPTIONDEF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionDef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "optionDef" element
     */
    public com.jagornet.dhcp.xml.OptionDefType insertNewOptionDef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionDefType target = null;
            target = (com.jagornet.dhcp.xml.OptionDefType)get_store().insert_element_user(OPTIONDEF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "optionDef" element
     */
    public com.jagornet.dhcp.xml.OptionDefType addNewOptionDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OptionDefType target = null;
            target = (com.jagornet.dhcp.xml.OptionDefType)get_store().add_element_user(OPTIONDEF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "optionDef" element
     */
    public void removeOptionDef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONDEF$0, i);
        }
    }
}
