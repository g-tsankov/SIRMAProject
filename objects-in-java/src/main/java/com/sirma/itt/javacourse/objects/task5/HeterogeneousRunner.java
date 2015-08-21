package com.sirma.itt.javacourse.objects.task5;

/**
 * Runner class for HeterogeneousTree class.
 * 
 * @author Georgi Tsankov
 */
public class HeterogeneousRunner {

	public static void main(String[] args) {

		HeterogeneousTree tree = new HeterogeneousTree(new Integer(4));
		tree.insert(new String("sada"), tree.getRoot());
		Object obj = new Object();
		Object obj2 = new Object();
		Integer inte = new Integer(5);
		String str = new String("a");
		String str2 = new String("b");
		tree.insert(obj2, tree.getRoot());
		tree.insert(obj, tree.getRoot());
		tree.insert(str2, tree.getRoot());
		tree.insert(str, tree.getRoot());
		tree.insert(inte, tree.getRoot());
		tree.sortTreeInOrder();

	}

}
