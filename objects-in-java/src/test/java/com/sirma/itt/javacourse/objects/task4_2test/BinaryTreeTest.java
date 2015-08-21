package com.sirma.itt.javacourse.objects.task4_2test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sirma.itt.javacourse.objects.task4_2.BinaryHomogeneousTree;
import com.sirma.itt.javacourse.objects.task4_2.BinaryHomogeneousTreeNode;

public class BinaryTreeTest {

	private BinaryHomogeneousTree<Integer> binaryTree;

	@Before
	public void createBinaryTree() {
		binaryTree = new BinaryHomogeneousTree<>(20);
		binaryTree.insertNode(15);
		binaryTree.insertNode(25);
		binaryTree.insertNode(30);
		binaryTree.insertNode(6);
		binaryTree.insertNode(27);
		binaryTree.insertNode(29);
		binaryTree.insertNode(10);
		binaryTree.insertNode(3);

	}

	/**
	 * This test tries to add an element for the second time. It should get an
	 * exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddDuplicateElement() {

		binaryTree.insertNode(3);

	}

	/**
	 * This test prints out the tree.
	 */
	@Test
	public void testSortTree() {
		binaryTree.printInOrder();
		binaryTree.printPostOrder();
		binaryTree.printPreOrder();
		binaryTree.getLeftChildNode().getRightChild();
	}

	/**
	 * This test searches for an element that exists in the tree
	 */
	@Test
	public void testFound() {
		assertTrue(binaryTree.searchValue(3));
	}

	/**
	 * This test searches for an element that doesn't exist in the tree
	 */
	@Test
	public void testNotFound() {
		assertTrue(!binaryTree.searchValue(2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void setNullValue() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getLeftChildNode()
				.getValue());
		test.setValue(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void insertNullNodeRight() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getRightChildNode()
				.getValue());
		test.setRightChild(null);
	}

	@Test
	public void insertCorrectRightNode() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getRightChildNode()
				.getValue());
		test.setRightChild(new BinaryHomogeneousTreeNode<Integer>(5));
		int actualResult = test.getRightChild().getValue();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

	@Test(expected = IllegalArgumentException.class)
	public void insertNullNodeLeft() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getLeftChildNode()
				.getValue());
		test.setRightChild(null);
	}

	@Test
	public void insertCorrectLeftNode() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getLeftChildNode()
				.getValue());
		test.setLeftChild(new BinaryHomogeneousTreeNode<Integer>(5));
		int actualResult = test.getLeftChild().getValue();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
}
