package week3;

public class p87389_java_minsu {
    public static void main(String[] args) {
        
        //문제설명
        // 자연수 n이 매개변수로 주어집니다. 
        // n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
        // 답이 항상 존재함은 증명될 수 있습니다.

        int n = 10;

        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        // return answer;
    }
}
