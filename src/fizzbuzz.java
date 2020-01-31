import java.util.stream.IntStream;

public class fizzbuzz {
    /*
1 から 100 までの数字を数えていき、
3 の倍数なら Fizz
5 の倍数なら Buzz
3 の倍数かつ 5 の倍数なら FizzBuzz
それ以外は、その数字を出力する。
     */
    public static void FIZZBUZZ() {
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//        }


 /*
 fizzbuzz1行
 ラムダ式使ってみた
  */
        IntStream.rangeClosed(1, 100).forEach (x -> System.out.format("%s%s%n", (x%3 == 0 ? "Fizz" : ""), (x%5 == 0 ? "Buzz" : (x%3 == 0 ? "" : x))));
    }
}