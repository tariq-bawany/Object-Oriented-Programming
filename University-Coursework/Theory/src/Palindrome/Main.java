package Palindrome;

public class Main {
    static void main(String[] args) {
        String palindrome = "civic";
        String palindrome1 = "hello";

//        StringBuilder sb = new StringBuilder(palindrome);
        StringBuilder sb = new StringBuilder();

    String check = sb.append(palindrome1).reverse().toString();
//    check = sb.reverse().toString();
        System.out.println(palindrome.equals(check));
        System.out.println(check);
//        String check = sb.reverse().toString();
        ;

    }

}
