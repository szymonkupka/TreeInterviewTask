package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tree {
    Node root;                   //          root
    List<Node> nodes = new ArrayList<>();




    public void addNode(int value , int parentId, String side ){


            Node newNode = new Node(value, nodes.size());
            if (nodes.isEmpty())                           //obsluga blendow
                root = newNode;
            else {

                  //  checkData(parentId, side);
                    if (side.equals("left"))
                        nodes.get(parentId).left = newNode;
                    else
                        nodes.get(parentId).right = newNode;
            }
            nodes.add(newNode);
            //

    }
    public static int calculateLeafsNumber(Node node){

        if(node == null)
            return 0;
        else if(node.left==null && node.right==null)
            return 1;
        else
            return calculateLeafsNumber(node.left) + calculateLeafsNumber(node.right);

    }

    public static ArrayList<Integer> calculateLongestPath(Node node) {
        if(node == null)
            return new ArrayList<>();

        ArrayList<Integer> right = calculateLongestPath(node.right);
        ArrayList<Integer> left = calculateLongestPath(node.left);


        if(left.size() > right.size())
            left.add(0,node.value);
        else
            right.add(0,node.value);
        return (left.size() > right.size() ? left :right);  //if few largest takes the one on right side
    }
    public static int calculateLagestValue(Node node){
        if(node == null)
            return -1;
        int l = calculateLagestValue(node.left);
        int r = calculateLagestValue(node.right);
        if(node.value > r && node.value > l)
            return node.value;
        return (l > r ? l : r); //if few largest takes the one on right side
    }

    public boolean comperTrees(Node n1, Node n2){
        if(n1 == n2 && n1 == null)
            return true;
        if(n1 == null || n2 == null ||n1.value !=n2.value   )
            return false;
           boolean l = comperTrees( n1.left,  n2.left);
           boolean r =comperTrees( n1.right,  n2.right);
           return (r && l);
    }
}
