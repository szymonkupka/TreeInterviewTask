package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.company.Tree.calculateLongestPath;
import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test
    void LargestValueTest(){
        var t = new Tree();
        assertEquals(-1,t.calculateLagestValue(t.root));

        t.addNode(5,0,"left");
        assertEquals(5,t.calculateLagestValue(t.root));

        t.addNode(1,0,"left");
        assertEquals(5,t.calculateLagestValue(t.root));

        t.addNode(6,0,"right");
        assertEquals(6,t.calculateLagestValue(t.root));

        t.addNode(7,1,"left");
        assertEquals(7,t.calculateLagestValue(t.root));

        t.addNode(0,1,"right");
        assertEquals(7,t.calculateLagestValue(t.root));

        t.addNode(0,3,"right");
        assertEquals(7,t.calculateLagestValue(t.root));

        t.addNode(9,2,"left");
        assertEquals(9,t.calculateLagestValue(t.root));

        t.addNode(8,2,"right");
        assertEquals(9,t.calculateLagestValue(t.root));
    }
    @Test
    void LeafsNumberTest(){
        var t = new Tree();
        assertEquals(0,t.calculateLeafsNumber(t.root));
        t.addNode(1,0,"right");
        assertEquals(1,t.calculateLeafsNumber(t.root));
        t.addNode(2,0,"right");
        assertEquals(1,t.calculateLeafsNumber(t.root));
        t.addNode(3,0,"left");
        assertEquals(2,t.calculateLeafsNumber(t.root));
        t.addNode(4,1,"left");
        assertEquals(2,t.calculateLeafsNumber(t.root));
        t.addNode(5,2,"left");
        assertEquals(2,t.calculateLeafsNumber(t.root));
        t.addNode(6,2,"right");
        assertEquals(3,t.calculateLeafsNumber(t.root));
        t.addNode(7,1,"right");
        assertEquals(4,t.calculateLeafsNumber(t.root));

    }
    @Test
    void comperTreesTest(){
        var t1 = new Tree();
        var t2 = new Tree();
        assertTrue(t1.comperTrees(t1.root, t2.root));
        t1.addNode(1,0,"right");
        t2.addNode(1,0,"right");
        assertTrue(t1.comperTrees(t1.root, t2.root));
        t1.addNode(2,0,"right");
        t2.addNode(2,0,"right");
        assertTrue(t1.comperTrees(t1.root, t2.root));
        t1.addNode(3,0,"left");
        t2.addNode(3,0,"left");
        assertTrue(t1.comperTrees(t1.root, t2.root)); // do tad takie same
        t1.addNode(3,2,"left");
        t2.addNode(3,2,"right");
        assertFalse(t1.comperTrees(t1.root, t2.root)); // inne dodajemy w jednym drzewi na prawo w innym na lewo
        t1.addNode(3,2,"right");
        t2.addNode(3,2,"left");
        assertTrue(t1.comperTrees(t1.root, t2.root)); //znowu takie same
        t1.addNode(4,1,"left");
        assertFalse(t1.comperTrees(t1.root, t2.root));
        t2.addNode(6,1,"left");
        assertFalse(t1.comperTrees(t1.root, t2.root));

    }
    @Test
    void LongestPathTest(){
        var t1 = new Tree();
        assertEquals(Arrays.asList(), calculateLongestPath(t1.root));
        t1.addNode(1,0,"right"); //root
        assertEquals(Arrays.asList(1), calculateLongestPath(t1.root));
        t1.addNode(2,0,"left");
        assertEquals(Arrays.asList(1,2), calculateLongestPath(t1.root));
        t1.addNode(3,0,"right");
        assertEquals(Arrays.asList(1,3), calculateLongestPath(t1.root));
        t1.addNode(4,1,"right");
        assertEquals(Arrays.asList(1,2,4), calculateLongestPath(t1.root));
        t1.addNode(5,1,"left");
        assertEquals(Arrays.asList(1,2,4), calculateLongestPath(t1.root));
        //t1.addNode(4,1,"right");
        t1.addNode(6,2,"left");
        assertEquals(Arrays.asList(1,3,6), calculateLongestPath(t1.root));
        t1.addNode(7,5,"left");
        assertEquals(Arrays.asList(1,3,6,7), calculateLongestPath(t1.root));

    }
}