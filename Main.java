import java.util.*;

class Main {
  public static void main(String[] args) {
    int assignment = 101;
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your grade in percent?");
    int grade = sc.nextInt();
    switch (assignment) {
      case 1:
        if(grade < 50){
          System.out.println("You failed. F");
        }
        else{
          System.out.println("You didnt fail");
        }
      case 2: 
        if(grade >= 50 && grade <= 60){
          System.out.println("You got a D grade.");
        }
      case 3:
        if(grade > 60 && grade <= 75){
          System.out.println("You got a C grade");
        }
      case 4: 
        if(grade > 75 && grade <= 85){
          System.out.println("You got a B grade");
        }
      case 5: 
        if(grade > 85 && grade <= 100){
          System.out.println("You got an A grade");
        }
    }
  }
}