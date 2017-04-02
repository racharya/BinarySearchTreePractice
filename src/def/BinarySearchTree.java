package def;

/**
 * This class represents Binary Search Tree.
 * Created by Rachana on 4/1/17.
 */
public class BinarySearchTree {

    //def.BinarySearchTree bst;
    BSTNode root = null;
    int size;

    public void BinarySearchTree(){
        root = null;
        size = 0;
    }
    /**
     * Inserts a binary search tree node
     * @param k - node to be inserted
     */
    public void treeInsert(BSTNode k){
        BSTNode y = null;
        BSTNode x = root;
        while(x != null){
            y = x;
            if(k.key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }

        }
        k.parent = y;
        if(y == null){
           root = k;
        }else if(k.key < y.key){
            y.left = k;
        }else{
            y.right = k;
        }
        size++;
    }

    public int getBinarySearchTreeSize(){
        return size;
    }

    public int getRightChild(BSTNode i) {
        return i.right.key;
    }
}
