package javaPractiece;

import java.util.StringTokenizer;
public class CountString {

	public static void main(String[] args) {
		int vowel=0,consonants=0;
		String name = "Anudip foundation";
		StringTokenizer st = new StringTokenizer(name);
		for (int i = 0; i < name.length(); i++) { 
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') 
                vowel++; 
            else {
            	consonants++;	
            }
		}
		System.out.println("vowels: "+vowel);
		System.out.println("consonants : " +consonants);
  	}

}
