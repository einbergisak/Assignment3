package com.thealgorithms.datastructures.graphs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;

class BellmanFordTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void go() {
    }


    /**
     * Create a simple directed graph with a single source node and multiple destination nodes.
     * We ensure that there is only one possible path to each destination node.
     * The algorithm should correctly return the shortest path to each node.
     */
    @Test
    public void testGoWithPositiveEdges() {
        BellmanFord obj = new BellmanFord(5, 6);
        String input = "5 6\n" +
                "0 1 1\n" +
                "0 2 3\n" +
                "1 3 2\n" +
                "2 3 5\n" +
                "3 4 2\n" +
                "2 4 1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        obj.go();
    }

    /**
     * Create a graph with negative edge weights.
     * We ensure that there is a negative weight cycle in the graph,
     * and the algorithm should detect it and report that there is no shortest path.
     */
    @Test
    public void testGoWithNegativeEdges() {
        BellmanFord obj = new BellmanFord(4, 5);
        String input = "4 5\n" +
                "0 1 1\n" +
                "1 2 1\n" +
                "2 3 -5\n" +
                "3 0 -7\n" +
                "1 3 3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        obj.go();
    }

    /**
     * We test the case where there is no edge.
     */
    @Test
    public void testGoWithNoEdges() {
        BellmanFord obj = new BellmanFord(1, 0);
        String input = "1 0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        obj.go();
    }

    /**
     * Create a graph with multiple source nodes and multiple destination nodes.
     * We ensure that there are different possible paths from each source node to the destination nodes.
     * The algorithm should correctly return the shortest path from each source node to the destination nodes.
     */
    @Test
    public void testGoWithMultipleSources() {
        BellmanFord obj = new BellmanFord(4, 3);
        String input = "4 3\n" +
                "0 2 1\n" +
                "2 3 1\n" +
                "1 3 2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        obj.go();
    }


}