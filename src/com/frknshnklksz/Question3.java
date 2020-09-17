package com.frknshnklksz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question3 {

    public void displayQuestion3(){
        System.out.println();
        System.out.println(Colors.Red+"          -----> QUESTION 3 <-----     ");
        System.out.println();
        System.out.println(Colors.Cyan+"İki pozitif sayıyı toplayan bir fonksiyon yazınız."+
                "\n"+"Fonksiyon içerisinde (+) ya da herhangi bir\n" +
                "aritmetik operator kulllanmamanız beklenmektedir.");
        System.out.println();
    }

    public void question3testCases(){
        System.out.println(Colors.Black+"                    TEST CASES                      ");
        System.out.println(Colors.Black+"----------------------------------------------------");
        System.out.println(Colors.Black+"3,   4        ->      " + addition(3,4));
        System.out.println(Colors.Black+"0,   12       ->      " + addition(0,12));
        System.out.println(Colors.Black+"17,  0        ->      " + addition(3,4));
        System.out.println(Colors.Black+"0,   0        ->      " + addition(0,0));
        System.out.println(Colors.Black+"-5,  9        ->      " + addition(-5,9));
        System.out.println(Colors.Black+"2,  -4        ->      " + addition(2,-4));
        System.out.println(Colors.Black+"-6, -10       ->      " + addition(-6,-10));
        System.out.println(Colors.Black+"Integer harici bir ifadede ERROR! atmakta.");
        System.out.println();
    }

    public void question3(){
        try {
            int number1, number2;
            Scanner data = new Scanner(System.in);
            System.out.print(Colors.Green+"Enter number one: ");
            number1 = data.nextInt();
            System.out.print(Colors.Green+"Enter number two: ");
            number2 = data.nextInt();
            if (number1 < 0 || number2 < 0){
                System.err.print("You entered incorrect value.!!");
                System.out.println();
            }
            System.out.print(Colors.Yellow+"Result: "+addition(number1, number2));
            System.out.println();
        }catch (Exception e){
            System.err.print("ERROR.!!! Invalid value");
            System.out.println();
            System.out.println();
        }

    }

    public int addition(int number1, int number2){

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i <number1 ; i++) {
            list1.add(number1);
        }

        for (int i = 0; i <number2 ; i++) {
            list2.add(number2);
        }

        List<Integer> combinedList = Stream.of(list1, list2)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        return combinedList.size();

    }
}

//Açıklama Satırları

/**
 *     Bu sorudaki mantığım şu:
 *     Eğer kodda herhangi bir aritmetik operatör olmayacaksa dışarıdan girilen sayılar ile
 *     dinamik 2 tane liste tanımlarım. Bu iki listeyi formalite icabı doldururum.
 *     Sonra bu iki listeyi birleştirip ortaya çıkan 3. listenin size'ını dönerim.
 *
 *
 *     1) 45. ve 46. satırlarda listeyi tanımladım.
 *
 *     2) 48. ve 52. satırlarda liste formaliteden dolacak.
 *
 *     3) 56. satırda ise Stream methodlarını ve lambda expressions'ları kullanarak listeyi birleştirip
 *        çıkan sonucu return edecek.
 */
