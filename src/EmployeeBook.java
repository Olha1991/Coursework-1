public class EmployeeBook {

    Employees[] employees = {
        new Employees("Sarah", "Smith", 5, 6550),
        new Employees("Emily","King",2,6250),
        new Employees("Mark","Bennet",3,5685),
        new Employees("Lisa","Miller",3,5650),
        new Employees("Jason","Davis",5,6500),
        new Employees("Kevin","Brown",4,5800),
        new Employees("Betty","Ford",2,5600),
        new Employees("Gary","Peterson",1,6300),
        new Employees("Nicholas","Vargas",1,7900),
        new Employees("Donna","Kim",4,5850)
};

    public void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public Employees minSalary() {
        Employees minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public Employees maxSalary() {
        double maxSalary = 0;
        Employees maxSalaryEmployee = null;
        int x = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = maxSalary + employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                x = i;
                break;
            }
        }
        for (int i = x; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public double averageSalary() {
        if (employees.length != 0) {
            return sumSalary() / employees.length;
        } else {
            return 0;
        }
    }

    public void fullNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFirstName() + " " + employees[i].getLastName());
            }
        }
    }

    public void salaryIndex(int percent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
            System.out.println(employees[i].toString());
        }
    }

    public void findEmployeeInDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public Employees employeeWithMinSalaryDep(int department) {
        Employees employeeMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department
                    && employees[i].getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }

    public Employees employeeWithMaxSalaryDep(int department) {
        double maxSalary = 0;
        Employees maxSalaryEmployee = null;
        int x = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i] != null) {
                maxSalary = maxSalary + employees[i].getSalary();
                maxSalaryEmployee = employees[i];
                x = i;
                break;
            }
        }
        for (int i = x; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department && employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public double departmentExpenses(int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public double averageSalaryByDepartment(int department) {
        int sum = 0;
        double averageSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum++;
                departmentExpenses(department);
                averageSum = departmentExpenses(department) / sum;
            }
        }
        return averageSum;
    }

    public void salaryIndexByDepartment(int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
                System.out.println(employees[i].toString());
            }
        }
    }

    public void printEmployeesWithoutDepartment() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Employee: " + employees[i].getFirstName() +
                        " " + employees[i].getLastName() + " - $" + employees[i].getSalary());
            }
        }
    }

    public void searchEmployeesIfSalaryMoreNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= number) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public void searchEmployeesIfSalaryLessNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() <= number) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public Employees getEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new IllegalArgumentException("Employee not found");
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
        return true;
    }

    public boolean newEmployee(Employees employee) {
        for (int i = 0; i < employees.length; i++) {
            employees[i] = employee;
                System.out.println("New employee: " + employee.toString());
                return true;
            }
        return false;

    }
}