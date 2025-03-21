
public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        System.out.println("Amount of salary expenses per month - $" + employeeBook.sumSalary());
        System.out.println("Employee with the minimum salary - $" + employeeBook.minSalary());
        System.out.println("Employee with the maximum salary - $" + employeeBook.maxSalary());
        System.out.println("Average salary - $" + employeeBook.averageSalary());
        employeeBook.fullNameEmployees();

        employeeBook.salaryIndex(10);
        employeeBook.findEmployeeInDepartment(2);
        System.out.println("Employee with the minimum salary in department: " + employeeBook.employeeWithMinSalaryDep(5));
        System.out.println("Employee with the maximum salary in department: " + employeeBook.employeeWithMaxSalaryDep(5));
        System.out.println("The department's expenses are $" + employeeBook.departmentExpenses(2));
        System.out.println("Average salary in department - $" + employeeBook.averageSalaryByDepartment(5));
        employeeBook.salaryIndexByDepartment(2,10);
        employeeBook.printEmployeesWithoutDepartment();
        employeeBook.searchEmployeesIfSalaryMoreNumber(6500);
        System.out.println();
        employeeBook.searchEmployeesIfSalaryLessNumber(6500);
        System.out.println();
        System.out.println(employeeBook.getEmployee(0));
        System.out.println(employeeBook.deleteEmployee(0));
        Employees employee = new Employees("Megan", "Smith", 5, 6550);
        employeeBook.newEmployee(employee);
        employeeBook.printAllEmployees();
    }
}