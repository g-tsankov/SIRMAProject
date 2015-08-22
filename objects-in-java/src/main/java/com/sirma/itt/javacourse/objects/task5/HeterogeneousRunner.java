package com.sirma.itt.javacourse.objects.task5;

/**
 * Runner class for HeterogeneousTree class.
 * 
 * @author Georgi Tsankov
 */
public class HeterogeneousRunner {

	public static void main(String[] args) {

		HeterogeneousTree tree = new HeterogeneousTree(new Integer(4));
		tree.insert(new String("sada"));
		Object obj = new Object();
		Object obj2 = new Object();
		Integer integer = new Integer(5);
		String str = new String("a");
		String str2 = new String("b");
		tree.insert(obj2);
		tree.insert(obj);
		tree.insert(str2);
		tree.insert(str);
		tree.insert(integer);
		tree.sortTreeInOrder();

	}

}
