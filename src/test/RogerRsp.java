package test;

import com.alibaba.fastjson.annotation.JMIMG;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;



/*
 * Copyright (C) 2010-2015 Jumei Inc.All Rights Reserved.
 * FileName：RogerRsp.java
 * Description：
 * History：
 * 1.0 denverhan 2016-2-25 Create
 */

public class RogerRsp<T extends RogerRsp<T>>
{

	public int  			mInt ;
	@JSONField(name="message", alias= {"","denver", "abc"})
	public int				mMessage;
	
	@JSONField( alias= {"data", "kabc"})
	public Data		mData;

	public static class Data
	{
		private  String mValue;
		
		@JMIMG
		public void setValue(String v)
		{
			mValue = v;
		}
		
		public String getValue()
		{
			return mValue;
		}
	}
}
