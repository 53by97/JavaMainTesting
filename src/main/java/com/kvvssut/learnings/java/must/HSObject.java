package com.kvvssut.learnings.java.must;


public class HSObject {
	
	private long empId;
	private String name;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	/* Long.class
	 *  public int hashCode() {
        return (int)(value ^ (value >>> 32));		// exclusive OR of the two halves of the primitive long value
    }
	 */
	
	/*
	 * public boolean equals(Object obj) {
        if (obj instanceof Long) {
            return value == ((Long)obj).longValue();	// returns (long) value
        }
        return false;
    }
	 */
	
	@Override
	public int hashCode() {
		return Long.valueOf(this.empId).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return Long.valueOf(this.empId).equals(Long.valueOf(((HSObject)obj).getEmpId())); 
	}
	
	@Override
	public String toString() {
		return "HSObject [empId=" + empId + ", name=" + name + "]";
	}
	
	
	
}
