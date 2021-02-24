package edu.ru.lab05;

public class MainClass {
    
    public static void main(String[] args){
        System.out.println(isPalindrome("aba")); // is looking for palindrome in word in parenthesis
        System.out.println(isPalindrome("bhjjhb")); // is looking for palindrome in word in parenthesis
        System.out.println(isPalindrome("xcsdavdsfbda")); // is looking for palindrome in word in parenthesis
        System.out.println(isPalindrome("saba")); // is looking for palindrome in word in parenthesis
        System.out.println(isPalindrome("dv15sadv4")); // is looking for palindrome in word in parenthesis
    }
    
    public static boolean isPalindrome(String word){ // start of function
        
        int i = 0; // define integer
        int j = word.length() - 1; // define integer
        
        while(j > i){ // while loop start
            if (word.charAt(i) != word.charAt(j)){ // loop terms
                return false; // will return false if word is a not palindrome
            }
            i = i + 1;
            j = j - 1;
        }
        
        return true; // will return true if word is a palindrome
    }
    
}
