package com.sirma.itt.javacourse.objects.task5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class HeterogeneousTreeTest {
	HeterogeneousTree tree = new HeterogeneousTree("Scarf");

	@Before
	public void insertingInTree() {
		tree.insert("value");
		tree.insert(new Integer(5));
		tree.insert(new Double(24.43));
		tree.insert(new ArrayList<Integer>(53));
		tree.insert(new Object());
		tree.insert(new BigDecimal("32154234"));
		tree.insert(new BigInteger("32145531"));
	}

	@Test
	public void testCoverage() {
		Object obj = new Object();
		tree.insert(obj);
		tree.sortPostOrder();
		tree.sortPreOrder();
		tree.sortTreeInOrder();
	}

	@Test(expected = IllegalArgumentException.class)
	public void valueNull() {
		new HeterogeneousTreeNode(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void insertingNull() {
		HeterogeneousTreeNode left = new HeterogeneousTreeNode(tree.getRoot().getLeftChild().getValue());
		HeterogeneousTreeNode right = new HeterogeneousTreeNode(tree.getRoot().getRightChild().getValue());
		new HeterogeneousTreeNode(null, left, right);

	}
}
