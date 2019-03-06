package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String,String> pCode = new HashMap<String,String>(); pCode.put("BARCELONA",
				"FCB"); pCode.put("MADRID", "REAL MADRID"); pCode.put("MUNCHEN", "BAYERN");
		for (Map.Entry<String,String> CITY : pCode.entrySet()) {
			System.out.println(CITY.getKey()+"\t"+CITY.getValue()); }



		List<String> FCB= new LinkedList<String>();
		FCB.add("MESSI");FCB.add("PIQUE");FCB.add("NEIMAR");
		List<String> MADRID = new ArrayList<String>();
		MADRID.add("RONALDO");MADRID.add("DiMARIA");MADRID.add("GONZALO");

		Map<String, List<String>> map =new LinkedHashMap<String, List<String>>();
		map.put("BARCELONA", FCB);map.put("MADRID", MADRID);

		for (Map.Entry<String,List<String>> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

}