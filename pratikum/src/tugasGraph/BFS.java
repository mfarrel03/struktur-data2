package tugasGraph;
import java.util.*;

class BFS {
    private int V; // Jumlah simpul
    private LinkedList<Integer> adj[]; // Daftar tetangga

    // Konstruktor
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Menambahkan sisi ke graf
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS dari sumber 's'
    void BFS(int s) {
        // Menandai semua simpul sebagai belum dikunjungi
        boolean visited[] = new boolean[V];

        // Membuat antrian untuk BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Menandai simpul saat ini sebagai dikunjungi dan memasukkannya ke antrian
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Mengeluarkan simpul dari antrian dan mencetaknya
            s = queue.poll();
            System.out.print(s + " ");

            // Mengambil semua simpul tetangga dari simpul yang dikeluarkan
            // Jika tetangga belum dikunjungi, tandai dan masukkan ke antrian
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal " +
                "(mulai dari simpul 2)");

        g.BFS(2);
    }
}


