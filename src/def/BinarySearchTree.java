package def;

/**
 * This class represents Binary Search Tree.
 * Created by Rachana on 4/1/17.
 */
public class BinarySearchTree {

    //def.BinarySearchTree bst;
    BSTNode root = null;
    int size;

    public void BinarySearchTree() {
        root = null;
        size = 0;
    }

    /**
     * Inserts a binary search tree node
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

    public int getBinarySearchTreeRootNodeKey(){
        return root.key;
    }
    /**
     * Getter to return key of right child of a node
     * @param anyNode - node whose right child's key to access
     * @return - key of a right child of anynode
     */
    public int getRightChildKey(BSTNode anyNode) {
        return anyNode.right.key;
    }

    /**
     * Getter to return key of left child of a node
     * @param anyNode - node whose left child's key to access
     * @return - key of a left child of anynode
     */
    public int getLeftChildKey(BSTNode anyNode) {
        return anyNode.left.key;
    }
}
