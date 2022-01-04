import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Books books1 = new Books(1001, "Java", 60.0, "zhangsan������");
        Books books2 = new Books(1002, "Python", 30.0, "lisan������");
        Books books3 = new Books(1003, "C", 50.0, "wangwu������");


        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);


        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);
        
        System.out.println("���\t����\t����\t������");
        for (HashMap<Integer, Books> h : booksList) {
            //��ȡkey
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //��ͨ��key��value
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }
	}

}

class Books {

    private int num;
    private String name;
    private double price;
    private String press;

    public Books() {

    }

    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }


}

