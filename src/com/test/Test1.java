package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.UserInfo;
import com.util.HibUtil;

public class Test1 {
  public static void main(String[] args){
	UserInfo userInfo=(UserInfo)HibUtil.load(UserInfo.class, 7);
	userInfo.setPassword("mmm");
	userInfo.setUserName("nnn");
	HibUtil.update(userInfo);
  }
  public static UserInfo query1(){
	  Session s=null;
	  UserInfo userInfo=null;
	  try{
		  s=HibUtil.getSession();
		 userInfo=(UserInfo)s.get(UserInfo.class, 4);
		System.out.println(userInfo.getUserName());
		 
	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		  HibUtil.close(s);
	  } return userInfo;
	  
  }
  
  
  public static UserInfo query2(){
	  Session s=null;
	  UserInfo userInfo=null;
	  try{
		  s=HibUtil.getSession();
		 userInfo=(UserInfo)s.load(UserInfo.class, 4);
		 System.out.println(userInfo.getUserName());
		 
	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		  HibUtil.close(s);
	  } return userInfo;
	  
  }
}
