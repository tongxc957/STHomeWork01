package student;

import java.util.Scanner;

public class StudentManager {
	
	static Student[] Stu=new Student[20];//����ѧ�����飬����Ϊ20
	static  int number=0;
	static Scanner scanner=new Scanner(System.in);


	public static void Add(){//���ѧ����Ϣ public static void add()
		while(true){
			
			System.out.println("���������������ѧ����Ϣ��ֹͣ�������0");
			if(scanner.nextInt()==0)break;
			Stu[number]=new Student();
			System.out.println("�������ѧ����ѧ��\n");
			Stu[number].setID(scanner.next());
			System.out.println("�������ѧ��������\n");
			Stu[number].setName(scanner.next());
			System.out.println("�������ѧ�����Ա�\n");
			Stu[number].setGender(scanner.next());
			System.out.println("�������ѧ���ĳ�������\n");
			Stu[number].setAge(scanner.next());
			number++;
			Sort();
		System.out.println("��ӳɹ�");
		
		}
	}
	
	
	public static void Show(){//չʾѧ����Ϣ public static void show()
		
	    System.out.println("*******************************************");
	    System.out.println(" ѧ��             ����                          �Ա�              ��������             ");
	    Sort();
	    for(int i=0;i<number;i++)
	    	System.out.println(Stu[i].getID()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getAge()+"\t");
	    System.out.println("*******************************************");
	    System.out.println();
	    
	}
	
	public static void Sort(){//��ѧ����Ϣ�������� public static void paixu()
		
	    int j;
	    Student temp=new Student();
	    for(int i=0;i<number;i++)
	    {
	        for(j=i+1;j<number;j++) {
	        int m=Integer.parseInt(Stu[j].getID());
	        int n=Integer.parseInt(Stu[i].getID());
	        if(m>n)
	        {temp=Stu[i];Stu[i]=Stu[j];Stu[j]=temp;}
	    }
	        
	    }
	}
	
	
	public static void Change(){//�ı�ѧ����Ϣpublic static void change()
		
	System.out.println("������Ҫ�޸���Ϣ��ѧ������");
	String Stunumber=scanner.next();
	for(int i=0;i<number;i++)
	{
	    if(Stunumber.equals(Stu[i].getName()))
	    {System.out.println("������Ҫ�޸ĵ�ѧ������Ϣ,ѧ�ţ��������Ա𣬳�������");
	     Stu[i].setID(scanner.next());
	        Stu[i].setName(scanner.next());
	        Stu[i].setGender(scanner.next());
	        Stu[i].setAge( scanner.next());
	      
	        break;
	    }
	}
	Sort();
	
	}
	
	public static void Query(){//��ѯpublic static void query()
	  System.out.println("������Ҫ��ѯ��ѧ��");
	   String Stunumber=scanner.next();
	   int i;
	    for(i=0;i<number;i++)
	    {
	        if(Stunumber.equals(Stu[i].getName())){
	            System.out.println("*******************************************");
	            System.out.println(" ѧ��             ����                          �Ա�              ��������             ");
	            System.out.println(Stu[i].getID()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getAge());
	            System.out.println("*******************************************");
	        }
	 
	    }
	    Sort();
	}
	
	
	public static void Delete(){//ɾ��ѧ����Ϣ	public static void delete()
	System.out.println("������Ҫɾ����Ϣ��ѧ������");
	String Stunumber=scanner.next();
	int i;
	    for( i=0;i<number;i++)
	    if(Stunumber.equals(Stu[i].getName()))break; 
	for(;i<number-1;i++)
	    Stu[i]=Stu[i+1];
	     number--;
	System.out.println("ɾ�����");
	Sort();
	}

}
