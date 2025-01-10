package Prototype;

public class Employee implements Prototype{

    private int empId;
    public Employee(int empId){
        this.empId = empId;
    }
    @Override
    public Prototype getClone() {
        // TODO Auto-generated method stub
        return new Employee(empId);
    }
}
