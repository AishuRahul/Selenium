package week5.string;

//Java prorgam to count frequencies of 
//characters in string using Hashmap 
import java.io.*; 
import java.util.*; 
public class OccurancesOfChar { 
 static void characterCount(String inputString) 
 { 
     // Creating a HashMap containing char 
     // as a key and occurrences as  a value 
     HashMap<Character, Integer> occuranceMap 
         = new HashMap<Character, Integer>(); 

     // Converting given string to char array 

     char[] charArray = inputString.toCharArray(); 

     // checking each char of strArray 
     for (char eachchar : charArray) { 
         if (occuranceMap.containsKey(eachchar)) { 

             // If char is present in charCountMap, 
             // incrementing it's count by 1 
             occuranceMap.put(eachchar, occuranceMap.get(eachchar) + 1); 
         } 
         else { 

             // If char is not present in charCountMap, 
             // putting this char to charCountMap with 1 as it's value 
        	 occuranceMap.put(eachchar, 1); 
         } 
     } 

     // Printing the charCountMap 
     for (Map.Entry entry : occuranceMap.entrySet()) { 
         System.out.println(entry.getKey() + "-----> " + entry.getValue()); 
     } 
 } 

 // Driver Code 
 public static void main(String[] args) 
 { 
     String str = "welcome to automation";
     String replaced=str.replace(" ","");
    // System.out.println(replaced);
     characterCount(replaced); 
 } 
} 
