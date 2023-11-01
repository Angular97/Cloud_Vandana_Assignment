//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    shuffleArray(array);

    System.out.println("Shuffled Array:");
    for (int value : array) {
        System.out.print(value + " ");
    }
  }
  public static void shuffleArray(int[] array) {
      Random rand = new Random();
      int n = array.length;
      for (int i = n - 1; i > 0; i--) {
          int j = rand.nextInt(i + 1);
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
      }
  }
}

// Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String romanNumeral = "IX"; 
        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }

        return total;
    }
}


// Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z) 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase(); 
        boolean[] alphabetPresent = new boolean[26]; 

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a'; 
                alphabetPresent[index] = true;
            }
        }

        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false; 
            }
        }

        return true;
    }
}
