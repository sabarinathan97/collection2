package Coll2;

import java.util.HashMap;

public class UsePen {
	public static void main(String[] args) {
		String[] num = args[0].split(",");
		float num1 = Float.parseFloat(num[0]);
		float num2 = Float.parseFloat(num[1]);
		float num3 = Float.parseFloat(num[2]);

		String[] name = args[1].split(",");
		String name1 = name[0];
		String name2 = name[1];
		String name3 = name[2];
		
		String[] p = args[2].split(",");
		int a = Integer.parseInt(p[0]);
		int b = Integer.parseInt(p[1]);
		int c = Integer.parseInt(p[2]);
		
		Pen p1 = new Pen(num1,name1);
		Pen p2 = new Pen(num2,name2);
		Pen p3 = new Pen(num3,name3);
		
		HashMap<Integer,Pen> penDetail = new HashMap<>();
		penDetail.put(a, p1);
		penDetail.put(b, p2);
		penDetail.put(c, p3);
		
		for(Integer x : penDetail.keySet()) {
			System.out.println(x+" = "+penDetail.get(x));
		}                                  
		/*for(Pen x : penDetail.values()) {
			System.out.println(x.get()+" "+x);
		}*/
	}
}
