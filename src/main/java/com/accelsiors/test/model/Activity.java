package com.accelsiors.test.model;

/**
 * Base class for activities
 * @author ZoltanS
 *
 */
public class Activity {
	
	private Integer id;
	private String name;
	
	public Activity() {
		
	}

	public Activity( Integer id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + "]";
	}
	
	

}
