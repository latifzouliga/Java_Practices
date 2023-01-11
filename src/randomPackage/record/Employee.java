package randomPackage.record;

import java.util.ArrayList;

public class Employee {

    private final String name;
    private final int age;
    private final String employeeId;
    private ArrayList<Employee> employees;

    public Employee(String name, int age, String employeeId){
        if (Character.isDigit(name.charAt(0))){
            throw new RuntimeException("Invalid name. Name can not start with digit");
        }
        if (name == null){
            throw new NullPointerException("Name is not set");
        }
        if (name.isEmpty()){
            throw new RuntimeException("Name can not be empty");
        }
        if ( !(name.trim().length() == name.length()) ){
            throw new RuntimeException("Name can not start or end with a space");
        }
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
        employees = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    @Override
    public String toString(){
        return "|Name: " + name + ", Age: "+ age + ", Employee ID: " + employeeId +"|";
    }

    public boolean adda(Employee employee){
        return employees.add(employee);
    }

    public boolean addAlla(ArrayList<Employee> employees){
        return this.employees.addAll(employees);
    }

    public boolean removeEmployee(Employee employee){
        return employees.remove(employee);
    }


    /*
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
          throw new RuntimeException("Invalid object");
        }

        if ( !(this.name.equals( ((Employee)obj).name) )){
            if ( !(this.age == ( (Employee)obj).age) ){
                if ( !(this.employeeId.equals( ((Employee)obj).employeeId) )){
                    return false;
                }
            }
        }

        return true;

    }
    */  // same overridden equals methods but with different structure


    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            throw new RuntimeException("Invalid object: '"+ obj + "'\nThe Object must be Employee object");
        }
        Employee employee = (Employee)obj;  // down casting from Object reference type to employee reference type
        return name.equals(employee.name) &&
               employee.age == age &&
               employee.employeeId.equals(employeeId);

    }




}
