import java.util.*;

public class StringVowel&Consonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine().toLowerCase(); 

        List<Character> vowelList = new ArrayList<>();
        List<Character> consonantList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
        	
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) { 
            	
                if ("aeiou".indexOf(ch) != -1) { 
                    vowelList.add(ch);
                }
                else { 
                    consonantList.add(ch);
                }
            }
        }

        System.out.println("Num of Vowels:- "+vowelList.size());

        System.out.println("Num of Consonants:- "+consonantList.size());
        sc.close(); 
    }
}
