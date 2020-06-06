import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args){
        Greetings();
        GetTimenBudget();
        GetTime();
        GetArea();
    }
    public static void Greetings(){
        System.out.println("Welcome to Vacation Planner!");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = input.next();
        System.out.println("Great! " + place + " sounds like a great trip");
        System.out.println("**********" + "\n");
    }
    public static void GetTimenBudget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many dates are you going to spend travelling?");
        Integer days = input.nextInt();
        System.out.print("How much money in USD are you planning to spend on your trip? ");
        Double amount = input.nextDouble();
        System.out.print("What is the currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many "+ currency + " are there in 1 USD? ");
        Double conversion = input.nextDouble();
        System.out.println("If you are travelling for " + days + " days that is the same as "
                + days*24 + " hours or " + days*24*60 + " minutes.");
        Double avgspending = amount/days;
        System.out.println("If you are going to spend " + amount + " USD that means per day you can spend up to $"
        +avgspending + "USD.");
        System.out.println("Your total budget in " + currency + " is " + amount * conversion + currency
                + " which per day is " + avgspending * conversion + currency);
        System.out.println("**********" + "\n");
    }
    public static void GetTime(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Integer timeDiff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + timeDiff
                + ":00 in your travel destination and when it is noon at home it will be "
                + (12 + timeDiff) % 24 + ":00" );
        System.out.println("**********" + "\n");
    }
    public static void GetArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        Integer sqArea = input.nextInt();
        System.out.println("In miles2 that is " + (float)sqArea/2.69);
    }

}
