package step4.practice_30;

class Student{
    private String name;
    private int grade;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }


}

public class Main {
    public static void main(String[] args){

        Student student = new Student("이재웅", 3);

        System.out.println("이름: " + student.getName());
        System.out.println("학년: " + student.getGrade());

    }

}
