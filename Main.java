package student;

import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		int choice;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("*******************************************************");
			System.out.println("*                    1.插入                            *");
			System.out.println("*                    2.查找                            *");
			System.out.println("*                    3.删除                            *");
			System.out.println("*                    4.修改                            *");
			System.out.println("*                    5.输出                            *");  
			System.out.println("*                    6.退出                            *");
			System.out.println("*******************************************************\n");
		choice=sc.nextInt();
		if(choice==6)break;
		switch(choice){
			case 1:    StudentManager.Add(); break;//插入学生信息
			case 2:    StudentManager.Query() ;break;//查找学生信息
			case 3:    StudentManager.Delete();break;//删除学生信息
			case 4:    StudentManager.Change();break;//修改学生信息
			case 5:    StudentManager.Show();break;//输出学生信息
				}       
			}
		System.out.println("感谢您对本系统的使用，欢迎下次继续使用");
		}
	
}
