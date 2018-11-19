package Trees;

import java.util.Stack;

/**
 * Created by nikhil on 19-11-2018.
 */
public class ZigZagTraversal {
    public static Node head;

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public void zigzagtraversal() {
        if (head == null) {
            return;
        }

        Stack<Node> currentlevel = new Stack<Node>();
        Stack<Node> nextLevel = new Stack<Node>();

        currentlevel.push(head);
        boolean leftToRight = true;

        while (!currentlevel.isEmpty()) {
            Node node = currentlevel.pop();

            System.out.print(node.data + " ");

            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }

            }
            if (currentlevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> temp = currentlevel;
                currentlevel = nextLevel;
                nextLevel = temp;
            }
        }
    }

    public static void main(String[] args) {
        ZigZagTraversal zig = new ZigZagTraversal();
        zig.head = new Node(1);
        zig.head.left = new Node(2);
        zig.head.right = new Node(3);
        zig.head.left.left = new Node(7);
        zig.head.left.right = new Node(6);
        zig.head.right.left = new Node(5);
        zig.head.right.right = new Node(4);

        System.out.println("The ZigZag order traversal of binary tree is");

        zig.zigzagtraversal();
    }
}
