package week5.string;

import java.io.*;
import java.util.Scanner;

public class ReadingfromTextFile {
	 private static Scanner sc;

	public static void main(String[] args)throws Exception 
	  { 
	  // We need to provide file path as the parameter: 
	  // double backquote is to avoid compiler interpret words 
	  // like \test as \t (ie. as a escape sequence) 
	 /* File file = new File("C:\\aishu bk\\Aishu laptop\\F drive\\ais\\checkingread.txt"); 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  while ((st = br.readLine()) != null) 
	    System.out.println(st); 
	  } */
	// pass the path to the file as a parameter 
	    /*FileReader fr = 
	      new FileReader("C:\\aishu bk\\Aishu laptop\\F drive\\ais\\checkingread.txt"); 
	  
	    int i; 
	    while ((i=fr.read()) != -1) 
	      System.out.print((char)i); */
	 // pass the path to the file as a parameter 
	    File file = 
	      new File("C:\\aishu bk\\Aishu laptop\\F drive\\ais\\checkingread.txt"); 
	    sc = new Scanner(file); 
	  sc.useDelimiter("\\Z");
	   //while (sc.hasNextLine()) 
	      System.out.println(sc.next()); 
	  } 
}
