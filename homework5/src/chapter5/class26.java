package chapter5;

public class class26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double e = 1.0, item = 1.0;
        for (int n = 10000; n <= 100000; n += 10000){
            item = 1;
            for ( int i = 1; i <= n ; i++){
                item /= i;
                e += item;
            }
            System.out.println("当n值为" + n +"时，和为" + e);
        }
	}

}
