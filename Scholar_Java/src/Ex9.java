//WAP to remove elements from an ArrayList

import java.util.ArrayList;
import java.util.List;

public class Ex9 {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		System.out.println(lst);
		lst.remove(3);
		lst.remove(1);
		System.out.println(lst);
	}
}