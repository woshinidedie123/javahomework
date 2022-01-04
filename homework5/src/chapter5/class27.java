package chapter5;

public class class27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bool = false;
        int count = 0;

        for (int year = 101; year <= 2100; year++) {
            bool = false;
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                bool = true;
                count++;
                System.out.print(year + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print("\nÈòÄêÊýÄ¿:" + count);
	}

}
