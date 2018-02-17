Queue<Node> q = new LinkedList<>();
q.add(root);

while (!q.isEmpty()){
    Node temp = q.poll();
    System.out.print(temp.data + " ");
    if (temp.left != null) q.offer(temp.left);
    if (temp.right != null) q.offer(temp.right);
}

}

/////////////////////

//Without using any other data structure

public void LevelOrder(Node root){
	    int i = 0;
	    int h = height(root);

	    for(i=1; i<=h; i++){
	        printTreeLevelRec(root, i);

	    }
	}

 int height(Node n){
	    if(n==null)
	        return 0;

	    if(n.left==null && n.right==null)
	        return 1;

	    int lheight = height(n.left);
	    int rheight = height(n.right);

	    return Math.max(lheight, rheight) + 1;
	}


	void printTreeLevelRec(Node  node, int desired){
	    if(node==null)
	        return;
	    if (desired == 1)
	    	System.out.print(node.data+ " ");

	    printTreeLevelRec(node.left, desired-1);
	    printTreeLevelRec(node.right, desired-1);
	}
