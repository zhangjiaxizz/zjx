package com.util;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibUtil {
   private static SessionFactory sessionFactory;
   static{
	   //创建读取配置文件的对象
	   Configuration cfx=new Configuration();
	   //读取配置文件
	   cfx.configure();
	   //创建session工厂
	   sessionFactory=cfx.buildSessionFactory();
   }
   public static Session getSession(){
	   return sessionFactory.openSession();
   }
   public static SessionFactory getSessionFactory(){
	   return sessionFactory;
   }
   public static void close(Session s){
	   if(s!=null){
		   s.close();
	   }
   }
   
   //添加方法
   public static int add(Object obj){
	   Session s=null;
	   Transaction tx=null;
	   Serializable i=null;
	   try{
		   s=HibUtil.getSession();
		   tx=s.beginTransaction();
		   i=s.save(obj);
		   tx.commit();
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   HibUtil.close(s);
	   }
	   return (Integer)i;
   }
   
   //删除方法
   public static void delete(Object obj){
	  Session s=null;
	  Transaction t=null;
	  try{
		  s=HibUtil.getSession();
		  t=s.beginTransaction();
		  s.delete(obj);
		  t.commit();
	  }finally{
		  HibUtil.close(s);
	  }
   }
   
   //修改方法
   public static void update(Object obj){
	   Session s=null;
	   Transaction t=null;
	   try{
		   s=HibUtil.getSession();
		   t=s.beginTransaction();
		   s.update(obj);
		   t.commit();
	   }finally{
		   HibUtil.close(s);
	   }
   }
   
   //查询方法get
   public static Object get(Class clazz,Serializable id){
	   Session s=null;
	   try{
		   s=HibUtil.getSession();
		   return s.get(clazz, id);
	   }finally{
		   HibUtil.close(s);
	   }
   }
   
 //查询方法load
   public static Object load(Class clazz,Serializable id){
	   Session s=null;
	   try{
		   s=HibUtil.getSession();
		   Object obj=s.get(clazz, id);
		   System.out.println(obj);
		   return obj;
	   }finally{
		   HibUtil.close(s);
	   }
   }
}
