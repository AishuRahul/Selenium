package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {

		String text = "testleaf";
		char[] ch = text.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();
		/*for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				int value = map.get(ch[i]) + 1;
				map.put(ch[i], value);
			} else {
				map.put(ch[i], 1);
			}

		}*/
		for (char c : ch) {
			if (map.containsKey(c)) {
				int value = map.get(c) + 1;
				map.put(c, value);
			}else
			{
				map.put(c,1);
			}
		}
		System.out.println(map);
		for (Entry<Character, Integer> each : map.entrySet()) {
			System.out.println(each.getKey() + "-->" + each.getValue());
		}

	}

}
