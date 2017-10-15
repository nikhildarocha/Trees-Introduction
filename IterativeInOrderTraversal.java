package Trees;

import java.util.Stack;

/**
 * Created by nikhil on 15-10-2017.
 */
public class IterativeInOrderTraversal {

    public static Node head;
    public static class Node{

        int data;
        Node left;
        Node right;

        Node(int d){

            data = d;
            left = right =null;
        }
    }

    public void inordertraversal(Node curr_node){

        Stack<Node> s = new Stack<Node>();
        boolean value = false;
        while(!value){

            if(curr_node != null){
                s.push(curr_node);
                curr_node = curr_node.left;
            }
            else {
                if (!s.isEmpty()) {
                    curr_node = s.peek();
                    s.pop();
                    System.out.println(curr_node.data);
                    curr_node = curr_node.right;
                } else
                    value = true;
                }
            }

        }


    public static void main(String[] args) {
        IterativeInOrderTraversal tree = new IterativeInOrderTraversal();
        tree.head = new Node(3);
        tree.head.left = new Node(1);
        tree.head.right = new Node(4);
        tree.inordertraversal(head);
    }
}
