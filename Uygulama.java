package StudentApp;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        int choose = -1;
        int no, note;
        String name;
        BTree student = new BTree();
        Scanner sc = new Scanner(System.in);
        while (choose != 0) {
            System.out.println();
            System.out.println("1-Add Student");
            System.out.println("2-Delete Student");
            System.out.println("3-Print");
            System.out.println("0-Exit");
            System.out.println();
            System.out.print("Your Choose :");
            choose = sc.nextInt();
            System.out.println();
            switch (choose) {
                case 1:
                    System.out.print("No: ");
                    no = sc.nextInt();
                    System.out.print("Note: ");
                    note = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    student.add(no, note, name);
                    System.out.println();
                    System.out.print(name + " Added.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("No: ");
                    no = sc.nextInt();
                    student.delete(no);
                    System.out.println();
                    System.out.println(no + " Deleted.");
                    break;
                case 3:
                    System.out.println("No\tNote\tName");
                    student.inOrder(student.root);
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
