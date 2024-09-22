package com.saucedemo.qa.Utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//////Dataprovider by Object Arry///////////
	@DataProvider(name = "dp by Arry Object")
	public Object[][] logindata()
	{
		Object data[][]= {
				{"standard_user","secret_sauce"},
				{"",""},
				{"saadbvaebfb@rghh",""},
				{"","secret_sauce"},
				{"performance_glitch_user","secret_sauce"},
				
				};
		return data;
	

}
}
