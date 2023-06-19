package com.denisov.algorithms.graph;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeightedGraph {
    private List<List<Edge>> adjList;

    public WeightedGraph(List<Edge> edges, int n) {
        adjList = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());

        for (Edge edge: edges)
            adjList.get(edge.source).add(edge);
    }
}

