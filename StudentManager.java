package student;

import java.util.Scanner;

public class StudentManager {
	static Student[] Stu=new Student[20];//����ѧ�����飬����Ϊ100
	  static  int number=0;
	  static Scanner scanner=new Scanner(System.in);


public static void add(){//���ѧ����Ϣ
while(true){
System.out.println("���������������ѧ����Ϣ��ֹͣ�������6");
if(scanner.nextInt()==6)break;
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
paixu();
System.out.println("��ӳɹ�");
}
}


public static void show(){//չʾѧ����Ϣ
    System.out.println("*******************************************");
    System.out.println(" ѧ��             ����                          �Ա�              ��������             ");
    paixu();
    for(int i=0;i<number;i++)
   System.out.println(Stu[i].getID()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getAge()+"\t");
    System.out.println("*******************************************");
System.out.println();
}

public static void paixu(){//��ѧ����Ϣ��������
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


public static void change(){//�ı�ѧ����Ϣ
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
paixu();
}

public static void query(){//��ѯ
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
    paixu();
}


public static void delete(){//ɾ��ѧ����Ϣ
System.out.println("������Ҫɾ����Ϣ��ѧ������");
String Stunumber=scanner.next();
int i;
    for( i=0;i<number;i++)
    if(Stunumber.equals(Stu[i].getName()))break; 
for(;i<number-1;i++)
    Stu[i]=Stu[i+1];
     number--;
System.out.println("ɾ�����");
paixu();
}

}
