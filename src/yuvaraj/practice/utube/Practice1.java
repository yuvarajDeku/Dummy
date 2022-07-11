package yuvaraj.practice.utube;

import java.util.stream.Collectors;
import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Yuvi", 500);
		mapa.put("Ravi", 100);
		mapa.put("Kannan", 200);
		mapa.put("Ram", 300);
		mapa.put("Dev", 400);

		System.out.println("Before Sorting HashMap");
		System.out.println(mapa);
		System.out.println();
		
		//UsingKey
		
		LinkedHashMap<String, Integer> SortedMapOnKey = mapa.entrySet().stream().sorted((e1, e2) -> {

			return e1.getKey().compareToIgnoreCase(e2.getKey()) ;
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("After Sorting BY Key");
		System.out.println(SortedMapOnKey);
		System.out.println();
		
		//Using value
		LinkedHashMap<String, Integer> SortedOnValue = mapa.entrySet().stream().sorted((e1, e2) -> {

			return e1.getValue()- e2.getValue(); 
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("After Sorting By Value");
		System.out.println(SortedOnValue);
	
		
	} 

}
