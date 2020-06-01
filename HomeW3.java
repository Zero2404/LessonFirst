package lesson1;
       /* byte b = 25;
        short s = 1111;
        int i = 1234567;
        char c = 'H';
        long l = 1000L;
        float f = 200.0f;
        double d = 1.000001;
        boolean bool = false;*/

public class HomeW3 {
    public static void main(String[] args) {
        System.out.println(calc (1, 2, 3, 4));

        System.out.println(isInRange(5, 2));

        int valueForCheck = 10;
        checkValue(valueForCheck);

        System.out.println(isNegative(-10));
        String myName = "Alex";
        greetings (myName);

        int year = 2004;
        String isLeapStr = isLeapYear(year) ? "leap" : "not leap";
        System.out.println("Year " + year + " is " + isLeapStr);

    }

    public static int calc(int a,int b,int c,int d) {
        return a * (b + (c / d));
    }

    public static boolean isInRange(int firstValue, int secondValue) {
        int sum = firstValue + secondValue;
        return 10 <= sum && sum <=20;
    }

    public static void checkValue (int value) {
        if (value >= 0) {
            System.out.println(value + "is positive");
        } else {
            System.out.println(value + "is negative");
        }
    }

    public static boolean isNegative(int value) {
        return value < 0;
    }

    public static void  greetings(String name) {
        System.out.println("Привет, " +  name);
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0));
    }
}
