class constructBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode construct(int[] arr) {
        TreeNode root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insertIntoBST(root, arr[i]);
        }
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public void inorderBST(TreeNode root) {
        if (root == null)
            return;
        inorderBST(root.left);
        System.out.print(root.val + " ");
        inorderBST(root.right);
    }
    public static void main(String[] args) {
        int[] array = { 9, 8, 4, 6, 11, 14, 7, 19, 10 };
        constructBST obj = new constructBST();
        TreeNode root = obj.construct(array);
        obj.inorderBST(root);
    }
}