package jsonDemo;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("name", "Jacky");
		map.put("age", 30);
		map.put("gender", "1");
		JSONObject jsonObjectJacky = new JSONObject(map);
		 System.out.println("2: " + jsonObjectJacky);
		 String jackyJsonString = jsonObjectJacky.toString();
		 System.out.println(jackyJsonString);
		 JSONArray jsonArrayNames = jsonObjectJacky.names();
		 
		 System.out.println("5: " + jsonArrayNames);
		 jsonObjectJacky.put("array",jsonArrayNames);
		 System.out.println(jsonObjectJacky.get("array").toString());
		 try {
			 Class clazz = Class.forName("json-java.jar");
			 System.out.println(clazz.getName()); // java.lang.String
			} catch(ClassNotFoundException e) {
			 System.out.println("Can't find class");
			}
	}

}
