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

       /* for(int i = 0;i<5;i++)
            if(i%2 == 0)
                t.addNode((int) ((Math.random() * (10 - 1)) + 1 ), i,"left" );
            else
                t.addNode((int) ((Math.random() * (10 - 1)) + 1), i,"rigth" );
                */

       //System.out.println( (t.calculateLagestValue(t.root)) );

    }

}
