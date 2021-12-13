// 프로그래머스 나누어 떨어지는 숫자 배열 문제
function solution(arr, divisor) {
    let count =0;
    var answer = [];
    for (let i = 0; i < arr.length; i++){
    if (arr[i] % divisor== 0) { 
        answer[count]=arr[i];
        count++;
    }
}
if (answer.length == 0) { 
    answer[0] = -1;
    
}
// 오름차순 정리 그냥 sort()하면 1이랑 10이랑 엉켜서 앞뒤차이로 작은 수 큰 수 구분해서 정렬 
answer.sort((a,b)=>a-b);
    return answer;
}

// 그냥 저렇게 쓰는 게 아니라 filter를 써서 간단하게 푼 예시도 있다.
//function solution(arr, divisor) {
//    var answer = arr.filter(v => v%divisor == 0); filter로 나누어 지는 거만 answer에 담고 
//    return answer.length == 0 ? [-1] : answer.sort((a,b) => a-b);  answer 길이 대해서 0이면 -1 그리고 그외 오름차순 정렬 

//}
