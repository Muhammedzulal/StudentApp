package StudentApp;

public class Node {
    int no;
    int note;
    String name;
    Node left;
    Node right;

    public Node() {
        no = 0;
        note = 0;
        name = "";
        right = null;
        left = null;
    }

    public Node(int no, int note, String name) {
        this.no = no;
        this.note = note;
        this.name = name;
        right = null;
        left = null;
    }

}
