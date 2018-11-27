package week2.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Gopakumar");
		list.add("Prabha");
		list.add("Rahul");
		list.add("Aiswarya");
		list.add("Vidyut");
		list.add("Vidyut");
		
	   System.out.println(list.size());
	
	Set<String> newset=new LinkedHashSet<String>();
	newset.addAll(list);
	list.clear();
	list.addAll(newset);
	Collections.sort(list);
	System.out.println(list);
	
	
	
	}
	

}
