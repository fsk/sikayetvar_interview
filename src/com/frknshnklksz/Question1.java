package com.frknshnklksz;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    public void displayQuestion1() {

        System.out.println();
        System.out.println(Colors.Red+"                      -----> QUESTION 1 <-----     ");
        System.out.println();
        System.out.println(Colors.Cyan+"Verilen bir string değerinin içerdiği tüm farklı karakterlerin, " +
                "\nbu string içerisinde yalnızca\n" +
                "bir kere bulunup bulunmadığını belirleyen bir algoritma geliştiriniz.");
        System.out.println();

    }

    public void question1testCases(){
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

  public void question1(){

            String text;
            Scanner data = new Scanner(System.in);
            System.out.print(Colors.Green+"Enter Text: ");
            text = data.next();
            System.out.println(Colors.Yellow+"Result: " + isUnique(text));
            System.out.println();


  }

    public boolean isUnique(String text) {

        int count = 0;
        String newText = text.toLowerCase().trim();
        ArrayList<Character> textList = new ArrayList<>();

        for (Character c :
                newText.toCharArray()) {
            textList.add(c);
        }


        for (int i = 0; i < textList.size(); i++) {
            for (int j = i + 1; j < textList.size(); j++) {
                if (textList.get(i) == textList.get(j)) {
                    count++;
                }
            }
        }

        if (count >= 1) {
            return false;
        } else {
            return true;
        }
    }

}

//Aciklama Satirlari

/**
 *     1) isUnique() methodunda gelen stringi standartı sağlaması ve exceptiona düşmemek için
 *        toLowerCase() methodu ile hepsini küçük harfe çevirdim.
 *        trim() methodu ile soldan ve sağdan girilebilecek boşlukları engelledim.
 *
 *
 *     2) 37. satırda, 35. satırda oluşturduğum Char listinin içine gelen stringin karakterlerini attım.
 *
 *
 *     3) 42.satırdaki for döngüsünde bütün arrayi içteki for döngüsüyle dolaşarak kontrolü yaptım.
 *
 *
 *     4) Eğer eşitlik var ise 45. satırda countu arttırdım.
 *
 *
 *    5) 50. satırda ise counta göre true ya da false döndürdüm.
 */




