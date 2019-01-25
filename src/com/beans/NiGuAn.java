package com.beans;

import java.util.Set;

public class NiGuAn {
   private int id;
   private String name;
   private Set<NiGu> niguSet;
public Set<NiGu> getNiguSet() {
	return niguSet;
}
public void setNiguSet(Set<NiGu> niguSet) {
	this.niguSet = niguSet;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}
