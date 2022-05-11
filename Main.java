// Kaden & Owen's Awesome Calculator (Trademark pending)

import java.util.Scanner;
import java.lang.Math;

class Main {

  static int maxArrLen = 100;
  static int memLen = 0;
  static int[] memory = new int [maxArrLen];
  
  public static void main(String[] args) {
  start();
  }


  public static void start() {

    Scanner input = new Scanner(System.in); // Create a Scanner object

  System.out.println("\nKaden & Owen's Awesome Calculator (Trademark pending)\n\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Mod\n6. Equals\n7. Save\n8. Load\n9. Clear\n10. Header\n0. Exit"); // REMEMBER TO ADD NEW METHODS TO THE PRINTED LIST HERE!
      
    String num = input.nextLine(); // Read user input

    if (isNum(num)) {
    switch(num) {
    case("0"): exit(); break;
    case("1"): add(); break;
    case("2"): sub(); break;
    case("3"): mult(); break;
    case("4"): div(); break;
    case("5"): mod(); break;
    case("6"): equal(); break;
    case("7"): save(); break;
    case("8"): load(1); break;
    case("9"): clear(); break;
    case("10"): header(); break;
    default: System.out.println("Error Num not acceptted. No Matching Method"); start(); break;
      }
    } else {
    System.out.println("Error Letters Not Acceptted");
    start();
    }
  }

  public static void add() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
  
  int b = 0, a = 0;
    
  System.out.println("Enter First Num or Mem:");
  a = setA();
  System.out.println("Enter Second Num:");
  b = input.nextInt(); // Read user input
  a = a + b;
  System.out.println("The Answer Is " + a);
  start();
  }
//Wee Woo Wee Woo Wee Woo
  public static void sub() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
    
  int a = 0, b = 0;
  System.out.println("Enter First Num or Mem:");
  a = setA(); // Either Num or Mem
  System.out.println("Enter Second Num:");
  b = input.nextInt(); // Read user input
  a = a - b;
  System.out.println("The Answer Is " + a);
  start();
  }
  
  public static void mult() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
    
  int a = 0, b = 0;
  System.out.println("Enter First Num or Mem:");
  a = setA(); // Either Num or Mem
  System.out.println("Enter Second Num:");
  b = input.nextInt(); // Read user input
  a = a * b;
  System.out.println("The Answer Is " + a);
  start();
  }
  
  public static void exit() {
  System.out.println("Program exited ;)");
  }

  public static void header() {
  System.out.println("\n*************************************************************\n***                                                       ***\n*** Kaden AKA @Jellyjam14blas#4447 | Frank Hurt Secondary ***\n*** Exercise Program: 03                                  ***\n*** Kaden & Owen's Awesome Calculator (Trademark pending) ***\n*** Computer Programming, Block: B                        ***\n*** Grade: 11                                             ***\n*** Computer: Dell                                        ***\n*** Welcome to Jellyverse!                                ***\n***                                                       ***\n*************************************************************\n");
  System.out.println("*************************************************************\n***                                                       ***\n*** Owen Lussier | Frank Hurt Secondary                   ***\n*** Exercise Program: 03 |                                ***\n*** Computer Programming, Block: B                        ***\n*** Grade: 11                                             ***\n*** Computer: Dell                                        ***\n*** Butter Dog                                            ***\n***                                                       ***\n*************************************************************\n");
  start();
  }
  public static void div() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
    
  int a = 0, b = 0;
  System.out.println("Enter First Num or Mem:");
  a = setA(); // Either Num or Mem
  System.out.println("Enter Second Num:");
  b = input.nextInt(); // Read user input
    if (b == 0){
    System.out.println("(Error Divition by Zero)\n\n\n\n\nBEEP BOOP, ANSWER IS 42 ;3");
    } else {
      if (b > a) {
      System.out.println("Result is smaller than 0, and cannot be displayed");
        } else {
        a = a / b;
        System.out.println("The Answer Is " + a);
        }
     }
  start();
  }
  
  public static void mod() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
    
  int a = 0, b = 0;
  System.out.println("Enter First Num or Mem:");
  a = setA(); // Either Num or Mem
  System.out.println("Enter Second Num:");
  b = input.nextInt(); // Read user input
  a = a % b;
  System.out.println("The Answer Is " + a);
  start();
  }
  public static void equal() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
    
  int a = 0, b = 0;
  System.out.println("Enter First Num or Mem:");
  a = setA(); // Either Num or Mem
  System.out.println("Enter Second Num:");
  b = input.nextInt(); // Read user input
    if (a == b) {
    System.out.println(a + " Equals " + b);
    } else {
    System.out.println(a + " Does Not Equal " + b);
    }
  start();
  }

  public static void save() {
  Scanner input = new Scanner(System.in); // Create a Scanner object
  System.out.println("Ready to Save.(10 to End)");
    int[] intString = new int[maxArrLen];
    
    int j = 1;
    int tempInt = 0;
    while (tempInt < 10) {
    tempInt = input.nextInt(); // Read user input
    if (tempInt < 10) {
    intString[j] = tempInt;
    System.out.println("Saved that digit");
    }
    j++;  
    }
    intString[j] = 0;
    memLen = j - 1;
    for (int i = 0; i < memLen; i++) {
    memory[i] = intString[i];
    System.out.println("Storing memory");
    }
    System.out.println("Done Saving");
  start();
  }


  public static int load(int print) {
    
    int sum = 0;
    if (print == 1) {
      for (int i = 1; i < memLen; i++) {
      System.out.print(memory[i] + " ");
      }
    start();
    } else {
      for (int i = 1; i < memLen; i++) {
        sum *= 10;
        sum += memory[i];
      }
      return(sum);
    }
    return(0);
  }

  public static void clear() {
    for (int i = 0; i < maxArrLen-1; i++) {
    memory[i] = 0;
    }
    System.out.println("Cleared Memory");
    start();
  }

  public static boolean isNum(String str) { 
  try {  
    Integer.parseInt(str);  
    return true;
  } catch(NumberFormatException e){  
    return false;  
    }  
  }

  public static int setA() {
    int a = 0;
    Scanner input = new Scanner(System.in); // Create a Scanner object
    String str = input.nextLine(); // Read user input
    if ("Mem".equalsIgnoreCase(str)) {
    System.out.println("mem recieved");
      if (load(0) != 0) { // So if memory is empty it won't work if (load(0) == null) {}
      a = load(0); // Load(0) is loading memeory without printing anything
      } else {
      System.out.println("Memory is Empty, so 0 will be used instead");  
      }
    } else {
    //System.out.println("str to int");
    a = Integer.valueOf(str); // Only if user entered an int like 5, rather than text like Mem
    }
    return(a);
  }

}