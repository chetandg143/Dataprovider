package com.Dataread.excel;

import org.testng.annotations.Test;

public class Second 
{
@Test(dataProviderClass=Second.class,dataProvider="First")
public void demo(String s1,String s2)
{
	System.out.println(s1);
	System.out.println(s2);
}
}
