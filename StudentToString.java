public class StudentToString {
    String name;
    int age;

    public  StudentToString(String name,int age){
        this.name=name;
        this.age=age;
    }


    @Override
    public String toString() {
        return "Student Details:{name:"+name+
                ",age:"+age+"}";

    }
}

     public void main(String[] args) {
        StudentToString studentName=new StudentToString("Nikhil",18);
        System.out.println(studentName);

    }

