package com.sirma.itt.javacourse.objects.task4_2test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sirma.itt.javacourse.objects.task4b.BinaryHomogeneousTree;
import com.sirma.itt.javacourse.objects.task4b.BinaryHomogeneousTreeNode;

public class BinaryTreeTest {

	private BinaryHomogeneousTree<Integer> binaryTree;

	/**
	 * creating the tree. Calling getters for coverage purposes.
	 */
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
		binaryTree.getLeftChildNode().getRightChild();
	}

	/**
	 * add an duplicate element for the. It should get an exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddDuplicateElement() {

		binaryTree.insertNode(3);

	}

	/**
	 * prints out the tree.
	 */
	@Test
	public void testSortTree() {
		binaryTree.printInOrder();
		binaryTree.printPostOrder();
		binaryTree.printPreOrder();

	}

	/**
	 * searches for an element that exists in the tree
	 */
	@Test
	public void testFound() {
		assertTrue(binaryTree.searchValue(3));
	}

	/**
	 * searches for an element that doesn't exist in the tree
	 */
	@Test
	public void testNotFound() {
		assertTrue(!binaryTree.searchValue(2));
	}

	/**
	 * Incorrect value insertion
	 */
	@Test(expected = IllegalArgumentException.class)
	public void setNullValue() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getLeftChildNode()
				.getValue());
		test.setValue(null);
	}

	/**
	 * incorrect right node insertion
	 */
	@Test(expected = IllegalArgumentException.class)
	public void insertNullNodeRight() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getRightChildNode()
				.getValue());
		test.setRightChild(null);
	}

	/**
	 * correct right node insertion
	 */
	@Test
	public void insertCorrectRightNode() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getRightChildNode()
				.getValue());
		test.setRightChild(new BinaryHomogeneousTreeNode<Integer>(5));
		int actualResult = test.getRightChild().getValue();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

	/**
	 * incorrect left node insertion
	 */
	@Test(expected = IllegalArgumentException.class)
	public void insertNullNodeLeft() {
		BinaryHomogeneousTreeNode<Integer> test = new BinaryHomogeneousTreeNode<>(binaryTree.getLeftChildNode()
				.getValue());
		test.setLeftChild(null);
	}

	/**
	 * correct left node insertion
	 */
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
