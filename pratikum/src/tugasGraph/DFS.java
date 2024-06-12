package tugasGraph;
import java.util.*;

class DFS {
    private int V; // Jumlah simpul
    private LinkedList<Integer> adj[]; // Daftar tetangga

    // Konstruktor
    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Menambahkan sisi ke graf
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Fungsi pembantu untuk DFS yang menggunakan rekursi
    void DFSUtil(int v, boolean visited[]) {
        // Menandai simpul saat ini sebagai dikunjungi dan mencetaknya
        visited[v] = true;
        System.out.print(v + " ");

        // Melakukan rekursi untuk semua simpul tetangga
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // DFS traversal dari simpul v
    void DFS(int v) {
        // Menandai semua simpul sebagai belum dikunjungi
        boolean visited[] = new boolean[V];

        // Memanggil fungsi pembantu DFS
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Traversal " +
                "(mulai dari simpul 2)");

        g.DFS(2);
    }
}



