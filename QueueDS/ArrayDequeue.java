package QueueDS;

import java.util.ArrayDeque;

public class ArrayDequeue {

	public static void main(String[] args) {
		ArrayDeque<String> d = new ArrayDeque<>();
		d.add("Bhopal");
		d.add("Delhi");
		d.add("Mumbai");
		System.out.println(d);
		d.addFirst("Kanpur");
		System.out.println(d);
		d.addLast("Bihar");
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.size());
		System.out.println(d.remove("Bhopal"));
		
	}

}