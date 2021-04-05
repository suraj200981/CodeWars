public class seventhKyuStringEndsWith {

    public static void main(String[] args) {
        System.out.println(solution("abc","bc"));  // returns true
        System.out.println(solution("abc","d"));  // returns false

    }

    public static boolean solution(String str, String ending){


        if(ending.equals(str.substring(1))){
            return true;
        }

        return false;
    }
}
