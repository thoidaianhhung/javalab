package main;

import java.util.Scanner;

public class GradeStudent {
//This instance variable is visible for any child class
 public static int weightMid;
 public static int weightFinal;
 public static int weightHomework;
 static Scanner input = new Scanner(System.in);
 // The main() function controls the main thread of the program.
 public static void main(String[] args) {
   double weightedScoreMid;
   double weightedScoreFinal;
   double weightedScoreHomework;
   begin();
   System.out.println();
   weightedScoreMid = midTerm();
   System.out.println();
   weightedScoreFinal = finalTerm();
   System.out.println();
   weightedScoreHomework = homework();
   System.out.println();
   report(weightedScoreMid, weightedScoreFinal, weightedScoreHomework);
 }
 // The begin() function to display a welcome message
 public static void begin() {
   System.out.println("This program reads exam/homework scores and reports your overall course grade.");
 }
 // The midTerm() function to enter and calculate mid-term test scores
 public static double midTerm() {
   double weightedScoreMid;
   int scoreEarned = 0;
   int scoreShifted;
   int shiftAmount = 0;
   System.out.println("Mid term :");
   System.out.print("Weight (0 - 100)? ");
   
   weightMid = 0;
   // Weight check is an integer
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       weightMid = input.nextInt();
       if (weightMid > 0 && weightMid < 100) {
         break;
       }
       System.out.print("Weight (0 - 100)? ");
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Weight (0 - 100)? ");
       input.next();
     }
   }
   System.out.print("Score earned? ");
   // The scored earned check is an integer.
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       scoreEarned = input.nextInt();
       break;
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Score earned? ");
       input.next();
     }
   }
   System.out.print("Were scores shifted (1 = yes, 2=no)? ");
   // The score shifted check is an integer.
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       scoreShifted = input.nextInt();
       if (scoreShifted == 1) {
         System.out.print("Shift amount? ");
         // The shiftAmount check is an integer.
         while (input.hasNext()) {
           if (input.hasNextInt()) {
             shiftAmount = input.nextInt();
             break;
           }
           else {
             System.out.println("Please enter an integer.");
             System.out.print("Shift amount? ");
             input.next();
           }
         }
         break;
       }
       else if (scoreShifted == 2) {
         break;
       }
       System.out.print("Were scores shifted (1 = yes, 2=no)? ");
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Were scores shifted (1 = yes, 2=no)? ");
       input.next();
     }
   }
   int totalPoints = scoreEarned + shiftAmount;
   // Maximum score of total score is 100.
   if (totalPoints > 100) {
     totalPoints = 100;
   }
   System.out.println("Total points = " + totalPoints + " / 100");
   weightedScoreMid = (double) totalPoints * weightMid / 100;
   weightedScoreMid = Math.floor(weightedScoreMid * 10) / 10;
   System.out.println("Weighted score = " + weightedScoreMid + " / " +weightMid);
   return weightedScoreMid;
 }
 // The finalTerm() function to enter and calculate final exam scores
 public static double finalTerm() {
   double weightedScoreFinal;
   int scoreEarned = 0;
   int scoreShifted;
   int shiftAmount = 0;
   System.out.println("Final term :");
   System.out.print("Weight (0 - 100)? ");
   
   weightFinal = 0;
   // Weight check is an integer
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       weightFinal = input.nextInt();
       if (weightFinal > 0 && weightFinal < 100) {
         if (weightMid + weightFinal < 100) {
           break;
         }
         else {
           System.out.println("The weight of midterm and final term must be less than 100.");
         }
       }
       System.out.print("Weight (0 - 100)? ");
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Weight (0 - 100)? ");
       input.next();
     }
   }
   System.out.print("Score earned? ");
   // The scored earned check is an integer.
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       scoreEarned = input.nextInt();
       break;
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Score earned? ");
       input.next();
     }
   }
   System.out.print("Were scores shifted (1 = yes, 2=no)? ");
   // The score shifted check is an integer.
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       scoreShifted = input.nextInt();
       if (scoreShifted == 1) {
         System.out.print("Shift amount? ");
         // The shiftAmount check is an integer.
         while (input.hasNext()) {
           if (input.hasNextInt()) {
             shiftAmount = input.nextInt();
             break;
           }
           else {
             System.out.println("Please enter an integer.");
             System.out.print("Shift amount? ");
             input.next();
           }
         }
         break;
       }
       else if (scoreShifted == 2) {
         break;
       }
       System.out.print("Were scores shifted (1 = yes, 2=no)? ");
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Were scores shifted (1 = yes, 2=no)? ");
       input.next();
     }
   }
   int totalPoints = scoreEarned + shiftAmount;
   // Maximum score of total score is 100.
   if (totalPoints > 100) {
     totalPoints = 100;
   }
   System.out.println("Total points = " + totalPoints + " / 100");
   weightedScoreFinal = (double) totalPoints * weightFinal / 100;
   weightedScoreFinal = Math.floor(weightedScoreFinal * 10) / 10;
   System.out.println("Weighted score = " + weightedScoreFinal + " / " +weightFinal);
   return weightedScoreFinal;
 }

 // The homework() function to enter and calculate homework scores
 public static double homework() {
   double weightedScoreHomework;
   int number = 0;
   int score;
   int max;
   int sumScore = 0;
   int sumMax = 0;
   int point;
   int attend = 0;
   
   System.out.println("Homework :");
   System.out.print("Weight (0 - 100)? ");
   weightHomework = 0;

   // Weight check is an integer
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       weightHomework = input.nextInt();
       if (weightHomework > 0 && weightHomework < 100) {
         if (weightMid + weightFinal + weightHomework == 100) {
             break;
           }
           else {
             System.out.println("The weight of the 3 test scores must have an overall total of 100.");
           }
         }
       System.out.print("Weight (0 - 100)? ");
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Weight (0 - 100)? ");
       input.next();
     }
   }

   System.out.print("Number of assignments? ");

   // The number of assignments check is an integer.
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       number = input.nextInt();
       break;
     }
     else {
       System.out.println("Please enter an integer.");
       System.out.print("Number of assignments? ");
       input.next();
     }
   }
   // The number of points to enter
   for (int i = 1; i <= number; i++) {
     System.out.print("Assignment " + i + " score and max? ");
     // The score and the max check is an integer.
     while (input.hasNext()) {
       try {
         score = input.nextInt();
         max = input.nextInt();
         sumScore += score;
         sumMax += max;
         break;
       }
       catch (Exception e) {
         System.out.println("Please enter an integer.");
         System.out.print("Assignment " + i + " score and max? ");
         input.next();
       }
     }
   }
   System.out.print("How many sections did you attend? ");
   // The attend check is an integer.
   while (input.hasNext()) {
     if (input.hasNextInt()) {
       attend = input.nextInt();
       break;
     }
     else  {
       System.out.println("Please enter an integer.");
       System.out.print("How many sections did you attend? ");
       input.next();
     }
   }
   point = attend * 5;
   // The maximum score for the Attend part is 30.
   if (point > 30) {
     point = 30;
   }
   System.out.println("Section points = " + point + "/ 30");
   sumScore += point;
   sumMax += 30;
   // The maximum exercise section is 150.
   if (sumScore > 150) {
     sumScore = 150;
   }
   // The maximum exercise section is 150.
   if (sumMax > 150) {
     sumMax = 150;
   }
   System.out.println("Total points = " + sumScore + " / " + sumMax);
   weightedScoreHomework = (double) sumScore * weightHomework / sumMax;
   weightedScoreHomework = Math.floor(weightedScoreHomework * 10) / 10;
   System.out.println("Weighted score = " + weightedScoreHomework + " / " + weightHomework);
   return  weightedScoreHomework;
 }
 // The report() function to calculate the display of GPA results as well as the corresponding comment notice
 public static void report(double weightedScoreMid, double weightedScoreFinal, double weightedScoreHomework) {
   double grade = weightedScoreMid + weightedScoreFinal + weightedScoreHomework;
   System.out.println("Overall percentage = " + grade);
   if (grade == 100) {
     System.out.println("Your grade will be at least: 4.0");
     System.out.println("Students achieve excellent results.");
   }
   else if (grade >= 85) {
     System.out.println("Your grade will be at least: 3.0");
     System.out.println("Students achieve good results.");
   }
   else if (grade >= 75 && grade < 85) {
     System.out.println("Your grade will be at least: 2.0");
     System.out.println("Students achieve quite good results.");
   }
   else if (grade >= 60 && grade < 75) {
     System.out.println("Your grade will be at least: 0.7");
     System.out.println("Students achieve average results.");
   }
   else {
     System.out.println("Your grade will be at least: 0.0");
     System.out.println("Students achieve weak results.");
   }
 }
}
