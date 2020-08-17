package JavaAssignment1;

import java.util.Arrays;
import java.util.stream.Collectors;

class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}
public class EmployeeUse{
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];
        String[] names = {"Adarsh Raj","Aman Singh","Rajan Chettri","Sravan D","Mayank Kumar","Divya Sharma",
                "Manish Kesri","Raman Raj","Harsh Agarwal","Raja Ram"};
        String[] deg = {"CEO","CTO","CPO","CFO","EEE","MAE","DQE","Manager","FRP","FKT"};
        String[] loc = {"Mumbai","Chennai","Kolkata","Madras","Madrid","Madurai","Delhi","Hyderabad","Pune","Patna"};
        for(int i=0;i<10;i++){
            emp[i]=new Employee();
            emp[i].setEmpId(i+1);
            emp[i].setEmpName(names[i]);
            emp[i].setEmpDesignation(deg[i]);
            emp[i].setEmpSalary(20000+i*10000);
            emp[i].setEmpLocation(loc[i]);
        }
        //Print the name of all the employees.
        System.out.println(Arrays.stream(emp).map(u -> u.getEmpName()).collect(Collectors.toList()));

        //Print all the salaries which are greater than 50,000/-
        System.out.println(Arrays.stream(emp).filter(u -> u.getEmpSalary()>50000).map(x -> x.getEmpSalary()).collect(Collectors.toList()));

        //Print all the locations starting with the letter ‘M’
        System.out.println(Arrays.stream(emp).filter(u -> u.getEmpLocation().charAt(0)=='M')
                .map(x -> x.getEmpLocation()).collect(Collectors.toList()));

        //Print all the designations ending with ‘E’
        System.out.println(Arrays.stream(emp).filter(u -> u.getEmpDesignation().charAt(u.getEmpDesignation().length()-1)=='E')
                .map(x -> x.getEmpDesignation()).collect(Collectors.toList()));

    }
}
