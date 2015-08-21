package com.sirma.itt.javacourse.objects.task4_1;

import java.util.ArrayList;

/**
 * Class representing the nodes of the tree.
 * 
 * @param <T>
 * @author Georgi Tsankov
 */
public class HomogeneousTreeNode<T> {
	// Contains the name variable of the node
	private String name;
	// Contains the value variable of the node
	private T value;
	// Shows whether the current node has parent
	private boolean hasParent;

	/**
	 * 
	 * @param hasParent
	 *            the value of hasParent
	 */
	public void setHasParent(boolean hasParent) {
		this.hasParent = hasParent;
	}

	// Contains the children of the node
	private ArrayList<HomogeneousTreeNode<T>> children;

	/**
	 * Constructs a tree node.
	 * 
	 * @param name
	 *            -String variable of the node
	 * @param value
	 *            - the value of the node.
	 */
	public HomogeneousTreeNode(String name, T value) {
		if (value == null || name == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		setName(name);
		setValue(value);
		this.setChildren(new ArrayList<HomogeneousTreeNode<T>>());
	}

	/**
	 * 
	 * @return name -variable of the node
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 *            -name variable to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value of the node.
	 */
	public T getValue() {
		return this.value;
	}

	/**
	 * Sets the value of the node.
	 * 
	 * @param value
	 *            - the value to be set.
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * Adds child to the node.
	 * 
	 * @param child
	 *            - the child to be added.
	 */
	public void addChild(HomogeneousTreeNode<T> child) {

		if (child == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		if (child.hasParent) {
			throw new IllegalArgumentException("The node already has a parent!");
		}
		child.hasParent = true;
		this.getChildren().add(child);
	}

	/**
	 * Gets the child of the node at given index.
	 * 
	 * @param index
	 *            - the index of the desired child.
	 * @return the child on the given position.
	 */
	public HomogeneousTreeNode<T> getChild(int index) {
		return this.getChildren().get(index);
	}

	/**
	 * @return the number of node's children.
	 */
	public int getChildrenCount() {
		return this.getChildren().size();
	}

	/**
	 * Returns an ArrayList of the children nodes.
	 * 
	 * @return children nodes
	 */
	public ArrayList<HomogeneousTreeNode<T>> getChildren() {
		return children;
	}

	/**
	 * Sets an array list of nodes as children.
	 * 
	 * @param children
	 *            ArrayList of children nodes
	 */
	public void setChildren(ArrayList<HomogeneousTreeNode<T>> children) {
		this.children = children;
	}

}
