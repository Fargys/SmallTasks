package com.denisov.study.graph;

import java.util.*;

import static com.denisov.util.GraphTemplate.WEIGHTED_GRAPH_VERTEX_COUNT;

public class GraphSearch {

    public StringBuilder breadthFirstSearch(UnweightedGraph graph, int v, int[] discovered) {
        StringBuilder resultForTest = new StringBuilder();
        Queue<Integer> queue = new ArrayDeque<>();
        discovered[v]++;
        queue.add(v);

        while(!queue.isEmpty()) {
            v = queue.poll();
            resultForTest.append(v);

            for(int u : graph.getAdjList().get(v))
                if (discovered[u] == 0) {
                    discovered[u]++;
                    queue.add(u);
                }
        }
        return resultForTest;
    }

    public StringBuilder depthFirstSearch(UnweightedGraph graph, int v, int[] discovered) {
        StringBuilder resultForTest = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        discovered[v]++;
        stack.push(v);

        while(!stack.isEmpty()) {
            v = stack.pop();
            resultForTest.append(v);

            for(int u : graph.getAdjList().get(v))
                if (discovered[u] == 0) {
                    discovered[u]++;
                    stack.add(u);
                }
        }
        return resultForTest;
    }

    public List<Edge> findShortestPaths(WeightedGraph graph, int source, int v) {
        // создаем мини-кучу и проталкиваем исходный узел с расстоянием 0
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        minHeap.add(new Node(source, 0));

        // устанавливаем начальное расстояние от источника на `v` как бесконечность
        List<Integer> dist = new ArrayList<>(Collections.nCopies(v, Integer.MAX_VALUE));

        // расстояние от источника до себя равно нулю
        dist.set(source, 0);

        // логический массив для отслеживания вершин, для которых минимальная стоимость уже найдена
        boolean[] done = new boolean[v];
        done[source] = true;

        // работать до тех пор, пока мини-куча не станет пустой
        while(!minHeap.isEmpty()) {

            // Удалить и вернуть лучшую вершину
            Node node = minHeap.poll();

            // получаем номер вершины
            int u = node.vertex;

            // делаем для каждого соседа `v` из `u`
            for(Edge edge: graph.getAdjList().get(u)) {
                int dest = edge.dest;
                int weight = edge.weight;

                // Проверяем наличие более коротких путей
                if(!done[dest] && (dist.get(u) + weight) < dist.get(dest)) {
                    dist.set(dest, dist.get(u) + weight);
                    minHeap.add(new Node(dest, dist.get(dest)));
                }
            }

            // помечаем вершину `u` как выполненную, чтобы она больше не поднималась
            done[u] = true;
        }

        // коллекция достижения узлов с минимальной стоимостью для тестирования
        List<Edge> minCost = new ArrayList<>();
        for(int i = 0; i < WEIGHTED_GRAPH_VERTEX_COUNT; i++)
            if(i != source && dist.get(i) != Integer.MAX_VALUE)
                minCost.add(new Edge(source, i, dist.get(i)));

        return minCost;
    }
}
