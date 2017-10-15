package Trees;

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.Stack;

/**
 * Created by nikhil on 14-10-2017.
 */
public class LevelOrderTraversalBinaryTree {

    public static Node head;
    public class Node{

        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            Node left = null;
            Node right = null;
        }
    }

}
