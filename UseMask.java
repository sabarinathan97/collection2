package Coll2;

import java.util.HashMap;

public class UseMask {
	public static void main(String[] args) {
		String[] p = args[0].split(",");
		String a = p[0];
		String b = p[1];
		String c = p[2];
		String d = p[3];
		String e = p[4];
		
		String[] z = args[1].split(",");
		int z0 = Integer.parseInt(z[0]);
		int z1 = Integer.parseInt(z[1]);
		int z2 = Integer.parseInt(z[2]);
		int z3 = Integer.parseInt(z[3]);
		int z4 = Integer.parseInt(z[4]);
		Mask m1 = new Mask(z0);
		Mask m2 = new Mask(z1);
		Mask m3 = new Mask(z2);
		Mask m4 = new Mask(z3);
		Mask m5 = new Mask(z4);
		HashMap<Mask,String> m = new HashMap<>();
		m.put(m1,a);
		m.put(m2,b);
		m.put(m3,c);
		m.put(m4,d);
		m.put(m5,e);
		
		Integer max = 0;
		for(Mask x : m.keySet()) {
			if(x.getPrice() > max) {
				max = x.getPrice();
			}
		}
		System.out.println(max+" is high price mask");
	}

}
