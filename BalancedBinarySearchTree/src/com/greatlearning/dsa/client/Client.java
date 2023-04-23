package com.greatlearning.dsa.client;

import com.greatlearning.dsa.balancedbinarysearchtree.BalancedBinarySearchTree;

public class Client {

	public static void main(String[] args) {
		BalancedBinarySearchTree tree = new BalancedBinarySearchTree();
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(1);
		tree.insert(6);
		tree.insert(14);
		tree.insert(4);
		tree.insert(7);
		tree.insert(13);


		int sum1 = 20;

		if(!tree.findPairWithSum(sum1)) {
			System.out.println("Nodes not found for sum " + sum1);
		}

	}

}
