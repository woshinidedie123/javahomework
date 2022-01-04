package p11;
import java.util.Arrays;
import java.util.Scanner;
public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        int []a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = n-1;i>=0;i--){
            if (V>=a[i]){
                V -= a[i];
            }
        }
        System.out.println(V);
	}

}
