import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;


public class sixthKyuOrder {
    //Instructions

    /*Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

    If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.*/

    public static void main(String[] args) {

        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {

        String[] splitWordsArr = words.split(" ");
        ArrayList<Integer> numsInWords = new ArrayList<Integer>();
        HashMap<String, Integer> hashMapWords = new HashMap<String, Integer>();


        System.out.println("Initial arr: " + Arrays.toString(splitWordsArr));

        for (int x = 0; x < splitWordsArr.length; x++) {

            for (int j = 0; j < splitWordsArr[x].length(); j++) {
                String temp = splitWordsArr[x]; // each word in the array

                char c = temp.charAt(j);
                boolean flag = Character.isDigit(c);//checks to see if char is number or letter
                if (flag) {
                    if (Integer.parseInt(String.valueOf(c)) >= 1 || Integer.parseInt(String.valueOf(c)) <= temp.length()) {
                        numsInWords.add(Integer.parseInt(String.valueOf(c))); // i will apply a sorting alg to this
                        hashMapWords.put(temp, Integer.parseInt(String.valueOf(c))); // store in hashmap
                        break;
                    }
                }
            }
        }

        System.out.println("Unordered: " + hashMapWords);
        int temp1;
        int temp2;
            for (int x = 0; x < numsInWords.size() - 1; x++) {

                if (numsInWords.get(x) > numsInWords.get(x + 1)) {

                    temp1 = numsInWords.get(x + 1);
                    temp2 = numsInWords.get(x);

                    numsInWords.set(x, temp1);
                    numsInWords.set(x + 1, temp2);

                }
            }

            System.out.println(numsInWords);


        return null;

    }
}
