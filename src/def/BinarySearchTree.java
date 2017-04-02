package def;

/**
 * This class represents Binary Search Tree.
 * Created by Rachana on 4/1/17.
 */
public class BinarySearchTree {

    private BSTNode root = null;
    private int size;

    /**
     * Constructor
     */
    public void BinarySearchTree() {
        root = null;
        size = 0;
    }

    /**
     * Inserts a binary search tree node
     * This method is direct implementation from one provided in a book.
     * Introduction to Algorithms 3rd edition. Chapter12, page 294
     *
     * @param k - node to be inserted
     */
    public void treeInsert(BSTNode k) {
        BSTNode y = null;
        BSTNode x = root;
        while (x != null) {
            y = x;
            if (k.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        k.parent = y;
        if (y == null) {
            root = k;
        } else if (k.key < y.key) {
            y.left = k;
        } else {
            y.right = k;
        }
        size++;
    }

    /**
     * Getter to return size
     *
     * @return size of a binary search tree
     */
    public int getBinarySearchTreeSize() {
        return size;
    }

    /**
     * Getter to return root node key
     *
     * @return - root node key
     */
    public int getBinarySearchTreeRootNodeKey() {
        return root.key;
    }

    /**
     * Getter to return key of right child of a node
     *
     * @param anyNode - node whose right child's key to access
     * @return - key of a right child of anynode
     */
    public int getRightChildKey(BSTNode anyNode) {
        return anyNode.right.key;
    }

    /**
     * Getter to return key of left child of a node
     *
     * @param anyNode - node whose left child's key to access
     * @return - key of a left child of anynode
     */
    public int getLeftChildKey(BSTNode anyNode) {
        return anyNode.left.key;
    }

    /**
     * Getter to return number of leaves in a tree
     *
     * @return - number of leaves
     */
    public int getNumberOfLeaves() {
        return numberOfLeavesInBST(root);
    }

    /**
     * Utility method to count number of leaves in a tree
     *
     * @param r - root node to start counting number of leaves of
     * @return - number of leaves in a tree
     */
    private int numberOfLeavesInBST(BSTNode r) {
        if (r == null) {
            return 0;
        }
        if (r.left == null || r.right == null) {
            return 1;
        } else {
            return numberOfLeavesInBST(r.left) + numberOfLeavesInBST(r.right);
        }
    }
}
