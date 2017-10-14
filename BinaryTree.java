package Trees;

/**
 * Created by nikhil on 07-10-2017.
 */
public class BinaryTree {

    public static Node head;

    static class Node{
        int data;
        Node right;
        Node left;
        Node(int d){

            data =d;
            left = right = null;
        }

    }

    public void printPostOrder(Node curr_node){

        if(curr_node == null){
          return;
        }

        printPostOrder(curr_node.left);
        printPostOrder(curr_node.right);
        System.out.println(curr_node.data);
    }
    public void printPreOrder(Node curr_node){
        if (curr_node == null){
            return;
        }
        System.out.println(curr_node.data);
        printPreOrder(curr_node.left);
        printPreOrder(curr_node.right);
    }
    public void printInOrder(Node curr_node){

        if (curr_node == null){
            return;
        }
        printInOrder(curr_node.left);
        System.out.println(curr_node.data);
        printInOrder(curr_node.right);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.head = new Node(3);
        tree.head.left = new Node(1);
        tree.head.right = new Node(4);
        //tree.printTree(head);
        tree.printPostOrder(head);
        tree.printPreOrder(head);
        tree.printInOrder(head);
    }
}
