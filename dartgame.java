public class dart2 {
    public static void main(String[] args) {

        String dartResult = "1S*2T*3S";
        int answer = 0;
        int[] answer2 = new int[3];
        // 입력받은 수를 배열로 나눈다.
        // 각 자리마다 숫자인지 알파벳인지 특문인지에 따른 if

        String[] array_dart = dartResult.split("");
        // int[] num = new int[3];
        int count = 0;

        for (int i = 0; i < array_dart.length; i++) {
            char ch = dartResult.charAt(i);
            if (ch == 'S') {

            } else if (ch == 'D') {
                answer2[count - 1] = answer2[count - 1] * answer2[count - 1];
            } else if (ch == 'T') {
                answer2[count - 1] = answer2[count - 1] * answer2[count - 1] * answer2[count - 1];
            } else if (ch == '*') {
                if (count == 1) {
                    answer2[count - 1] = answer2[count - 1] * 2;

                } else if (count > 1) {
                    answer2[count - 2] = answer2[count - 2] * 2;
                    answer2[count - 1] = answer2[count - 1] * 2;

                }

            } else if (ch == '#') {
                answer2[count - 1] = -answer2[count - 1];

            } else {
                // 숫자 전용
                answer2[count] = Character.getNumericValue(ch);
                if (answer2[count] == 1) {
                    if (Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
                        answer2[count] = 10;
                        i++;
                    }
                }
                count++;
            }

        }
        for (int i = 0; i < 3; i++) {
            answer = answer + answer2[i];
        }
        System.out.print(answer);

    }
}
