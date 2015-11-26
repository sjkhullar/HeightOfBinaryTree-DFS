
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class HeightOfTree {
	public static int heightOfTree(Node root) {
		if(null == root)
			return 0;
		int hLeftSub = heightOfTree(root.left);
		int hRightSub = heightOfTree(root.left);
		return Math.max(hLeftSub,hRightSub) + 1;
	}
}
