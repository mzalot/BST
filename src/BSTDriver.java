/**
 BSTDriver
 The program will create a driver for the Binary Search Tree class
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 4/25/22
 On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: MZ
 **/
public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Test the size method(should return 0): " + tree.size());
        System.out.println("Test the isEmpty method(should return true): " + tree.isEmpty());
        System.out.println("Test the get method(should return null): " + tree.get("hello"));
        System.out.println("Test the contains method(should return false): " + tree.contains("hello"));
        System.out.println("Test the put method");
        tree.put("Trent", "Dad");
        tree.put("August", "Pog");
        tree.put("Kevin", "Kevburger");
        System.out.println("Test the size method(should return 3): " + tree.size());
        System.out.println("Test the isEmpty method(should return false): " + tree.isEmpty());
        System.out.println("Test the get method(should return Trent): " + tree.get(1));
        System.out.println("Test the contains method(should return true): " + tree.contains(2));
        //System.out.println("Test the min method(should return ): " + tree.min());
        //System.out.println("Test the max method(should return ): " + tree.max());
        //test put, size, isempty, get, contains, min, max
    }
}
