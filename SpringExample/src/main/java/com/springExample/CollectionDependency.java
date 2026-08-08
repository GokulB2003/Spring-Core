package com.springExample;
import java.util.*;
public class CollectionDependency {
	private List<String>l;
	CollectionDependency(List<String>l)
	{
		this.l=l;
	}
	public void show()
	{
		for(String s:l)
		{
			System.out.println(s);
		}
	}
	
}
