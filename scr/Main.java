package scr;


public class Main {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(30);
        node.inorder();
        System.out.println("\n");
        node.insert(-20);
        node.inorder();
        System.out.println("\n");
        node.insert(-40);
        node.inorder();
        System.out.println("\n");
        node.insert(-450);
        node.inorder();
        System.out.println("\n");
        node.insert(-4440);
        node.inorder();
        System.out.println("\n");
        node.insert(-44600);
        node.inorder();


    }
}