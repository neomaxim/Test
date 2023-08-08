package lesson2.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()  ){
            int a = scan.nextInt();

            String res;
            switch (a){
                case 1 :
                    res = "Январь";
                    break;
                case 2:
                    res = "Февраль";
                    break;
                case 3:
                    res = "Март";
                    break;
                case 4:
                    res = "Апрель";
                    break;
                case 5:
                    res = "Май";
                    break;
                case 6:
                    res = "Июнь";
                    break;
                case 7:
                    res = "Июль";
                    break;
                case 8:
                    res = "Август";
                    break;
                case 9:
                    res = "Сентябрь";
                    break;
                case 10:
                    res = "Октябрь";
                    break;
                case 11:
                    res = "Ноябрь";
                    break;
                case 12:
                    res = "Декабрь";
                    break;
                default:
                    res = "вы ввели число в не допустимом диапозоне !";

            }
            System.out.println(res);


        }
        else  {
            System.out.println("надо вводить число!!!" );
        }



    }
}
