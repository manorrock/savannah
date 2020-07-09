/*
 * XML Type:  unsignedByteListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.UnsignedByteListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML unsignedByteListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class UnsignedByteListOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.UnsignedByteListOptionType
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedByteListOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDBYTE$0 = 
        new javax.xml.namespace.QName("", "unsignedByte");
    
    
    /**
     * Gets a List of "unsignedByte" elements
     */
    public java.util.List<java.lang.Short> getUnsignedByteList()
    {
        final class UnsignedByteList extends java.util.AbstractList<java.lang.Short>
        {
            public java.lang.Short get(int i)
                { return UnsignedByteListOptionTypeImpl.this.getUnsignedByteArray(i); }
            
            public java.lang.Short set(int i, java.lang.Short o)
            {
                java.lang.Short old = UnsignedByteListOptionTypeImpl.this.getUnsignedByteArray(i);
                UnsignedByteListOptionTypeImpl.this.setUnsignedByteArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Short o)
                { UnsignedByteListOptionTypeImpl.this.insertUnsignedByte(i, o); }
            
            public java.lang.Short remove(int i)
            {
                java.lang.Short old = UnsignedByteListOptionTypeImpl.this.getUnsignedByteArray(i);
                UnsignedByteListOptionTypeImpl.this.removeUnsignedByte(i);
                return old;
            }
            
            public int size()
                { return UnsignedByteListOptionTypeImpl.this.sizeOfUnsignedByteArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UnsignedByteList();
        }
    }
    
    /**
     * Gets array of all "unsignedByte" elements
     * @deprecated
     */
    public short[] getUnsignedByteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlUnsignedByte> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlUnsignedByte>();
            get_store().find_all_element_users(UNSIGNEDBYTE$0, targetList);
            short[] result = new short[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getShortValue();
            return result;
        }
    }
    
    /**
     * Gets ith "unsignedByte" element
     */
    public short getUnsignedByteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDBYTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "unsignedByte" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedByte> xgetUnsignedByteList()
    {
        final class UnsignedByteList extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedByte>
        {
            public org.apache.xmlbeans.XmlUnsignedByte get(int i)
                { return UnsignedByteListOptionTypeImpl.this.xgetUnsignedByteArray(i); }
            
            public org.apache.xmlbeans.XmlUnsignedByte set(int i, org.apache.xmlbeans.XmlUnsignedByte o)
            {
                org.apache.xmlbeans.XmlUnsignedByte old = UnsignedByteListOptionTypeImpl.this.xgetUnsignedByteArray(i);
                UnsignedByteListOptionTypeImpl.this.xsetUnsignedByteArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedByte o)
                { UnsignedByteListOptionTypeImpl.this.insertNewUnsignedByte(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedByte remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedByte old = UnsignedByteListOptionTypeImpl.this.xgetUnsignedByteArray(i);
                UnsignedByteListOptionTypeImpl.this.removeUnsignedByte(i);
                return old;
            }
            
            public int size()
                { return UnsignedByteListOptionTypeImpl.this.sizeOfUnsignedByteArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UnsignedByteList();
        }
    }
    
    /**
     * Gets array of all "unsignedByte" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlUnsignedByte[] xgetUnsignedByteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlUnsignedByte> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlUnsignedByte>();
            get_store().find_all_element_users(UNSIGNEDBYTE$0, targetList);
            org.apache.xmlbeans.XmlUnsignedByte[] result = new org.apache.xmlbeans.XmlUnsignedByte[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "unsignedByte" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetUnsignedByteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedByte)target;
        }
    }
    
    /**
     * Returns number of "unsignedByte" element
     */
    public int sizeOfUnsignedByteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSIGNEDBYTE$0);
        }
    }
    
    /**
     * Sets array of all "unsignedByte" element
     */
    public void setUnsignedByteArray(short[] unsignedByteArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unsignedByteArray, UNSIGNEDBYTE$0);
        }
    }
    
    /**
     * Sets ith "unsignedByte" element
     */
    public void setUnsignedByteArray(int i, short unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDBYTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setShortValue(unsignedByte);
        }
    }
    
    /**
     * Sets (as xml) array of all "unsignedByte" element
     */
    public void xsetUnsignedByteArray(org.apache.xmlbeans.XmlUnsignedByte[]unsignedByteArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unsignedByteArray, UNSIGNEDBYTE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "unsignedByte" element
     */
    public void xsetUnsignedByteArray(int i, org.apache.xmlbeans.XmlUnsignedByte unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unsignedByte);
        }
    }
    
    /**
     * Inserts the value as the ith "unsignedByte" element
     */
    public void insertUnsignedByte(int i, short unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNSIGNEDBYTE$0, i);
            target.setShortValue(unsignedByte);
        }
    }
    
    /**
     * Appends the value as the last "unsignedByte" element
     */
    public void addUnsignedByte(short unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDBYTE$0);
            target.setShortValue(unsignedByte);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unsignedByte" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte insertNewUnsignedByte(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().insert_element_user(UNSIGNEDBYTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unsignedByte" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte addNewUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(UNSIGNEDBYTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "unsignedByte" element
     */
    public void removeUnsignedByte(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSIGNEDBYTE$0, i);
        }
    }
}
