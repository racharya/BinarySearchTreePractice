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
    public void testBinaryTreeInsertOneElement() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new BSTNode(2));
        assertEquals(1, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBinaryTreeInsertTwoElement() {
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode root = new BSTNode(2);
        BSTNode rightChild = new BSTNode(4);
        bst.insert(root);
        bst.insert(rightChild);
        assertEquals(2, bst.getBinarySearchTreeSize());
        assertEquals(4, bst.getRightChildKey(root));
    }

    @Test
    public void testBinaryTreeInsertsItemsCorrectly() {
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode root = new BSTNode(12);
        BSTNode item1 = new BSTNode(18);
        BSTNode item2 = new BSTNode(15);
        BSTNode item3 = new BSTNode(2);
        BSTNode item4 = new BSTNode(17);
        BSTNode item5 = new BSTNode(5);
        BSTNode item6 = new BSTNode(4);

        bst.insert(root);
        bst.insert(item1);
        bst.insert(item2);
        bst.insert(item3);
        bst.insert(item4);
        bst.insert(item5);
        bst.insert(item6);

        assertEquals(7, bst.getBinarySearchTreeSize());
        assertEquals(12, bst.getBinarySearchTreeRootNodeKey());
        assertEquals(2, bst.getLeftChildKey(root));
        assertEquals(5, bst.getRightChildKey(item3));
        assertEquals(4, bst.getLeftChildKey(item5));
        assertEquals(18, bst.getRightChildKey(root));
        assertEquals(15, bst.getLeftChildKey(item1));
        assertEquals(17, bst.getRightChildKey(item2));
    }

    @Test
    public void testGetNumberOfLeaves() {
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode root = new BSTNode(12);
        BSTNode item1 = new BSTNode(18);
        BSTNode item2 = new BSTNode(15);
        BSTNode item3 = new BSTNode(2);
        BSTNode item4 = new BSTNode(17);
        BSTNode item5 = new BSTNode(5);
        BSTNode item6 = new BSTNode(4);

        bst.insert(root);
        bst.insert(item1);
        bst.insert(item2);
        bst.insert(item3);
        bst.insert(item4);
        bst.insert(item5);
        bst.insert(item6);
        assertEquals(7, bst.getBinarySearchTreeSize());
        assertEquals(12, bst.getBinarySearchTreeRootNodeKey());
        assertEquals(2, bst.getNumberOfLeaves());

    }

    @Test
    public void testGetNumberOfLeavesNullTree() {
        BinarySearchTree bst = new BinarySearchTree();
        assertEquals(0, bst.getBinarySearchTreeSize());
        assertEquals(0, bst.getNumberOfLeaves());
    }

    @Test
    public void testGetNumberOfLeavesOneNode() {
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode root = new BSTNode(12);
        bst.insert(root);
        assertEquals(1, bst.getBinarySearchTreeSize());
        assertEquals(12, bst.getBinarySearchTreeRootNodeKey());
        assertEquals(1, bst.getNumberOfLeaves());
    }

    @Test
    public void testGetNumberOfLeavesOnBalancedTree() {
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode root = new BSTNode(12);
        BSTNode item1 = new BSTNode(18);
        BSTNode item2 = new BSTNode(15);
        BSTNode item3 = new BSTNode(2);
        BSTNode item4 = new BSTNode(17);
        BSTNode item5 = new BSTNode(5);
        BSTNode item6 = new BSTNode(4);
        BSTNode item7 = new BSTNode(1);
        BSTNode item8 = new BSTNode(6);
        BSTNode item9 = new BSTNode(14);
        BSTNode item10 = new BSTNode(22);
        bst.insert(root);
        bst.insert(item1);
        bst.insert(item2);
        bst.insert(item3);
        bst.insert(item4);
        bst.insert(item5);
        bst.insert(item6);
        bst.insert(item7);
        bst.insert(item8);
        bst.insert(item9);
        bst.insert(item10);

        assertEquals(11, bst.getBinarySearchTreeSize());
        assertEquals(6, bst.getNumberOfLeaves());
    }

    /**************************************************************/
    /******************* Test tree Height *************************/
    /**************************************************************/
    @Test
    public void testBstHeightEmptyTree(){
        BinarySearchTree bst = new BinarySearchTree();
        assertEquals(-1, bst.getTreeHeight());
        assertEquals(0, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBstHeightOneNodeTree(){
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode item1 = new BSTNode(22);
        bst.insert(item1);
        assertEquals(0, bst.getTreeHeight());
        assertEquals(1, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBstHeightTwoNodeTreeLeftChild(){
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode item1 = new BSTNode(22);
        BSTNode item2 = new BSTNode(12);
        bst.insert(item1);
        bst.insert(item2);
        assertEquals(1, bst.getTreeHeight());
        assertEquals(12, bst.getLeftChildKey(item1));
        assertEquals(2, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBstHeightTwoNodeTreeRightChild(){
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode item1 = new BSTNode(22);
        BSTNode item2 = new BSTNode(44);
        bst.insert(item1);
        bst.insert(item2);
        assertEquals(1, bst.getTreeHeight());
        assertEquals(44, bst.getRightChildKey(item1));
        assertEquals(2, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBstHeightThreeNodeTree(){
        BinarySearchTree bst = new BinarySearchTree();
        BSTNode item1 = new BSTNode(22);
        BSTNode item2 = new BSTNode(44);
        BSTNode item3 = new BSTNode(14);
        bst.insert(item1);
        bst.insert(item2);
        bst.insert(item3);
        assertEquals(1, bst.getTreeHeight());
        assertEquals(44, bst.getRightChildKey(item1));
        assertEquals(14, bst.getLeftChildKey(item1));
        assertEquals(3, bst.getBinarySearchTreeSize());
    }

    @Test
    public void testBstHeightManyNodeTree() {
        BinarySearchTree bst = new BinarySearchTree();

        BSTNode root = new BSTNode(12);
        BSTNode item1 = new BSTNode(18);
        BSTNode item2 = new BSTNode(15);
        BSTNode item3 = new BSTNode(2);
        BSTNode item4 = new BSTNode(17);
        BSTNode item5 = new BSTNode(5);
        BSTNode item6 = new BSTNode(4);
        BSTNode item7 = new BSTNode(1);
        BSTNode item8 = new BSTNode(6);
        BSTNode item9 = new BSTNode(14);
        BSTNode item10 = new BSTNode(22);

        bst.insert(root);
        bst.insert(item1);
        bst.insert(item2);
        bst.insert(item3);
        bst.insert(item4);
        bst.insert(item5);
        bst.insert(item6);
        bst.insert(item7);
        bst.insert(item8);
        bst.insert(item9);
        bst.insert(item10);

        assertEquals(3,bst.getTreeHeight());
    }
}
