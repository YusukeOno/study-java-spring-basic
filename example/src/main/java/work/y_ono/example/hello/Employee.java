package work.y_ono.example.hello;

import lombok.Data;

@Data
public class Employee {
    private String employeeId;
    private String employeeName;
    private int employeeAge;
    public String getEmployeeId() {
        return employeeId;
    }
    public int getEmployeeAge() {
        return employeeAge;
    }
    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
