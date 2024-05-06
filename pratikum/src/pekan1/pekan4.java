package pekan1;

import java.util.ArrayList;

public class pekan4 {public static void main (String [] args) {
	// Creating an Arraylist of string type
	ArrayList<String> al = new ArrayList<>();
	// adding elements to Arraylist
	// using standarts add() method
	al.add("saya");
	al.add("informatika");
	al.add(1,"mahasiswa");
	// Using the Get method and the
	// for loop
	for (int i = 0; i < al.size(); i++) {
	System.out.println(al.get(i) + " ");
	}
	System.out.println();
	// using the for each loop
	for (String str :al)
	System.out.println(str + " ");
	System.out.println();
	//Printing all elemets of ArrayList
	System.out.println("Initial ArrayList " + al);
	// Removing element from above ArrayList
	al.remove(1);
	// Printing the updated Arraylist elements
	System.out.println("After the index Removsl " + al);
	// Removing this word element in Arraylist
	al.remove("saya");
	// Now printing updated ArraList
	System.out.println("After the Object Removal " + al);
		
}

}
