package student;

import java.util.Scanner;

public class StudentManager {
	static Student[] Stu=new Student[20];//定义学生数组，容量为20
	  static  int number=0;
	  static Scanner scanner=new Scanner(System.in);


public static void add(){//添加学生信息
while(true){
System.out.println("点击任意键继续添加学生信息，停止添加输入6");
if(scanner.nextInt()==6)break;
Stu[number]=new Student();
System.out.println("请输入该学生的学号\n");
Stu[number].setID(scanner.next());
System.out.println("请输入该学生的姓名\n");
Stu[number].setName(scanner.next());
System.out.println("请输入该学生的性别\n");
Stu[number].setGender(scanner.next());
System.out.println("请输入该学生的出生日期\n");
Stu[number].setAge(scanner.next());
number++;
paixu();
System.out.println("添加成功");
}
}


public static void show(){//展示学生信息
    System.out.println("*******************************************");
    System.out.println(" 学号             姓名                          性别              出生日期             ");
    paixu();
    for(int i=0;i<number;i++)
   System.out.println(Stu[i].getID()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getAge()+"\t");
    System.out.println("*******************************************");
System.out.println();
}

public static void paixu(){//对学生信息进行排序
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


public static void change(){//改变学生信息
System.out.println("请输入要修改信息的学生姓名");
String Stunumber=scanner.next();
for(int i=0;i<number;i++)
{
    if(Stunumber.equals(Stu[i].getName()))
    {System.out.println("请输入要修改的学生的信息,学号，姓名，性别，出生日期");
     Stu[i].setID(scanner.next());
        Stu[i].setName(scanner.next());
        Stu[i].setGender(scanner.next());
        Stu[i].setAge( scanner.next());
      
        break;
    }
}
paixu();
}

public static void query(){//查询
  System.out.println("请输入要查询的学生");
   String Stunumber=scanner.next();
   int i;
    for(i=0;i<number;i++)
    {
        if(Stunumber.equals(Stu[i].getName())){
            System.out.println("*******************************************");
            System.out.println(" 学号             姓名                          性别              出生日期             ");
            System.out.println(Stu[i].getID()+"\t"+Stu[i].getName()+"\t"+"\t"+Stu[i].getGender()+"\t"+Stu[i].getAge());
            System.out.println("*******************************************");
        }
 
    }
    paixu();
}


public static void delete(){//删除学生信息
System.out.println("请输入要删除信息的学生姓名");
String Stunumber=scanner.next();
int i;
    for( i=0;i<number;i++)
    if(Stunumber.equals(Stu[i].getName()))break; 
for(;i<number-1;i++)
    Stu[i]=Stu[i+1];
     number--;
System.out.println("删除完成");
paixu();
}

}
