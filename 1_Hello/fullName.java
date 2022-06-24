import java.util.Scanner;  


public class fullName{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your name?:");
      String name = scanner.nextLine();

      System.out.println("What is your surname?:");
      String surname = scanner.nextLine();
                
      System.out.println("Hello "+name+" "+surname);

     }
}






