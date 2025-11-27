public class CloneGraph {
    public static Node cloneGraph(Node node) {
        // ...implement here...
        return null;
    }
    public static void main(String[] args) {
        // ...test here...
    }
}
class Node {
    public int val;
    public java.util.List<Node> neighbors;
    public Node() {}
    public Node(int val) { this.val = val; neighbors = new java.util.ArrayList<>(); }
}
