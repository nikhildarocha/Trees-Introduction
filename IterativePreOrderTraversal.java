package Trees;

import java.util.Stack;

/**
 * Created by nikhil on 15-10-2017.
 */
public class IterativePreOrderTraversal {

    public static Node head;
    public static class Node{

        int data;
        Node left;
        Node right;
        Node(int d){

            data = d;
            left = right = null;
        }

    }

    public void preordertraversal(Node curr_node){

        Stack<Node> s = new Stack<Node>();

        s.push(curr_node);

        while (!s.isEmpty()){
            Node top_element;
            top_element = s.peek();
            System.out.println(top_element.data);
            s.pop();

            if (top_element.right != null){
                s.push(top_element.right);
            }
            if (top_element.left != null){
                s.push(top_element.left);
            }

        }


    }

    public static void main(String[] args) {
        IterativePreOrderTraversal tree = new IterativePreOrderTraversal();
        tree.head = new Node(3);
        tree.head.left = new Node(1);
        tree.head.right = new Node(4);
        tree.preordertraversal(head);
    }
}
