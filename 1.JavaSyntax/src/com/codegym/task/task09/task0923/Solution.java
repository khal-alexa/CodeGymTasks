package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        ArrayList<Character> consonantsInString = new ArrayList<>();
        ArrayList<Character> vowelsInString = new ArrayList<>();
        char[] charsFromString = str.toCharArray();
        int charArrayLength = charsFromString.length;

        for (int i = 0; i <charArrayLength ; i++) {
            if (isVowel(charsFromString[i])) {
                vowelsInString.add(charsFromString[i]);
            }
            else if (!isVowel(charsFromString[i]) && charsFromString[i] != ' '){
                consonantsInString.add(charsFromString[i]);
            }
        }

        for (int i = 0; i <vowelsInString.size() ; i++) {
            System.out.print(vowelsInString.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i <consonantsInString.size() ; i++) {
            System.out.print(consonantsInString.get(i) + " ");

        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}