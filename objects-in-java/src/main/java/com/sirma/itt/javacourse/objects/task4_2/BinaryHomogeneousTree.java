package com.sirma.itt.javacourse.objects.task4_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a binary tree structure.
 * 
 * @param T
 *            -tag
 * @author Georgi Tsankov
 */
public class BinaryHomogeneousTree<T extends Comparable<T>> {
	// create the root of the tree
	private BinaryHomogeneousTreeNode<T> root;
	private Logger LOGGER = LoggerFactory.getLogger(BinaryHomogeneousTree.class);

	/**
	 * Constructs the tree.
	 * 
	 * @param value
	 *            - the value of the node.
	 * @param leftChild
	 *            - the left child of the node.
	 * @param rightChild
	 *            -the right child of the node
	 */
	public BinaryHomogeneousTree(T value, BinaryHomogeneousTree<T> leftChild, BinaryHomogeneousTree<T> rightChild) {
		if (value == null) {
			throw new IllegalArgumentException();
		}
		BinaryHomogeneousTreeNode<T> leftChildNode = leftChild != null ? leftChild.root : null;
		BinaryHomogeneousTreeNode<T> rightChildNode = rightChild != null ? rightChild.root : null;
		this.root = new BinaryHomogeneousTreeNode<T>(value, leftChildNode, rightChildNode);
	}

	/**
	 * Constructs the tree.
	 * 
	 * @param value
	 *            - the value of the node.
	 */
	public BinaryHomogeneousTree(T value) {
		this(value, null, null);
	}

	/**
	 * @return the root of the tree.
	 */
	public BinaryHomogeneousTreeNode<T> getRoot() {
		return this.root;
	}

	/**
	 * @return the left child of the root.
	 */
	public BinaryHomogeneousTreeNode<T> getLeftChildNode() {
		if (this.root != null) {
			return this.root.getLeftChild();
		}
		return null;
	}

	/**
	 * @return the right child of the root.
	 */
	public BinaryHomogeneousTreeNode<T> getRightChildNode() {
		if (this.root != null) {
			return this.root.getRightChild();
		}
		return null;
	}

	/**
	 * Traverses binary tree in pre-order manner.
	 * 
	 * @param node
	 *            - the binary tree to be traversed.
	 */
	private void printPreOrder(BinaryHomogeneousTreeNode<T> node) {
		if (node == null) {
			return;
		}
		// 1. Visit the left child.
		printPreOrder(node.getLeftChild());
		// 2. Visit the root of this subtree.
		LOGGER.info(node.getValue() + " ");
		// 3. Visit the right child.
		printPreOrder(node.getRightChild());
	}

	/**
	 * Traverses and prints the binary tree in pre-order manner.
	 */
	public void printPreOrder() {

		printPreOrder(this.root);

	}

	/**
	 * Traverses the tree in a In-order manner.
	 * 
	 * @param node
	 *            -tree node
	 */
	private void printInOrder(BinaryHomogeneousTreeNode<T> node) {

		if (node == null) {
			return;
		}
		// 1.Visit the root of this subtree
		LOGGER.info(node.getValue() + " ");
		// 2.Visit the left child
		printInOrder(node.getLeftChild());
		// 3.Visit right child
		printInOrder(node.getRightChild());
	}

	/**
	 * Traverse and print the binary tree in a in-order manner.
	 */
	public void printInOrder() {
		printInOrder(this.root);
	}

	/**
	 * Traverse and print the binary tree in a post-order manner.
	 */
	public void printPostOrder() {
		printPostOrder(this.root);
	}

	/**
	 * Traverse the tree in a post-order manner.
	 * 
	 * @param node
	 *            - current node
	 */
	private void printPostOrder(BinaryHomogeneousTreeNode<T> node) {
		if (node == null) {
			return;
		}
		// 1.get left child
		printPostOrder(node.getLeftChild());
		// 2.get right child
		printPostOrder(node.getRightChild());
		// 3.Print
		LOGGER.info(node.getValue() + " ");

	}

	/**
	 * Method for inserting a new value to the tree.
	 * 
	 * @param newValue
	 *            the new value to be inserted
	 */
	public void insertNode(T newValue) {
		root.insertNode(newValue);
	}

	/**
	 * Search a specified value in the binary tree.
	 * 
	 * @param searchedValue
	 *            -searched value
	 * @return -boolean if its found or not.
	 */
	public boolean searchValue(T searchedValue) {
		BinaryHomogeneousTreeNode<T> node = this.root;
		BinaryHomogeneousTreeNode<T> result = node.searchNode(node, searchedValue);
		if (result != null) {
			return true;
		}
		return false;

	}
}
