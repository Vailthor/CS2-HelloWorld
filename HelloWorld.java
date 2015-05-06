import java.util.Scanner;


public class HelloWorld
{
  private static Scanner in = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.println("We will rock you!");
    System.out.println("If you want to rock with us tell me your name! ");
    String name = in.nextLine();
    System.out.println("Welcome " + name + "!");
  }
}
