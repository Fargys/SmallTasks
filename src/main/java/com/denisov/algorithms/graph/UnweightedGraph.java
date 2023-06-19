package com.denisov.algorithms.graph;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UnweightedGraph {
    private List<List<Integer>> adjList;

    public UnweightedGraph(List<Edge> edges, int n) {
        adjList = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());

        for (Edge edge: edges) {
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}

