/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Aidan
*****************************************************************************************************
*/



public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 4;
        int d = 9;
        String name1 = "Aidan";
        String name2 = "Aidan Kwong";
        String word = "oohbaby";
        int e = 8;
        double number = 8.5;
        double secondNumber = -8.49;

       int method1 = add(a, b);
       System.out.println(method1);

       int method2 = add(a, b, c, d);
       System.out.println(method2);

       String method3 = morningGreeting(name1);
       System.out.println(method3);

       String method4 = afternoonGreeting(name2);
       System.out.println(method4);

       String method5 = triple(word);
       System.out.println(method5);

       int method6 = half(e);
       System.out.println(method6);

       double method7 = roundPositiveValueToNearestInteger(number);
       System.out.println(method7);

       double method8 = roundNegativeValueToNearestInteger(secondNumber);
       System.out.println(method8);
    }




    // 1. add
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        int e = a + b + c + d;
        return e;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name1) {
        String greeting1 = "早上好," + name1;
        return greeting1;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name2) {
        String greeting2 = "下午好," + name2;
        return greeting2;
    }


    // 5. triple
    public static String triple(String word) {
        return word + word + word;
    }


    // 6. half
    public static int half(int e) {
        int f = e / 2;
        return f;

    }



    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        int g = (int) (number + 0.5);
        return g;
    }


    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double secondNumber) {
        int h = (int) (secondNumber - 0.5);
        return h;
    }

}