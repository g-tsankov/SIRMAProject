package com.sirma.itt.javacourse.objects.task4_2;

/**
 * Class representing Binary Homoheneous tree nodes.
 * 
 * @param <T>
 *            -tag
 * @author Georgi Tsankov
 */
public class BinaryHomogeneousTreeNode<T extends Comparable<T>> {
	private T value;
	private boolean hasParent;
	// Contains the left child of the node
	private BinaryHomogeneousTreeNode<T> leftChild;
	// Contains the right child of the node
	private BinaryHomogeneousTreeNode<T> rightChild;

	/**
	 * Constructs a tree node with two children.
	 * 
	 * @param value
	 *            - the value of the node.
	 * @param leftChildNode
	 *            -left child
	 * @param rightChildNode
	 *            -right child
	 */
	public BinaryHomogeneousTreeNode(T value, BinaryHomogeneousTreeNode<T> leftChildNode,
			BinaryHomogeneousTreeNode<T> rightChildNode) {
		if (value == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		this.value = value;
		this.leftChild = rightChildNode;
		this.rightChild = leftChildNode;
	}

	/**
	 * Constructs a binary tree node with no children.
	 * 
	 * @param value
	 *            - the value of the node.
	 */
	public BinaryHomogeneousTreeNode(T value) {
		this(value, null, null);
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
		if (value == null) {
			throw new IllegalArgumentException("Can't insert a null value.");
		}
		this.value = value;
	}

	/**
	 * @return the left child or null if it does not exists.
	 */
	public BinaryHomogeneousTreeNode<T> getLeftChild() {
		return this.leftChild;
	}

	/**
	 * Sets the left child.
	 * 
	 * @param value
	 *            - the new left child to be set.
	 */
	public void setLeftChild(BinaryHomogeneousTreeNode<T> value) {
		if (value == null || value.hasParent) {
			throw new IllegalArgumentException();
		}
		value.hasParent = true;
		this.leftChild = value;
	}

	/**
	 * @return the right child or null if it does not exists.
	 */
	public BinaryHomogeneousTreeNode<T> getRightChild() {
		return this.rightChild;
	}

	/**
	 * Sets the right child.
	 * 
	 * @param value
	 *            - the new right child to be set.
	 */
	public void setRightChild(BinaryHomogeneousTreeNode<T> value) {
		if (value == null || value.hasParent) {

			throw new IllegalArgumentException();
		}
		value.hasParent = true;
		this.rightChild = value;
	}

	/**
	 * Method for traversing and inserting a node in the binary tree if it
	 * doesnt exist yet.
	 * 
	 * @param newValue
	 *            - value to be inserted
	 */
	public void insertNode(T newValue) {
		if (checkEqual(newValue, value)) {
			throw new IllegalArgumentException("The element is contained in the tree!");
		}
		if (newValue.compareTo(value) < 0) {
			if (leftChild == null)
				leftChild = new BinaryHomogeneousTreeNode<T>(newValue);
			else
				leftChild.insertNode(newValue);
		} else {
			if (rightChild == null)
				rightChild = new BinaryHomogeneousTreeNode<T>(newValue);
			else
				rightChild.insertNode(newValue);
		}
	}

	/**
	 * Method checking if the value is the same with the value of the current
	 * node.
	 * 
	 * @param newValue
	 *            - value to be checked
	 * @param value
	 *            - current value of the node
	 * @return -they are equal or not
	 */
	private boolean checkEqual(T newValue, T value) {
		if (newValue == value) {
			return true;
		}
		return false;
	}

	/**
	 * Traversing and comparing if the tree contains the searched value.
	 * 
	 * @param node
	 *            -current node
	 * @param searchedValue
	 *            -value we are searching in the tree
	 * @return - the node with the same value as we are searching or a null
	 *         node.
	 */
	public BinaryHomogeneousTreeNode<T> searchNode(BinaryHomogeneousTreeNode<T> node, T searchedValue) {
		BinaryHomogeneousTreeNode<T> tempNode = node;
		while (tempNode != null) {
			int compareTo = searchedValue.compareTo(tempNode.getValue());
			if (compareTo < 0) {
				tempNode = tempNode.leftChild;
			} else if (compareTo > 0) {
				tempNode = tempNode.rightChild;
			} else {
				break;
			}
		}
		return tempNode;
	}
}
