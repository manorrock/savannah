/*
 * XML Type:  opaqueDataListOptionType
 * Namespace: http://jagornet.com/dhcp/xml
 * Java type: com.jagornet.dhcp.xml.OpaqueDataListOptionType
 *
 * Automatically generated - do not modify.
 */
package com.jagornet.dhcp.xml.impl;
/**
 * An XML opaqueDataListOptionType(@http://jagornet.com/dhcp/xml).
 *
 * This is a complex type.
 */
public class OpaqueDataListOptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.jagornet.dhcp.xml.OpaqueDataListOptionType
{
    private static final long serialVersionUID = 1L;
    
    public OpaqueDataListOptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPAQUEDATA$0 = 
        new javax.xml.namespace.QName("", "opaqueData");
    
    
    /**
     * Gets a List of "opaqueData" elements
     */
    public java.util.List<com.jagornet.dhcp.xml.OpaqueData> getOpaqueDataList()
    {
        final class OpaqueDataList extends java.util.AbstractList<com.jagornet.dhcp.xml.OpaqueData>
        {
            public com.jagornet.dhcp.xml.OpaqueData get(int i)
                { return OpaqueDataListOptionTypeImpl.this.getOpaqueDataArray(i); }
            
            public com.jagornet.dhcp.xml.OpaqueData set(int i, com.jagornet.dhcp.xml.OpaqueData o)
            {
                com.jagornet.dhcp.xml.OpaqueData old = OpaqueDataListOptionTypeImpl.this.getOpaqueDataArray(i);
                OpaqueDataListOptionTypeImpl.this.setOpaqueDataArray(i, o);
                return old;
            }
            
            public void add(int i, com.jagornet.dhcp.xml.OpaqueData o)
                { OpaqueDataListOptionTypeImpl.this.insertNewOpaqueData(i).set(o); }
            
            public com.jagornet.dhcp.xml.OpaqueData remove(int i)
            {
                com.jagornet.dhcp.xml.OpaqueData old = OpaqueDataListOptionTypeImpl.this.getOpaqueDataArray(i);
                OpaqueDataListOptionTypeImpl.this.removeOpaqueData(i);
                return old;
            }
            
            public int size()
                { return OpaqueDataListOptionTypeImpl.this.sizeOfOpaqueDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OpaqueDataList();
        }
    }
    
    /**
     * Gets array of all "opaqueData" elements
     * @deprecated
     */
    public com.jagornet.dhcp.xml.OpaqueData[] getOpaqueDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.jagornet.dhcp.xml.OpaqueData> targetList = new java.util.ArrayList<com.jagornet.dhcp.xml.OpaqueData>();
            get_store().find_all_element_users(OPAQUEDATA$0, targetList);
            com.jagornet.dhcp.xml.OpaqueData[] result = new com.jagornet.dhcp.xml.OpaqueData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "opaqueData" element
     */
    public com.jagornet.dhcp.xml.OpaqueData getOpaqueDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(OPAQUEDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "opaqueData" element
     */
    public int sizeOfOpaqueDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPAQUEDATA$0);
        }
    }
    
    /**
     * Sets array of all "opaqueData" element
     */
    public void setOpaqueDataArray(com.jagornet.dhcp.xml.OpaqueData[] opaqueDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(opaqueDataArray, OPAQUEDATA$0);
        }
    }
    
    /**
     * Sets ith "opaqueData" element
     */
    public void setOpaqueDataArray(int i, com.jagornet.dhcp.xml.OpaqueData opaqueData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().find_element_user(OPAQUEDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(opaqueData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "opaqueData" element
     */
    public com.jagornet.dhcp.xml.OpaqueData insertNewOpaqueData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().insert_element_user(OPAQUEDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "opaqueData" element
     */
    public com.jagornet.dhcp.xml.OpaqueData addNewOpaqueData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.jagornet.dhcp.xml.OpaqueData target = null;
            target = (com.jagornet.dhcp.xml.OpaqueData)get_store().add_element_user(OPAQUEDATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "opaqueData" element
     */
    public void removeOpaqueData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPAQUEDATA$0, i);
        }
    }
}
