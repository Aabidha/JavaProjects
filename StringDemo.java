

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {
	
		
		List<String> words=new ArrayList<>();
		System.out.println("Enter a String:");
		
		while(true) {
            Scanner sc = new Scanner (System.in);
			String str=sc.next();
			
			if(str.equals("stop")) {
				break;
			}		
			words.add(str);			
		}		
		
		System.out.println("words entered:" +words);
		System.out.println("***********************************");
		System.out.println("Word count for the words entered");
		System.out.println("***********************************");
		for(String word: words)
		{
			System.out.println(word+" "+word.length());
			
			
			
		}	
		System.out.println("***********************************");
		System.out.println("Ascending Order of the words entered");
		System.out.println("***********************************");
		for(String word:words) {
			char[] asc=word.toCharArray();
			Arrays.sort(asc);
			String ascWord=new String(asc);
			
			System.out.println(word+"->"+ascWord);
			
		}
		System.out.println("***********************************");
		System.out.println("Descending Order of the words entered");
		System.out.println("***********************************");
		for(String word:words) {
			char[] des=word.toCharArray();
			Arrays.sort(des);
			String desWord=new StringBuilder(new String(des)).reverse().toString();
			
			System.out.println(word+"->"+desWord);
			
		}
		
		
		
	}  
	
}
