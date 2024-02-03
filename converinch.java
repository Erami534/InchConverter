# InchConverter

//Antonio, In class assignment 1. Converts the inches to feet

import java.util.Scanner;
public class InchConversion {

    public static void main (String[] args) {
      double inches;
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inches ");
          inches = input.nextDouble();
          calcInches(inches);

      }

        public static void calcInches(double inches) {
          double feet;
          feet = inches/12;
          System.out.println("You entered "+ feet+ " feet");

          }
  }
  
