package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.beans.UserInfo;
import com.util.HibUtil;


public class Test2 {
  public static void main(String[] args){
	 
	  add();
  }
  
  public static void add(){
	  Session s=null;
	  Transaction t=null;
	  try{
		  s=HibUtil.getSession();
		  t=s.beginTransaction();
		  UserInfo user=new UserInfo();
		  user.setPassword("zg");
		  user.setUserName("12376");
		  s.save(user);
		  t.commit();
	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		  HibUtil.close(s);
	  }
  }
}
