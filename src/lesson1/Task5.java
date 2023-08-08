package lesson1;

public class Task5 {
    public static void main(String[] args)
    {
        int n = 125;
        int a = n / 10;
        int b = n - (a * 10);
        int c = a / 10;
        int d = a - (c * 10);
        System.out.println(d + b + c);
    }
}
