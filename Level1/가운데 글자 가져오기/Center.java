public class Center {
    public static void main(String[] args) {
        String s = "asfdd";
        int center = 0 ;
        String answer = "";

        if(s.length()%2==0){
            center = s.length()/2;
            
            answer=s.substring(center-1, center+1);
            System.out.println(answer);
            //return answer;
        }
        else {
            center=s.length()/2;
            answer=s.substring(center, center+1);
            System.out.println(answer);
            //retrun answer;
        }

        
    }
}
