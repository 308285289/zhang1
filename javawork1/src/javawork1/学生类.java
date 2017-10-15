package javawork1;

public class 学生类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate undergt=new Undergraduate ("张三",20,"本科","计算机应用");
		  undergt.show();
		  Undergraduate undergt1=new Undergraduate ("李四",21,"本科","软件工程");
		  undergt1.show();
		  graduate spl =new graduate("王五",22,"硕士","法学");
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
		  System.out.println("姓名"+name);
		  System.out.println("年龄"+age);
		  System.out.println("学位"+edu);
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
		  System.out.println("专业"+specialty);
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
		  System.out.println("研究方向"+direction);
		  }
		 
		 
}
