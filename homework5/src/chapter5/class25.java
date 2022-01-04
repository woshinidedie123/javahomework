package chapter5;

public class class25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double formula = 0;
        for( int i = 10000; i <= 100000 ; i += 10000 ){
            formula = 0;
            for ( int n = 1 ; n <= i / 2; n++ ){
                formula += 1.0 / ( ( 4 * n - 3 ) * ( 4 * n - 1) );
            }
            formula = 8 * formula ;
            System.out.printf("当i=%d时，结果为%f\n", i, formula);
        }
	}

}
