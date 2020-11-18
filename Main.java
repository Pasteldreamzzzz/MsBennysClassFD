import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
 String[] students = new String [15];

 int[] seats = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15 };

 for (int i = 0; i< students.length; i++){


   Scanner scan = new Scanner(System.in); 
  System.out.println("Please enter name.");
  String name = scan.next();

  System.out.println("Where will you sit?"); 
  int seat = scan.nextInt();

  System.out.println("Okay! " + name + " you will sit at seat " + seat ); 
 }

  }
}