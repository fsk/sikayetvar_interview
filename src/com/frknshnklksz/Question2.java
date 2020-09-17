package com.frknshnklksz;

import java.util.Scanner;

public class Question2 {

    public static void displayQuestion2(){
        System.out.println();
        System.out.println(Colors.Red+"            -----> QUESTION 2 <-----     ");
        System.out.println();
        System.out.println(Colors.Cyan+"Geliştirdiğiniz \"isUnique\" algoritmasını " +
                "\nherhangi bir veri yapısı (array, list, map vs.)\n" +
                "içermeyecek şekilde yeniden geliştiriniz.");
        System.out.println();
    }

    public static void question2testCases(){
        System.out.println(Colors.Black+"                    TEST CASES                      ");
        System.out.println(Colors.Black+"----------------------------------------------------");
        System.out.println(Colors.Black+"tree        ->  "+ isUnique("tree"));
        System.out.println(Colors.Black+"home        ->  "+ isUnique("home"));
        System.out.println(Colors.Black+"ApPle       ->  "+ isUnique("ApPle"));
        System.out.println(Colors.Black+"PAPER       ->  "+ isUnique("PAPER"));
        System.out.println(Colors.Black+"123aab      ->  "+ isUnique("123aab"));
        System.out.println(Colors.Black+"   aBc      ->  "+ isUnique("   aBc")+" (Space yani boşluk da bir karakterdir ve birden fazla kullanılırsa false döner.)");
        System.out.println(Colors.Black+"abca        ->  "+ isUnique("abca   "));
        System.out.println(Colors.Black+"4,7         ->  "+ isUnique("4,7")+" (4,7 bir stringtir ve aynı karakter yoktur.)");
        System.out.println(Colors.Black+"6,88        ->  "+ isUnique("6,88"));
        System.out.println();
    }

    public static void question2(){
        String text;
        Scanner data = new Scanner(System.in);
        System.out.print(Colors.Green+"Enter Text: ");
        text = data.next();

        String newText = text.toLowerCase().trim();

        System.out.print(Colors.Yellow+"Result: "+isUnique(newText));
        System.out.println();
    }

    public static boolean isUnique(String text){
        char temp1;
        char temp2;
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            temp1 = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                temp2 = text.charAt(j);
                if (temp1 == temp2) {
                    count++;
                }
            }

        }

        if (count>=1){
            return true;
        }else {
            return false;
        }
    }
}


//Açıklama Satırları

/**
 *   1) isUnique() methodunun içerisinde 30 ve 31. satırlarda bir geçici tanımladım.
 *
 *
 *   2) 34. satırdaki for ile gelen stringin length'ine kadar geri döndüm.
 *
 *   3) 35. satırdaki geçicinin değeri (dıştaki for olduğu için içteki for bitmeden işlem yapamayacak.)
 *      0. indisten itibaren içteki for bittikçe indise göre şekil alacak.
 *
 *    4) 36. satırdaki içteki forda ise yine stringi döndüm ama i ye göre değer alacak.
 *       Bu sayede i=0 ise j= 1 olacak ya da i = 3 te iken j = 4 olacak. Yani dıştaki for sabit beklerken,
 *       içteki for her döndüğünde o anki değerle karşılaştırışacak. (38. satır)
 *
 *       i=0. indiste iken j=1.indis, 2.indis, 3.indis..... n.indis
 *       i=1. indiste iken j=2.indis, 3.indis, 4.indis..... n.indis
 *
 *     5) 45. satırda eğer eşitlik varsa false ya da true dönecek.
 */


