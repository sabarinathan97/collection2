package Coll2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("sabari",101,25,"male","ece",78);
		Student s2 = new Student("abi",102,24,"female","eee",87);
		Student s3 = new Student("bala",103,26,"male","cse",88);
		Student s4 = new Student("surya",104,23,"male","civil",79);
		Student s5 = new Student("sara",105,24,"female","ece",86);
		Student s6 = new Student("gopi",106,22,"male","mech",89);
		
		HashMap<Integer,Student> s  = new HashMap<>();
		s.put(s1.getId(), s1);
		s.put(s2.getId(), s2);
		s.put(s3.getId(), s3);
		s.put(s4.getId(), s4);
		s.put(s5.getId(), s5);
		s.put(s6.getId(), s6);
		
		//HashMap<Integer,Student> f = new HashMap<>();
		/*for(Student c : s.values()) {
			if(c.getAge() >= 25) {
				f.put(c.getId() , c);
			}
		}*/
		
		/*f.values().forEach(x -> {System.out.println(x);});*/
		
		//HashMap<Integer,Student> f = new HashMap<>();//
		/*for(Integer c : s.keySet()) {
			if(s.get(c).getGender().equalsIgnoreCase("female")) {
				f.put(c, s.get(c));
		}
	}*/
		/*s.keySet().forEach(x -> {
			if(s.get(x).getAge()>25) {
				f.put(x, s.get(x));
				System.out.println(s.get(x));
			}
		});*/
		/*s.values().forEach(x -> {
			if(x.getAge()>25) {
				f.put(x.getId(), x);
			}
		}
		);
		System.out.println(f);*/
		
		/*Iterator<Integer> x = s.keySet().iterator();
		while(x.hasNext()) {
			if(s.get(x.next()).getAge()>25) {
				x.remove();
			}
		}*/
		/*Iterator<Integer> a = s.keySet().iterator();
		while(a.hasNext()) {
			if(s.get(a.next()).getAge()>25) {
				a.remove()2;		
			}s.keySet()) {
			if(num.get(b).getAge()>)
		}*/
		
		//System.out.println(s);
		//s.forEach((m,n)-> { System.out.println(n);});
	}
}
  