package com.sirma.itt.javacourse.objects.task5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class for creating and working with the root node for a Heterogeneous tree.
 * 
 * @author Georgi Tsankov
 */
public class HeterogeneousTree {
	private Logger LOGGER = LoggerFactory.getLogger(HeterogeneousTree.class);
	private HeterogeneousTreeNode root;

	/**
	 * 
	 * @return -root node
	 */
	public HeterogeneousTreeNode getRoot() {
		return root;
	}

	/**
	 * Constructor for a heterogeneous tree
	 * 
	 * @param value
	 * @param leftChild
	 * @param rightChild
	 */
	private HeterogeneousTree(Object value, HeterogeneousTree leftChild, HeterogeneousTree rightChild) {
		if (value == null) {
			throw new IllegalArgumentException();
		}
		HeterogeneousTreeNode leftChildNode = leftChild != null ? leftChild.root : null;
		HeterogeneousTreeNode rightChildNode = rightChild != null ? rightChild.root : null;
		this.root = new HeterogeneousTreeNode(value, leftChildNode, rightChildNode);
	}

	/**
	 * Constructs the tree.
	 * 
	 * @param value
	 *            - the value of the node.
	 */
	public HeterogeneousTree(Object value) {
		this(value, null, null);
	}

	/**
	 * Adds new element in the heterogeneous tree.
	 * 
	 * @param value
	 *            - the value to be added to the tree
	 * @param node
	 *            - the recursive node
	 */
	public void insert(Object value, HeterogeneousTreeNode node) {
		HeterogeneousTreeNode tempNode = node;
		if (tempNode == null) {
			new HeterogeneousTreeNode(value, null, null);
		}
		if (tempNode.getValue().hashCode() < value.hashCode()) {
			if (tempNode.getRightChild() == null) {
				tempNode.setRightChild(new HeterogeneousTreeNode(value));
			} else {
				insert(value, tempNode.getRightChild());
			}
		} else {
			if (tempNode.getLeftChild() == null) {
				tempNode.setLeftChild(new HeterogeneousTreeNode(value));
			} else {
				insert(value, tempNode.getLeftChild());
			}
		}
	}

	/**
	 * Method for in order sorting a heterogeneous tree.
	 */
	public void sortTreeInOrder() {
		sortTreeInOrder(this.root);
	}

	/**
	 * Method for traversing and printing a heterogeneous tree.
	 * 
	 * @param node
	 */
	private void sortTreeInOrder(HeterogeneousTreeNode node) {

		if (node == null) {
			return;
		}
		// 1.Visit the root of this subtree
		LOGGER.info(node.getValue() + " ");
		// 2.Visit the left child
		sortTreeInOrder(node.getLeftChild());
		// 3.Visit right child
		sortTreeInOrder(node.getRightChild());
	}
}
