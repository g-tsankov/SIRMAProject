package com.sirma.itt.javacourse.objects.task4_2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Runner class for the binary homogeneous tree.
 * 
 * @author George
 */
public class BinaryRunner {
	private static Scanner scanner = new Scanner(System.in);
	private final static Logger LOGGER = LoggerFactory.getLogger(BinaryRunner.class);

	public static void main(String[] args) {
		// Create the binary tree from the sample.
		BinaryHomogeneousTree<Integer> binaryTree = new BinaryHomogeneousTree<Integer>(19);
		binaryTree.insertNode(11);
		binaryTree.insertNode(7);
		binaryTree.insertNode(16);
		binaryTree.insertNode(13);
		binaryTree.insertNode(17);
		binaryTree.insertNode(35);
		binaryTree.insertNode(23);

		// Traverse and print the tree in pre-order manner.

		binaryTree.printPreOrder();
		LOGGER.info("In order Print:");
		binaryTree.printInOrder();
		LOGGER.info("Post order print:");
		binaryTree.printPostOrder();

		// inserting a new element to the tree
		LOGGER.info("Please input a new integer to the binary tree");
		int insertedValue = scanner.nextInt();
		binaryTree.insertNode(insertedValue);
		// Search within the binary tree
		LOGGER.info("input a integer to search within the tree: ");
		int searchedValue = scanner.nextInt();
		boolean found = binaryTree.searchValue(searchedValue);
		if (found) {
			LOGGER.info(searchedValue + " is found within the binary tree");
		} else {
			LOGGER.info(searchedValue + " is not found within the binary tree");
		}
	}
}
