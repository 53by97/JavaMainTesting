package com.kvvssut.learnings.java.must;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapImpl {
	
	public static void main(String[] args) {
		
		TreeMap map;
		
		/*
		 *     public V put(K key, V value) {
        if (key == null)
            return putForNullKey(value);
        int hash = hash(key);				// calculates key.hashCode()
        int i = indexFor(hash, table.length);
        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {		// checks 1st for same hash, 2nd for == || .equals()
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }

        modCount++;
        addEntry(hash, key, value, i);		// also stores the hash calculated before for key, with <key, value> within "Entry<K,V>[] table"
        return null;
    }
		 */
		
		
		HashMap<HSObject, String> hashMap = new HashMap<HSObject, String>();
		
		HSObject hso1 = new HSObject();
		hso1.setEmpId(1234);
		hso1.setName("One");
		
		HSObject hso2 = new HSObject();
		hso2.setEmpId(1234);
		hso2.setName("Two");
		
		HSObject hso3 = new HSObject();
		hso3.setEmpId(4321);
		hso3.setName("Three");
		
		hashMap.put(hso1, "1");
		hashMap.put(hso2, "2");
		hashMap.put(hso3, "3");
		hashMap.put(null, "Null");			// As hash for null object is zero, its index also remains zero
		
		
		for (Entry<HSObject, String> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
