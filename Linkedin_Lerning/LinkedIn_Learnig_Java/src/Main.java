//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Pick a number between 1 - 10 :");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        if (num < 5){
//            System.out.println("Enjoy the good luck a friend brings to you");
//        }
//        else{
//            System.out.println("Your shoe collection will make you happy today");
//        }
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//        boolean IsOnRepeat = true;
//        while(IsOnRepeat) {
//            System.out.println("Playing current song ");
//            System.out.print("Do you want to change the song : ");
//            String UserInput = input.next();
//
//            if(UserInput.equals("Yes") || UserInput.equals("yes")){
//                IsOnRepeat = false;
//            }
//
//        }
//        System.out.println("Playing next song ! ");
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main (String [] args) {
//        Scanner input = new Scanner(System.in);
//
//        String question = "What is the capital of Sri Lanka ? ";
//        String answerOne = "Jaffna";
//        String answerTwo = "Colombo";
//        String answerThree = "Kandy";
//
//        String correctAnswer = answerTwo;
//
//        System.out.println(question);
//        System.out.println(answerOne +"\n"+answerTwo+"\n"+answerThree);
//
//        System.out.print("Enter Your Answer : ");
//        String userInput = input.next();
//
//        if(userInput.equals("Colombo") || userInput.equals("colombo")) {
//            System.out.println("Congratz ! You are correct ");
//        }
//        else{
//            System.out.println("Sorry the correct answer is: "+correctAnswer);
//        }
//    }
//}
//import java.util.Scanner;
//public class Main{
//    public static void announceDeveloperTeaTime() {
//        System.out.println("Waiting for developer tea time...");
//        System.out.println("Enter random word and press enter to start developer tea time");
//        Scanner input = new Scanner(System.in);
//        input.next();
//        System.out.println("Its developer tea time!");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Welcome to your new job ..!");
//
//        announceDeveloperTeaTime();
//
//        System.out.println("Write code ..!");
//        System.out.println("Review code ..!");
//
//        announceDeveloperTeaTime();
//
//        System.out.println("Get promoted ..!");
//
//    }
//}


//public class Main {
//    public static double CalculateTotalMealPrice( double listedMealPrice, double tipRate, double taxRate) {
//        double tip = tipRate * listedMealPrice;
//        double tax = taxRate * listedMealPrice;
//        double result = listedMealPrice + tip + tax;
//        return result;
//    }
//    public static void main(String[] args) {
//        double groupTotalMealPrice = CalculateTotalMealPrice(100,.2,.08);
//        System.out.println(groupTotalMealPrice);
//
//        double individualMealPrice = groupTotalMealPrice / 5;
//        System.out.println(individualMealPrice);
//    }
//}


//public class Main {
//    public static void main (String[] args) {
//        double result = Math.pow(2,5);
//        System.out.println(result);
//    }
//}


//public class Main {
//
//    public static double salaryMaker(double hoursPerWeek, double hourlyPayment, int vacationDays) {
//
//        if (hoursPerWeek < 0) {
//            return -1;
//        }
//        if (hourlyPayment < 0) {
//            return -2;
//        }
//        double weeklyPayCheck = hoursPerWeek * hourlyPayment;
//        double unpaidTime = vacationDays * hourlyPayment * 8;
//        return (weeklyPayCheck * 52) - unpaidTime;
//    }
//
//    public static void main(String[] srgs) {
//        double salary = salaryMaker(40,150, 5);
//        if (salary == -1){
//            System.out.println("Invalid amount of hours entered");
//        }
//        if (salary == -2){
//            System.out.println("Invalid amount of hourly payment entered");
//        }
//        System.out.println(salary);
//    }
//}

//Create a java application two new numerical inputs and passed them as parameters to another class. Inside the added
//class check the maximum number and return the max value out of the function. Display return value accordingly.

//public class Main {
//    public static int checkMaxNumber(int num1, int num2) {
//        int numb1 = num1;
//        int numb2 = num2;
//        int max = 0;
//
//        if(numb1 > numb2) {
//            max = numb1;
//        }
//        else {
//            max = numb2;
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int max = checkMaxNumber(10,20);
//        System.out.println(max);
//    }
//}

//Create a java application to get the size of an array and pass that value as a parameter to another class. Inside the
//class create an array based on parameter value and get user inputs to the array. From the
//class return the summation of 0 index and the last index of the array and display the summation inside main method.

//import java.util.Scanner;
//public class Main {
//    public static int sumOfAnArray(int ArraySize){
//        int size = ArraySize;
//        int [] Array = new int[size];
//
//        Scanner input = new Scanner(System.in);
//        for(int i=0; i<size; i++){
//            System.out.println("enter a number to array : ");
//            Array[i] = input.nextInt();
//        }
//
//        int sum = Array[0] + Array[size-1];
//        return sum;
//    }
//    public static void main (String [] args){
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the array size : ");
//        int size = input.nextInt();
//
//        int sum = sumOfAnArray(size);
//
//        System.out.println(sum);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Triangle triangleA = new Triangle(15,8,15,8,17);
//        Triangle triangleB = new Triangle (3,2.598,3,3,3);
//
//        double triangleAArea = triangleA.findArea();
//        System.out.println(triangleAArea);
//
//        double triangleBArea = triangleB.findArea();
//        System.out.println(triangleBArea);
//    }
//}


//public class Main{
//    public static void main(String[] args) {
//        StudentProfile profileOne = new StudentProfile("Sally","Salmon","Film",3.75,2022);
//        StudentProfile profileTwo = new StudentProfile("Max", "Tiffen","Computer Science",3.45,2021);
//
//        profileTwo.GraduationYear();
//        System.out.println(profileTwo.YearToGraduate);
//    }
//}