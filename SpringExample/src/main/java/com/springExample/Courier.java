package com.springExample;

public class Courier {
	private int id;
	private String PostName;
	public Courier(int id,String PostName)
	{
		this.id=id;
		this.PostName=PostName;	
	}
	public void show()
	{
		System.out.println("id is:"+id);
		System.out.println("name is:"+PostName);
	}

}

