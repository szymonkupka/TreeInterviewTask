package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var  t = new Tree();
        t.addNode(5,0,"left");

        t.addNode(10,0,"left");
        t.addNode(200,0,"right");
        t.addNode(3,1,"right");
        t.addNode(4,2,"right");



    }

}
