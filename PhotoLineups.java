import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		int i;
		int size = nameList.size();

		//base case
		if (size == 0) {
			for (i = 0; i < permList.size(); ++i) {
				System.out.print(permList.get(i) + " ");
			}
			System.out.println();
		}
		else {
			for (i = 0; i < size; ++i) {
				ArrayList<String> newPerms = new ArrayList<String>(permList);
				newPerms.add(nameList.get(i));
				ArrayList<String> newNames = new ArrayList<String>(nameList);
				newNames.remove(i);
				allPermutations(newPerms, newNames);
				// System.out.println("tracing..." + "perms arraylist " + newPerms + ' '+ "new names arraylist " + newNames);
			}
		}
	}


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		// System.out.println(nameList);
		ArrayList<String> permList = new ArrayList<String>();
		// System.out.println(permList);
		String name;
		System.out.println("Enter names, separated by a space. -1 to exit");
		name = scnr.next();
		while (!name.equals("-1")) {
			nameList.add(name);
			name = scnr.next();
		}
		// System.out.println(nameList);
		// System.out.println(permList);
		allPermutations(permList, nameList);
		// System.out.println(nameList);
		// System.out.println(permList);
	}
}
