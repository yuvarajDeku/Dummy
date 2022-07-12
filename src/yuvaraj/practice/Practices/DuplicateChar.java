package yuvaraj.practice.Practices;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	static void yuviva(String str) {
		Map<Character,Integer> yuvi=new HashMap<>();
		char[] charr=str.toCharArray();
		for(char keys : charr) {
			if(Character.isAlphabetic(keys)) {
				if(yuvi.containsKey(keys)) {
					yuvi.put(keys, yuvi.get(keys)+1);
				}
				else {
					yuvi.put(keys, 1);
				}
			}
		}
		//to remove key which have value 1
		yuvi.entrySet().removeIf(i->i.getValue()==1);
		System.out.println("No Of duplication ");
		System.out.println(yuvi);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="yuvarajLoganathan";
		yuviva(str);
		Map<Character,Integer> yuvi=new HashMap<>();
		char[] charr=str.toCharArray();
		
		for(char keys : charr) {
			if(Character.isAlphabetic(keys)) {
				if(yuvi.containsKey(keys)) {
					yuvi.put(keys, yuvi.get(keys)+1);
				}
				else {
					yuvi.put(keys, 1);
				}
			}
		}
		//to remove key which have value 1
		//yuvi.entrySet().removeIf(i->i.getValue()==1);
		System.out.println("No Of Occurance of Each Character ");
		System.out.println(yuvi);
		
		}

}
