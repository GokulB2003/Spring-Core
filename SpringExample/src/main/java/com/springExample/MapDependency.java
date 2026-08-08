package com.springExample;
import java.util.*;
public class MapDependency {
	private Map<Integer,String>ans;
	public void setMap(Map<Integer,String>ans)
	{
		this.ans=ans;
	}
	public void show()
	{
		for(Map.Entry<Integer,String>s:ans.entrySet())
		{
			System.out.println(s.getKey()+""+s.getValue());
		}
	}

}
