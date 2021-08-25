import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    long phoneNo;
    public void setDetails(){
        String name;
        int rollNo;
        long phoneNo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of student");
        name=sc.nextLine();
        this.name=name;

        System.out.println("Enter roll no of student");
        rollNo=sc.nextInt();
        this.rollNo=rollNo;

        System.out.println("Enter phone no of student");
        phoneNo=sc.nextLong();
        this.phoneNo=phoneNo;
    }
    public void displayDetails(){
        System.out.println("Student's Name: "+name);
        System.out.println("Roll Number: "+ rollNo);
        System.out.println("Phone Number: "+ phoneNo);
    }
}
class Teacher extends Student{
    String nameOfTeacher;
    String areaOfTeaching;

    public void setDetails(){
        String nameOfTeacher;
        String areaOfTeaching;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name of teacher");
        nameOfTeacher=sc.nextLine();
        this.nameOfTeacher=nameOfTeacher;

        System.out.println("Enter area of teaching");
        areaOfTeaching=sc.nextLine();
        this.areaOfTeaching=areaOfTeaching;
    }

    public void displayDetails(){
        System.out.println("Teacher's Name: "+nameOfTeacher);
        System.out.println("Area of teaching: "+ areaOfTeaching);
    }

    class Science{
        int numberOfStudents;

        public void setDetails(){
            int numberOfStudents;

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter number of students in science");
            numberOfStudents=sc.nextInt();
            this.numberOfStudents=numberOfStudents;
        }

        public void displayDetails(){
            System.out.println("Number of students in science : "+numberOfStudents);
        }
    }

    class Arts{
        int numberOfStudents;

        public void setDetails(){
            int numberOfStudents;

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter number of students in arts");
            numberOfStudents=sc.nextInt();
            this.numberOfStudents=numberOfStudents;
        }

        public void displayDetails(){
            System.out.println("Number of students in arts : "+numberOfStudents);
        }
    }

    class Commerce{
        int numberOfStudents;

        public void setDetails(){
            int numberOfStudents;

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter number of students in commerce");
            numberOfStudents=sc.nextInt();
            this.numberOfStudents=numberOfStudents;
        }

        public void displayDetails(){
            System.out.println("Number of students in commerce : "+numberOfStudents);
        }
    }



}

class Staff extends Student{
    String nameOfStaff;
    String work;

    public void setDetails(){
        String nameOfStaff;
        String work;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name of staff");
        nameOfStaff=sc.nextLine();
        this.nameOfStaff=nameOfStaff;

        System.out.println("Enter work");
        work=sc.nextLine();
        this.work= work;
    }

    public void displayDetails(){
        System.out.println("Staff's Name: "+nameOfStaff);
        System.out.println("Work: "+ work);
    }

}

public class Solution1 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.setDetails();
        s1.displayDetails();
        System.out.println();

        Teacher t1=new Teacher();
        t1.setDetails();
        t1.displayDetails();
        System.out.println();

        Staff st1=new Staff();
        st1.setDetails();
        st1.displayDetails();
        System.out.println();

        Teacher.Science sc=t1.new Science();
        sc.setDetails();
        sc.displayDetails();
        System.out.println();

        Teacher.Arts at=t1.new Arts();
        at.setDetails();
        at.displayDetails();
        System.out.println();

        Teacher.Commerce co=t1.new Commerce();
        co.setDetails();
        co.displayDetails();
        System.out.println();
    }
}
