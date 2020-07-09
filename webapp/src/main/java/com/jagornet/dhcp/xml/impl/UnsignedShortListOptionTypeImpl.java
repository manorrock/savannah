/*
 * XML Type:  unsignedShortListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedShortListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML unsignedShortListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class UnsignedShortListOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.UnsignedShortListOptionType
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedShortListOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDSHORT$0 = 
        new javax.xml.namespace.QName("", "unsignedShort");
    
    
    /**
     * Gets a List of "unsignedShort" elements
     */
    public java.util.List<java.lang.Integer> getUnsignedShortList()
    {
        final class UnsignedShortList extends java.util.AbstractList<java.lang.Integer>
        {
            public java.lang.Integer get(int i)
                { return UnsignedShortListOptionTypeImpl.this.getUnsignedShortArray(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = UnsignedShortListOptionTypeImpl.this.getUnsignedShortArray(i);
                UnsignedShortListOptionTypeImpl.this.setUnsignedShortArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { UnsignedShortListOptionTypeImpl.this.insertUnsignedShort(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = UnsignedShortListOptionTypeImpl.this.getUnsignedShortArray(i);
                UnsignedShortListOptionTypeImpl.this.removeUnsignedShort(i);
                return old;
            }
            
            public int size()
                { return UnsignedShortListOptionTypeImpl.this.sizeOfUnsignedShortArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UnsignedShortList();
        }
    }
    
    /**
     * Gets array of all "unsignedShort" elements
     * @deprecated
     */
    public int[] getUnsignedShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlUnsignedShort> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlUnsignedShort>();
            get_store().find_all_element_users(UNSIGNEDSHORT$0, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "unsignedShort" element
     */
    public int getUnsignedShortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDSHORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "unsignedShort" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedShort> xgetUnsignedShortList()
    {
        final class UnsignedShortList extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedShort>
        {
            public org.apache.xmlbeans.XmlUnsignedShort get(int i)
                { return UnsignedShortListOptionTypeImpl.this.xgetUnsignedShortArray(i); }
            
            public org.apache.xmlbeans.XmlUnsignedShort set(int i, org.apache.xmlbeans.XmlUnsignedShort o)
            {
                org.apache.xmlbeans.XmlUnsignedShort old = UnsignedShortListOptionTypeImpl.this.xgetUnsignedShortArray(i);
                UnsignedShortListOptionTypeImpl.this.xsetUnsignedShortArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedShort o)
                { UnsignedShortListOptionTypeImpl.this.insertNewUnsignedShort(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedShort remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedShort old = UnsignedShortListOptionTypeImpl.this.xgetUnsignedShortArray(i);
                UnsignedShortListOptionTypeImpl.this.removeUnsignedShort(i);
                return old;
            }
            
            public int size()
                { return UnsignedShortListOptionTypeImpl.this.sizeOfUnsignedShortArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UnsignedShortList();
        }
    }
    
    /**
     * Gets array of all "unsignedShort" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlUnsignedShort[] xgetUnsignedShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlUnsignedShort> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlUnsignedShort>();
            get_store().find_all_element_users(UNSIGNEDSHORT$0, targetList);
            org.apache.xmlbeans.XmlUnsignedShort[] result = new org.apache.xmlbeans.XmlUnsignedShort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "unsignedShort" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetUnsignedShortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedShort)target;
        }
    }
    
    /**
     * Returns number of "unsignedShort" element
     */
    public int sizeOfUnsignedShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSIGNEDSHORT$0);
        }
    }
    
    /**
     * Sets array of all "unsignedShort" element
     */
    public void setUnsignedShortArray(int[] unsignedShortArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unsignedShortArray, UNSIGNEDSHORT$0);
        }
    }
    
    /**
     * Sets ith "unsignedShort" element
     */
    public void setUnsignedShortArray(int i, int unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDSHORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(unsignedShort);
        }
    }
    
    /**
     * Sets (as xml) array of all "unsignedShort" element
     */
    public void xsetUnsignedShortArray(org.apache.xmlbeans.XmlUnsignedShort[]unsignedShortArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unsignedShortArray, UNSIGNEDSHORT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "unsignedShort" element
     */
    public void xsetUnsignedShortArray(int i, org.apache.xmlbeans.XmlUnsignedShort unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unsignedShort);
        }
    }
    
    /**
     * Inserts the value as the ith "unsignedShort" element
     */
    public void insertUnsignedShort(int i, int unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNSIGNEDSHORT$0, i);
            target.setIntValue(unsignedShort);
        }
    }
    
    /**
     * Appends the value as the last "unsignedShort" element
     */
    public void addUnsignedShort(int unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDSHORT$0);
            target.setIntValue(unsignedShort);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unsignedShort" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort insertNewUnsignedShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().insert_element_user(UNSIGNEDSHORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unsignedShort" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort addNewUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(UNSIGNEDSHORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "unsignedShort" element
     */
    public void removeUnsignedShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSIGNEDSHORT$0, i);
        }
    }
}
