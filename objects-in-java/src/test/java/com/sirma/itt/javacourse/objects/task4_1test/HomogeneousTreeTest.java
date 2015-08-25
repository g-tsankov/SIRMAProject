package com.sirma.itt.javacourse.objects.task4_1test;

import org.junit.Test;

import com.sirma.itt.javacourse.objects.task4a.HomogeneousTree;
import com.sirma.itt.javacourse.objects.task4a.HomogeneousTreeNode;

public class HomogeneousTreeTest {

	@Test
	public void coverageTest() {
		HomogeneousTree<Integer> tree = new HomogeneousTree<>("Sava", 7, new HomogeneousTree<>("Kiril", 4,
				new HomogeneousTree<>("Sander", 54)), new HomogeneousTree<>("Metodii", 24));
		tree.printDFS();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullInput() {
		HomogeneousTree<Integer> test = new HomogeneousTree<>(null, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullValueInput() {
		HomogeneousTree<Integer> test = new HomogeneousTree<>("Sava", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testHasParent() {
		HomogeneousTreeNode<Integer> test = new HomogeneousTreeNode<>("Kiril", 24);
		test.setHasParent(true);
		test.addChild(test);
	}
}