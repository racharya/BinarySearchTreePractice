package def;

/**
 * This class represents a binary search tree node
 * Created by Rachana on 4/1/17.
 */
public class BSTNode {
    int key;
    BSTNode left, right, parent;

    /**
     * Constructore 1
     * @param key - key of a node
     */
    public BSTNode(int key){
        this.key = key;
        left = right = parent = null;
    }

    /**
     * constructor 2
     * @param key - key of a node
     * @param left - left child of a node
     * @param right - right child of a node
     * @param parent - parent of a node
     */
    public BSTNode(int key, BSTNode left, BSTNode right, BSTNode parent){
        this.key = key;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

}
