package def.tests;

import org.junit.jupiter.api.Test;
import def.BinarySearchTree;
import def.BSTNode;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This class def.tests Binary Search Tree
 * Created by Rachana on 4/1/17.
 */
public class BinarySearchTreeTester {

    @Test
    public void testBinaryTreeInsertOneElement(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.treeInsert(new BSTNode(2));
        assertEquals(1, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBinaryTreeInsertTwoElement(){
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode root = new BSTNode(2);
        BSTNode rightChild = new BSTNode(4);
        bst.treeInsert(root);
        bst.treeInsert(rightChild);
        assertEquals(2, bst.getBinarySearchTreeSize());
        assertEquals(4, bst.getRightChild(root));
    }
}
