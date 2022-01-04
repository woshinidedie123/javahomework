
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class Student {

	int id;
	String name;
	int age;
	String sex;
 
	public Student(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + "]";
	}
 
	public static void listToMap() {
		Student s1 = new Student(101, "张三", 20, "男");
		Student s2 = new Student(102, "李四", 23, "男");
		Student s3 = new Student(103, "韩梅", 21, "女");
		Student s4 = new Student(104, "赵亮", 24, "男");
		Student s5 = new Student(105, "亚芳", 19, "女");
		List<Student> ar = new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			hm.put(ar.get(i).id, ar.get(i));
		}
		System.out.println("====List转Map====");
		Set<Entry<Integer, Student>> en = hm.entrySet();
		for (Entry<Integer, Student> k : en) {
			System.out.println("key:" + k.getKey() + ",value" + k.getValue());
		}
 
	}
 
	public static void mapToList() {
		Student s1 = new Student(1, "张三", 20, "男");
		Student s2 = new Student(2, "李四", 23, "男");
		Student s3 = new Student(3, "韩梅", 21, "女");
		Student s4 = new Student(4, "赵亮", 24, "男");
		Student s5 = new Student(5, "亚芳", 19, "女");
		LinkedHashMap<Integer, Student> hm = new LinkedHashMap<Integer, Student>();
		hm.put(s1.id, s1);
		hm.put(s2.id, s2);
		hm.put(s3.id, s3);
		hm.put(s4.id, s4);
		hm.put(s5.id, s5);
		System.out.println(hm);
		System.out.println("====Map转List====");
		ArrayList<Student> students = new ArrayList<Student>();//Map的key必须是有规律的Int型才可以
		for (int i = 1; i <= hm.size(); i++) {
			students.add(hm.get( i));
		}
 
		for (Student student : students) {
			System.out.println(student);
		}
 
	}
 
	public static void main(String[] args) {
		listToMap();
		System.out.println("=====================================");
		mapToList();
	}
}
