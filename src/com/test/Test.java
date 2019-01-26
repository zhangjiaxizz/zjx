package com.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.beans.NiGu;
import com.beans.NiGuAn;
import com.util.HibUtil;


public class Test {
  public static void main(String[] args){
    System.out.println("aaaaa");
	 NiGu nigu1=new NiGu();
	 nigu1.setFahao("dd");
	 NiGu nigu2=new NiGu();
	 nigu2.setFahao("ee");
	 Set<NiGu> niguSet=new HashSet<NiGu>();
	 niguSet.add(nigu1);
	 niguSet.add(nigu2);
	 
	 NiGuAn niguan=new NiGuAn();
	 niguan.setName("NNN");
	 niguan.setNiguSet(niguSet);
	 
	 Session s=HibUtil.getSession();
	 Transaction t=s.beginTransaction();
	 //s.save(nigu1);
	 //s.save(nigu2);
	 s.save(niguan);
	 t.commit();
	 HibUtil.close(s);
	 
  }
  

}
