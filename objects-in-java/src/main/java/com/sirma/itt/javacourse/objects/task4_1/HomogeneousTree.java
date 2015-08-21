package com.sirma.itt.javacourse.objects.task4_1;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Root class for the Homogeneous tree.
 * 
 * @param <T>
 * @author George
 */
public class HomogeneousTree<T> {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomogeneousTree.class);
	private HomogeneousTreeNode<T> root;

	/**
	 * Constructs the tree.
	 * 
	 * @param name
	 *            -name of the node
	 * @param value
	 *            - the value of the node.
	 */
	public HomogeneousTree(String name, T value) {
		if (value == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		this.root = new HomogeneousTreeNode<T>(name, value);
	}

	/**
	 * Constructs the tree.
	 * 
	 * @param value
	 *            - the value of the root node.
	 * @param children
	 *            - the children of the root node.
	 * @param name
	 *            - name of the root node
	 */
	@SafeVarargs
	public HomogeneousTree(String name, T value, HomogeneousTree<T>... children) {
		this(name, value);
		for (HomogeneousTree<T> child : children) {
			this.root.addChild(child.root);
		}
	}

	/**
	 * @return the root node or null if the tree is empty.
	 */
	public HomogeneousTreeNode<T> getRoot() {
		return this.root;
	}

	/**
	 * @return the child nodes of the tree.
	 */
	public ArrayList<HomogeneousTreeNode<T>> getChildNodes() {
		if (this.root != null) {
			return this.root.getChildren();
		}
		return new ArrayList<HomogeneousTreeNode<T>>();
	}

	/**
	 * Traverses and prints tree in Depth First Search (DFS) manner.
	 * 
	 * @param root
	 *            - the root of the tree to be traversed.
	 * 
	 */
	private void printDFS(HomogeneousTreeNode<T> root) {
		if (this.root == null) {
			return;
		}
		LOGGER.info("Name: " + root.getName() + " value: " + root.getValue());
		HomogeneousTreeNode<T> child = null;

		for (int i = 0; i < root.getChildrenCount(); i++) {
			child = root.getChild(i);
			printDFS(child);
		}
	}

	/**
	 * Traverses and prints the tree in Depth First Search (DFS) manner.
	 */
	public void printDFS() {
		this.printDFS(this.root);
	}
}
