public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 10;
        int intOperandB = 8;
        int intSum = 14;
        int intProduct = 7;
        int intDifference = 3;
        int intQuotient = 4;
        int intModulo = 5;
        //begin doubles
        double doubleOperandA = 5.5;
        double doubleOperandB = 3.0;
        double doubleSum = 7.5;
        double doubleProduct = 6.0;
        double doubleDifference = 12.5;
        double doubleQuotient = 4.0;
        double doubleModulo = 3.0;
        // arithmetic operations
        intSum = intOperandA + intOperandB;
        System.out.println( " The sum of " + intOperandA  + " and " + intOperandB + " is " + intSum );
        intProduct = intOperandA * intOperandB;
        System.out.println( " The product of " + intOperandA  + " and " + intOperandB + " is " + intProduct );
        intDifference = intOperandA - intOperandB;
        System.out.println( " The difference between " + intOperandA  + " and " + intOperandB + " is " + intDifference );
        intQuotient = intOperandA / intOperandB;
        System.out.println( " The quotient of " + intOperandA  + " and " + intOperandB + " is " + intQuotient );
        intModulo = intOperandA % intOperandB;
        System.out.println( " The modulo of " + intOperandA  + " and " + intOperandB + " is " + intModulo );
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " +doubleOperandB + " is " + doubleSum );
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " +doubleOperandB + " is " + doubleProduct );
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference between " + doubleOperandA + " and " +doubleOperandB + " is " + doubleDifference );
        doubleQuotient =  doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " +doubleOperandB + " is " + doubleQuotient );
        doubleModulo =  doubleOperandA / doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " +doubleOperandB + " is " + doubleModulo );

    }
}
