package javawork1;

public class ѧ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate undergt=new Undergraduate ("����",20,"����","�����Ӧ��");
		  undergt.show();
		  Undergraduate undergt1=new Undergraduate ("����",21,"����","�������");
		  undergt1.show();
		  graduate spl =new graduate("����",22,"˶ʿ","��ѧ");
		  spl.show();

	}
}
	class Student{
		 String name;
		 int age;
		 String edu;
		 public Student(String name,int age,String edu ){
		  this.name =name;
		  this.age=age;
		  this.edu=edu;
		 }
		 void show(){
		  System.out.println("����"+name);
		  System.out.println("����"+age);
		  System.out.println("ѧλ"+edu);
		 }
		}
		class  Undergraduate extends Student {
		 String specialty;
		 Undergraduate(String name,int age,String edu,String specialty){
		  super (name,age,edu);
		  this.specialty=specialty;
		 }
		 public void show(){
		  super.show();
		  System.out.println("רҵ"+specialty);
		  }
		 }
		class graduate extends Student {
		 String direction;
		  graduate(String name, int age, String edu,String direction) {
		  super(name, age, edu);  
		  this.direction=direction;
		
		 }
		  public void show (){
		  super.show();
		  System.out.println("�о�����"+direction);
		  }
		 
		 
}
