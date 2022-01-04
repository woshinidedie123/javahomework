package chapter5;

import java.util.Scanner;

public class class22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Annual Interest Rate（7%-->7）: ");
        double interestRate = input.nextDouble();

        // 计算月支付额、总支付额
        double monthlyPayment = (amount * interestRate / 1200) / (1 - 1 / Math.pow(1 + interestRate / 1200, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        // 输出表头
        System.out.println("Payment# Interest\t\tPrincipal\t\ttBalance");

        // for循环
        double interest = 0.0, principal = 0.0;
        for(int i = 1;i <= years * 12;i++){
            interest = interestRate / 1200 * amount;
            principal = monthlyPayment - interest;
            amount -= principal;
            if(i == years * 12)
                principal += amount;
            System.out.print(i + "\t\t ");
            System.out.printf("%5.2f\t\t%6.2f\t\t%7.2f\n", interest, principal, amount);
        }
	}

}
