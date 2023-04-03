package com.denisov.study.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.denisov.util.GraphTemplate.*;
import static org.junit.jupiter.api.Assertions.*;

public class GraphSearchTest {

    private final GraphSearch api = new GraphSearch();

    private UnweightedGraph unweightedGraph;
    private WeightedGraph weightedGraph;

    @BeforeEach
    void init() {
        unweightedGraph = new UnweightedGraph(UNWEIGHTED_GRAPH, UNWEIGHTED_GRAPH_EDGE_COUNT);
        weightedGraph = new WeightedGraph(WEIGHTED_GRAPH, WEIGHTED_GRAPH_VERTEX_COUNT);
    }

    @Test
    void breadthFirstSearchTest() {
        var expectedVisits = 1;
        var actualOrder = new StringBuilder();

        var discovered = new int[UNWEIGHTED_GRAPH_EDGE_COUNT];
        for (int i = 0; i < UNWEIGHTED_GRAPH_EDGE_COUNT; i++)
            if (discovered[i] == 0)
                actualOrder.append(api.breadthFirstSearch(unweightedGraph, i, discovered));

        var allVerticesVisitedOnce = IntStream.of(discovered)
                .allMatch(i -> i == expectedVisits);

        assertTrue(allVerticesVisitedOnce);
        assertEquals(BFS_EXPECTED_ORDER, actualOrder.toString());
    }

    @Test
    void depthFirstSearchTest() {
        var expectedVisits = 1;
        var actualOrder = new StringBuilder();

        var discovered = new int[UNWEIGHTED_GRAPH_EDGE_COUNT];
        for (int i = 0; i < UNWEIGHTED_GRAPH_EDGE_COUNT; i++)
            if (discovered[i] == 0)
                actualOrder.append(api.depthFirstSearch(unweightedGraph, i, discovered));

        var allVerticesVisitedOnce = IntStream.of(discovered)
                .allMatch(i -> i == expectedVisits);

        assertTrue(allVerticesVisitedOnce);
        assertEquals(DFS_EXPECTED_ORDER, actualOrder.toString());
    }

    @Test
    void findShortestPaths() {
        List<Edge> minCost = new ArrayList<>();

        for (int source = 0; source < WEIGHTED_GRAPH_VERTEX_COUNT; source++)
            minCost.addAll(api.findShortestPaths(weightedGraph, source, WEIGHTED_GRAPH_VERTEX_COUNT));

        assertEquals(NUMBER_OF_POSSIBLE_ROUTES, minCost.size());
        assertArrayEquals(MIN_COST_ROUTES.toArray(), minCost.toArray());
    }
}
