package com.strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class noslowestoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n="1241244425";
char[] cn=n.toCharArray();
HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
for(char c:cn){
	if(hmap.containsKey(c)){
		hmap.put(c, hmap.get(c)+1);
	}
	else{
		hmap.put(c, 1);
	}
}
System.out.println(hmap);
//creating entryset
Set<Entry<Character,Integer>> entries=hmap.entrySet();
//using comparator for sorting hmapvalues
Comparator<Entry<Character,Integer>> valuecomparator = new Comparator<Entry<Character,Integer>>(){
	public int compare(Entry<Character,Integer> e1,Entry<Character,Integer> e2){
		Integer i1=e1.getValue();
		Integer i2=e2.getValue();
		return i1.compareTo(i2);
	}
};
//convering set to list as it required for collection.sort method
List<Entry<Character,Integer>> listofentries=new ArrayList<Entry<Character,Integer>>(entries);
//sorting is done here using valuecompoarator
Collections.sort(listofentries, valuecomparator);
for(Entry<Character, Integer> listofentries1 :listofentries){
	//printing keys with repect to values
	for(int i =0;i<listofentries1.getValue();i++){
		System.out.print(listofentries1.getKey());
		
	}

}

	}
	}



