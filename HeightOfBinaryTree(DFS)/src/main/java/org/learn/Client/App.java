package org.learn.Client;

import org.learn.Question.HeightOfTree;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(70);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(90);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(75);
		Node F = Node.createNode(35);
		Node G = Node.createNode(55);
		// Level 3
		Node H = Node.createNode(10);
		Node I = Node.createNode(30);

		// connect Level 0 and 1
		A.left  = B;
		A.right = C;
		// connect level 1 and level 2
		B.left  = D;
		B.right = E;
		C.left  = F;
		C.right = G;
		// connect level 2 and level 3
		F.left  = H;
		F.right = I;

		int height = HeightOfTree.heightOfTree(A);
		if (height > 0) {
			System.out.println("Height of a Binary Tree is : " + height);
		}
	}
}
