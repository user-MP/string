package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static String getAlphabetString(String str){

        StringBuilder stringBuilder= new StringBuilder(20);

        for(int i=0;i<str.length();i++){

            char indx=str.charAt(i);

            if(indx>=97 && indx<=122 || indx>=65 && indx<=90){
                stringBuilder.append(indx);


            }

        }

        return stringBuilder.toString();

    }

    public static String sortedString(String str){

        char [] arrayCharacters=str.toLowerCase().toCharArray();
        Arrays.sort(arrayCharacters);

        return new String(arrayCharacters);
    }

    public static boolean isAnagram(String str1, String str2){

        String sortedAlphabetingStr1=sortedString( getAlphabetString(str1) );

        String sortedAlphabetingStr2=sortedString( getAlphabetString(str2) );



        if(sortedAlphabetingStr1.equals(sortedAlphabetingStr2)){
            System.out.println("Words are anagrams");
            return true;
        }
        else{
            System.out.println("Words are not anagrams");
            return false;
        }

    }




    public static void main(String[] args) {
         
  



//        Third task
//        String word1="world around";
//        String word2="round a world";
//        System.out.println(isAnagram(word1,word2));


    }
}