package Coll2;

import java.util.HashMap;

public class Sample {
	public static void main(String[] args) {
		HashMap <Integer,String> s = new HashMap<>();
		s.put(868, "sabari");
		s.put(850, "bala");
		s.put(869, "suriya");
		s.put(840, "abi");
		/*System.out.println((s));
		s.remove(840);
		System.out.println(s);
		System.out.println(s.get(850));
		System.out.println(s.keySet());
		System.out.println(s.values());*/
		
		/*for(Integer e : s.keySet()) {
			System.out.println(e+" "+s.get(e));
		}*/
		/*for(String e : s.values()) {
			System.out.println(e+" "+s.keySet());
		}*/
		//s.keySet().forEach(x -> {System.out.println(x);});
		//s.values().forEach(y -> {System.out.println(y);});
		//s.forEach((x,y) -> {System.out.println(x+" "+y);});
		
		/*for(Integer e : s.keySet()) {
			System.out.println(s.get(e));
		}*/
		
		s.keySet().forEach(x -> {System.out.println(s.get(x));}); 
		
	}
}
