package student;

import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		int choice;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("*******************************************************");
			System.out.println("*                    1.����                            *");
			System.out.println("*                    2.����                            *");
			System.out.println("*                    3.ɾ��                            *");
			System.out.println("*                    4.�޸�                            *");
			System.out.println("*                    5.���                            *");  
			System.out.println("*                    6.�˳�                            *");
			System.out.println("*******************************************************\n");
		choice=sc.nextInt();
		if(choice==6)break;
		switch(choice){
			case 1:    StudentManager.Add(); break;//����ѧ����Ϣ
			case 2:    StudentManager.Query() ;break;//����ѧ����Ϣ
			case 3:    StudentManager.Delete();break;//ɾ��ѧ����Ϣ
			case 4:    StudentManager.Change();break;//�޸�ѧ����Ϣ
			case 5:    StudentManager.Show();break;//���ѧ����Ϣ
				}       
			}
		System.out.println("��л���Ա�ϵͳ��ʹ�ã���ӭ�´μ���ʹ��");
		}
	
}
