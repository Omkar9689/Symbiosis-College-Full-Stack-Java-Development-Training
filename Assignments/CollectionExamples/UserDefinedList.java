package CollectionExamples;

import java.util.*;

public class UserDefinedList {
    
    public static void main(String[] args) {
        
        int choice, num;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        
        try {
            do {
                System.out.println("-----Menu----");
                System.out.println("1) Add More");
                System.out.println("2) Display All");
                System.out.println("3) Display Even");
                System.out.println("4) Display Odd");
                System.out.println("5) Exit");
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        try {
                            System.out.println("\nEnter Integer");
                            list.add(sc.nextInt());
                        } catch (InputMismatchException e) {
                            System.out.println("Wrong Input. Please enter an integer.");
                            sc.next(); 
                        }
                        break;
                        
                    case 2:
                        System.out.println("\nDisplaying All Records");
                        for (Integer i : list) {
                            System.out.println(i);
                        }
                        break;
                        
                    case 3:
                        System.out.println("\nDisplaying Even Numbers");
                        for (Integer i : list) {
                            if (i % 2 == 0) {
                                System.out.println(i);
                            }
                        }
                        break;
                        
                    case 4:
                        System.out.println("\nDisplaying Odd Numbers");
                        for (Integer i : list) {
                            if (i % 2 != 0) {
                                System.out.println(i);
                            }
                        }
                        break;
                    
                    case 5:
                        System.out.println("Exiting...");
                        break;
                        
                    default:
                        System.out.println("Invalid Input. Please select a valid option.");
                }
            } while (choice != 5);
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
