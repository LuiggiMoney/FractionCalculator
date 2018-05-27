package oopjava;
import java.util.*;
/**
 * @author LuiggiFernandez
 */
public class FractionCalculator {

    static Scanner K = new Scanner(System.in);
    static char option;
    static Fraction Frac1;
    static Fraction Frac2;
    static Fraction FracRes;
    
    public static void main(String[] args) {
        switch (getOperation(K)) {
            case "Q":
                System.exit(0);
                break;
            case "q":
                System.exit(0);
                break;
            case "+":
                Frac1 = getFraction(K, K);
                Frac2 = getFraction(K, K);
                FracRes = Frac1.add(Frac2);
                System.out.println("The result of "+Frac1+" + "+Frac2+" is: "+FracRes+" or: "+FracRes.toDouble());
                getOperation(K);
                break;
            case "-":
                Frac1 = getFraction(K, K);
                Frac2 = getFraction(K, K);
                FracRes = Frac1.add(Frac2);
                System.out.println("The result of "+Frac1+" - "+Frac2+" is: "+FracRes+" or: "+FracRes.toDouble());
                getOperation(K);
                break;
            case "*":
                Frac1 = getFraction(K, K);
                Frac2 = getFraction(K, K);
                FracRes = Frac1.add(Frac2);
                System.out.println("The result of "+Frac1+" * "+Frac2+" is: "+FracRes+" or: "+FracRes.toDouble());
                getOperation(K);
                break;
            case "/":
                Frac1 = getFraction(K, K);
                Frac2 = getFraction(K, K);
                FracRes = Frac1.add(Frac2);
                System.out.println("The result of "+Frac1+" / "+Frac2+" is: "+FracRes+" or: "+FracRes.toDouble());
                getOperation(K);
                break;
            case "=":
                Frac1 = getFraction(K, K);
                Frac2 = getFraction(K, K);
                boolean x5 = Frac1.equals(Frac2);
                System.out.println(Frac1+" = "+Frac2+" is: "+x5);
                getOperation(K);
                break;
        }
    }
    
    public static String getOperation(Scanner input) {
        System.out.println("Enter an operator ('+', '-', '/', '*', '=') or 'Q' for quit: ");
        while (!K.hasNext("[+*-/qQ]")){
            K.next();
            System.out.println("Invalid Operator\nEnter a valid operator ('+', '-', '/', '*', '=') or 'Q' for quit: ");
        }
        option = K.next().charAt(0);
        return Character.toString(option);
    }
    
    public static boolean validFraction(Fraction other) {
        if  (K.hasNext("[-]?")) {
            if (K.hasNext("[/]?")) {
                return true;
            } else {
                return false;
            }
        } 
        else {
            return false;
        }
    }
    
    public static Fraction getFraction(Scanner input, Scanner input2) {
        System.out.println("Enter a fraction in the form of two integers (a)/(b): ");
        //while (!validFraction(getFraction(K, K)))getFraction(K, K); 
        int numerator = input.nextInt();
        int denominator = input2.nextInt();
        Fraction newFrac = new Fraction(numerator, denominator);
        return newFrac;
    }
    
}
