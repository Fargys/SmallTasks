package com.denisov.util;

import com.denisov.study.graph.Edge;

import java.util.Arrays;
import java.util.List;

public class GraphTemplate {

    // @link: https://www.techiedelight.com/wp-content/uploads/2016/11/Breadth-first-tree.svg_.png
    public static final List<Edge> UNWEIGHTED_GRAPH = Arrays.asList(
            new Edge(1, 2), new Edge(1, 3), new Edge(1, 4),
            new Edge(2, 5), new Edge(2, 6),
            new Edge(5, 9), new Edge(5, 10),
            new Edge(4, 7), new Edge(4, 8),
            new Edge(7, 11), new Edge(7, 12)
    );

    public static final int UNWEIGHTED_GRAPH_EDGE_COUNT = UNWEIGHTED_GRAPH.size() + 2;
    public static final String BFS_EXPECTED_ORDER = "0123456789101112";
    public static final String DFS_EXPECTED_ORDER = "0148712113265109";

    // @link: https://www.techiedelight.com/wp-content/uploads/2016/11/Dijkstras-7.png
    public static final List<Edge> WEIGHTED_GRAPH = Arrays.asList(
            new Edge(0, 1, 10), new Edge(0, 4, 3),
            new Edge(1, 2, 2), new Edge(1, 4, 4),
            new Edge(2, 3, 9),
            new Edge(3, 2, 7),
            new Edge(4, 1, 1), new Edge(4, 2, 8), new Edge(4, 3, 2)
    );

    public static final int WEIGHTED_GRAPH_VERTEX_COUNT = 5;
    public static final int NUMBER_OF_POSSIBLE_ROUTES = 12;

    public static final List<Edge> MIN_COST_ROUTES = Arrays.asList(
            new Edge(0, 1, 4),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(0, 4, 3),
            new Edge(1, 2, 2),
            new Edge(1, 3, 6),
            new Edge(1, 4, 4),
            new Edge(2, 3, 9),
            new Edge(3, 2, 7),
            new Edge(4, 1, 1),
            new Edge(4, 2, 3),
            new Edge(4, 3, 2)
    );
}
