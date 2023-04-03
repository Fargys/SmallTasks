package com.denisov.study.graph;

public class Edge {
    final int source;
    final int dest;
    int weight;

    public Edge(int source, int dest) {
        this.source = source;
        this.dest = dest;
    }

    public Edge(int source, int dest, int weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return source == edge.source &&
                dest == edge.dest &&
                weight == edge.weight;
    }

    @Override
    public String toString() {
        return String.format("Path (%d —> %d): Minimum cost = %d", source, dest, weight);
    }
}
