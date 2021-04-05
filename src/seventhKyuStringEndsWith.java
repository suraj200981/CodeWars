/*Instructions:
* Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
* */


public class seventhKyuStringEndsWith {

    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));  // returns true
        System.out.println(solution("abc", ""));  // returns true
        System.out.println(solution("abc", "abc"));  // returns true
        System.out.println(solution("samurai", "ai"));  // returns true
        System.out.println(solution("samurai", "i"));  // returns true
        System.out.println(solution("!@#$%^&*() :-)", ":-)"));//returns true
        System.out.println(solution("abc", "d"));  // returns false
        System.out.println(solution("samurai", "ra"));// returns false

    }

    public static boolean solution(String str, String ending) {

        return (ending.equals(str.substring(1))) || (str.substring(str.length() - 2).equals(ending)) || (str.substring(str.length() - 3).equals(ending)) || ((ending.length() == 1) && (str.substring(str.length() - 1).equals(ending))) || (str.equals(ending)) || (ending.equals(""));
    }
}
