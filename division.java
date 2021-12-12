import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
                
        int[] answer = {};
        int count = 0; // 나누어진 수 만큼 answer 초기화
        boolean flag = true; // -1 넣을까 말까 판단

        for (int i = 0; i < arr.length; i++) {

            // answer 초기화를 위해 사용 바로 값 넣고 싶지만 초기화 하지 않고는 ...
            if (arr[i] % divisor == 0) {
                count++;
            }

        }
        answer = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                answer[count] = arr[i];
                flag = false;
                count++;
            }

        }
        Arrays.sort(answer);
        if (flag) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        
        
        return answer;
    }
}
