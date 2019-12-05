import java.util.Scanner;

class HW6_3{
	public static void main(String [] args){
		String name;
		int age;
		double grade;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		name = s.nextLine();
		System.out.print("����: ");
		age = s.nextInt();
		System.out.print("����: ");
		grade = s.nextDouble();
		
		//�ֿܼ��� �Է¹��� ������ �л� ��ü ����
		Student st = new Student(name, age, grade);
		
		st.setGrade(4.3);//������ 4.3���� �� ����
		System.out.println("�̸�: "+st.getName());
		System.out.println("����: "+st.getGrade());
	}
}

class Student{
	private String name;
	private int age;
	private double grade;
	
	public Student(){//����Ʈ �����ڴ� �̿� ���� �ƹ� �ϵ� ���� �ʾƵ� ����. 	
	}
	
	public Student(String s, int i, double d){
		setName(s);//�����ڿ��� setter ȣ�� ����. 
		setAge(i);
		setGrade(d);
	}
	
	void setName(String s){
		name = s;
	}
	void setAge(int i){
		if(i<0||i>=200) age = 20; 
		else age = i;
	}
	void setGrade(double d){
		if(grade<0||grade>4.3) grade = 3.0;
		else grade = d;
	}
	
	
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	double getGrade(){
		return grade;
	}
	
}