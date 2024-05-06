package pekan1;

import java.util.ArrayList;

public class pekan1 {public static void main (String[] args) {
	// Size of the ArrayList
	int n = 5;
	//Declaring the Arraylist with initial size n
	ArrayList<Integer> arrli = new ArrayList<Integer>(n);
	// Appending new elemets at the end of the list
	for (int i = 1; i <= n; i++)
	arrli.add(i);
	//Printinhg elemets
	System.out.println(arrli);
	//Remove elemet at index 3
	arrli.remove(3);
	//Displaying the Arraylist
	//after delection
	System.out.println(arrli);
	// Printing elemets one by one
	for (int i = 0; i < arrli.size(); i++)
	System.out.println(arrli.get(i) + " ") ;
}
		
	

}


