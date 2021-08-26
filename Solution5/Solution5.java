class Employee{
    public void showPosition(){
        System.out.println("Mr. Vikash is an Employee...");
    }
}

class Manager extends Employee{
    @Override
    public void showPosition(){
        System.out.println("Mr. Satish is the manager...");
    }

    // Overloading
    public void showPosition(int a){
        System.out.println("Mr. satish is manager of "+ a + " employees");
    }
}

public class Solution5 {
    public static void main(String[] args){
        Employee e=new Employee();
        e.showPosition();
        System.out.println();

        Manager m=new Manager();
        m.showPosition();
        m.showPosition(25);
    }
}
