package student;

public class Student {
    private String ID;//学号
    private String name;//姓名
    private String gender;//性别
    private	String birth;//出生日期
 
    public Student() {
        super();
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return birth;
    }
    public void setAge(String age) {
        this.birth = age;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
}
