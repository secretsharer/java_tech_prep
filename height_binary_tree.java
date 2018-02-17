//recursive Solution

static int height(Node root) {
        if (root == null) return -1;

        int left = 1 + height(root.left);
        int right = 1 + height(root.right);

        return left > right ? left:right;
    }

    /////////////////

    static int height(Node root) {
      	// Write your code here.
        if (root.left == null && root.right == null) {
            return 0;
        }
        if (root.left == null) {
            return 1 + height(root.right);
        } else if (root.right == null) {
            return 1 + height(root.left);
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }

    }
