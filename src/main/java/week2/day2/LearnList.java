package week2.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("babu");
		list.add("gopi");
		list.add("Sarath");
		System.out.println(list.size());
		for (String each : list) {
			if(each.startsWith("S"))
			{
				System.out.println(each);
			}
		}

		System.out.println(list.remove(1));
		System.out.println(list.size());
		list.clear();
		System.out.println(list.isEmpty());
	}

}
