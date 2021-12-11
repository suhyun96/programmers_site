import java.util.Arrays;

public class dart {
    public static void main(String[] args) {

        String dartResult = "1D2S3T*";
        int answer = 0;
        int[] answer2 = new int[3];
        // 입력받은 수를 배열로 나눈다.
        // 각 자리마다 숫자인지 알파벳인지 특문인지에 따른 if
        // 1-10까지라면 그거 int로 변경해야함

        String[] array_dart = dartResult.split("");
        // int flag = 0;
        int[] num = new int[3];
        int count2 = 0;

        for (int i = 0; i < array_dart.length; i++) {
            char ch = dartResult.charAt(i);
            if (48 <= ch && ch <= 57) {
                // num[count2] = Character.getNumericValue(ch);

                if (Character.getNumericValue(ch) == 0) {
                    if (num[count2 - 1] == 1) {
                        num[count2 - 1] = 10;
                    } else {
                        num[count2] = Character.getNumericValue(ch);
                        count2++;
                    }
                }
                // else(num[count2] = Character.getNumericValue(ch))
                else {
                    num[count2] = Character.getNumericValue(ch);
                    count2++;
                }

            } else if (ch == 'S') {
                answer2[count2 - 1] = num[count2 - 1];
            } else if (ch == 'D') {
                answer2[count2 - 1] = num[count2 - 1] * num[count2 - 1];
            } else if (ch == 'T') {
                answer2[count2 - 1] = num[count2 - 1] * num[count2 - 1] * num[count2 - 1];
            } else if (ch == '*') {

                if (count2 == 0) {
                    answer2[count2 - 1] = 2 * answer2[count2 - 1];
                } else if (count2 == 1) {
                    answer2[0] = 2 * answer2[0];
                    answer2[1] = 2 * answer2[1];
                } else if (count2 == 2 || count2 == 3) {
                    answer2[0] = 2 * answer2[0];
                    answer2[1] = 2 * answer2[1];
                    answer2[2] = 2 * answer2[2];
                }

            } else if (ch == '#') {
                answer2[count2 - 1] = -answer2[count2 - 1];
            }

        }
        answer = Arrays.stream(answer2).sum();
        System.out.print(answer);

    }
}
