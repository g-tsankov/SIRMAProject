package com.sirma.itt.javacourse.objects.task4_1;

/**
 * Runner class for the homoheneous tree.
 * 
 * @author Georgi Tsankov
 */
public class TreeRunner {

	public static void main(String[] args) {
		// Create a Integer tree.
		HomogeneousTree<Integer> integerTree = new HomogeneousTree<Integer>("Kiro", 7, new HomogeneousTree<Integer>(
				"Sasho", 19, new HomogeneousTree<Integer>("Miro", 1), new HomogeneousTree<Integer>("Deniz", 12),
				new HomogeneousTree<Integer>("Gabar", 31)), new HomogeneousTree<Integer>("Ilko", 21),
				new HomogeneousTree<Integer>("Gabriel", 14, new HomogeneousTree<Integer>("Ivo", 23),
						new HomogeneousTree<Integer>("Marian", 6)));
		integerTree.printDFS();
		// test with a String tree
		HomogeneousTree<String> stringTree = new HomogeneousTree<String>("Kiro", "Mustakov",
				new HomogeneousTree<String>("Kiril", "Varbanov"), new HomogeneousTree<String>("Sali", "Mehmedov"));
		stringTree.printDFS();
	}

}
