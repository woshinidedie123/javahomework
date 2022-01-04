package chapter5;

public class class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int lines = 8;


        for(int n = 1;n <= lines;n++){

            for(int a = n; a < lines; a++)
                System.out.print("    ");

            for(int b = 0; b <= n - 1;b++){
                int num = (int) Math.pow(2, b);

                if(num / 100 > 0)
                    System.out.printf("%d ", num);
                else if (num % 100 / 10 > 0)
                    System.out.printf(" %d ", num);
                else
                    System.out.printf("  %d ", num);
            }

            if(n != 1){
                for(int c = n - 2; c >= 0;c--){
                    int num = (int) Math.pow(2, c);

                    if (num / 10 > 0)
                        System.out.printf(" %d ", num);
                    else
                        System.out.printf("  %d ", num);
                }
            }

            System.out.println();
        }
	}

}
