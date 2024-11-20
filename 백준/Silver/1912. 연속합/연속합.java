import java.util.*;

public class Main {
    static int[] arr;
    static int[] answer;
    static int max;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n];
        answer = new int[n];


        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sc.next());    
        }
        max = arr[0];

        for(int i=0;i<n;i++) {
            if(i == 0 || arr[i] > answer[i-1] + arr[i]) {
                answer[i] = arr[i];
            }else if(i == 1) {
                answer[i] = arr[i-1] + arr[i];
            }else if(arr[i-1] + arr[i] > answer[i-1]+arr[i]) {
                answer[i] = arr[i-1] + arr[i];
            }else {
                answer[i] = answer[i-1] + arr[i];
                
            }
            max = Math.max(max, answer[i]);
        }
        System.out.println(max);

    }
}
