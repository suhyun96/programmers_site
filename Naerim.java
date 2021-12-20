import java.util.Arrays;
import java.util.Collections;

public class Naerim {
    public static void main(String[] args) {

        String test = "abzcZddeFfg";
        // 한 글자씩 나눠서 char형식으로
        char[] arr = test.toCharArray();
       
        Arrays.sort(arr);
        // 처음엔 유니코드로 소문자 대문자 나누고 내림차순 정렬 후 합칠 생각이었으나
        // 생각해보니 오림차순 그대로 뒤집으면 원하는 결과가 나옴
        String answer = new StringBuilder(new String(arr)).reverse().toString();
        System.out.println(answer);
    }

}
