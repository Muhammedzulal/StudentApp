package StudentApp;

public class BTree {
    Node root;

    public BTree() {
        root = null;
    }

    private Node insert(Node root, int no, int note, String name) {
        if (root == null)
            return new Node(no, note, name);
        if (no < root.no)
            root.left = insert(root.left, no, note, name);
        else
            root.right = insert(root.right, no, note, name);
        return root;
    }

    public void add(int no, int note, String name) {
        root = insert(root, no, note, name);
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.no + "\t" + root.note + "\t" + root.name);
            inOrder(root.right);
        }
    }

    private Node remove(Node root, int x) {
        Node t1, t2;
        if (root == null)
            return null;
        if (root.no == x) {
            if (root.left == root.right) {// leaf
                root = null;
                return root;
            } else if (root.left == null) {
                t1 = root.right;
                return t1;
            } else if (root.right == null) {
                t1 = root.left;
                return t1;
            } else {// parent
                t1 = t2 = root.right;
                while (t1.left != null)
                    t1 = t1.left;
                t1.left = root.left;
                return t2;
            }
        } else {
            if (x < root.no)
                root.left = remove(root.left, x);
            else
                root.right = remove(root.right, x);
        }
        return root;
    }

    void delete(int x) {
        root = remove(root, x);
    }

}
