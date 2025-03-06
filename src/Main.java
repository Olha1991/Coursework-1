public class Main {

    static Employees[] employee = new Employees [10];

    public static void main(String[] args) {
        employee[0] = new Employees ("Sarah", "Smith",5,6550);
        employee[1] = new Employees ("Emily", "King",2,6250);
        employee[2] = new Employees ("Mark", "Bennet",3,5685);
        employee[3] = new Employees ("Lisa", "Miller",1,5650);
        employee[4] = new Employees ("Jason", "Davis",5,6500);
        employee[5] = new Employees ("Kevin", "Brown",4,5800);
        employee[6] = new Employees ("Betty", "Ford",2,5600);
        employee[7] = new Employees ("Gary", "Peterson",3,6300);
        employee[8] = new Employees ("Nicholas", "Vargas",1,7900);
        employee[9] = new Employees ("Donna", "Kim",4,5850);
        printAllEmployees();
        System.out.println("Amount of salary expenses per month - " + sumSalary() + " dollars.");
        System.out.println("Employee with the minimum salary - " + minSalary() + " dollars.");
        System.out.println("Employee with the maximum salary - " + maxSalary() + " dollars.");
        System.out.println("Average salary - " + averageSalary() + " dollars.");
        fullNameEmployees();
    }

    public static double sumSalary (){
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public static Employees minSalary (){
        Employees minSalaryEmployee = employee[0];
        for(int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employees maxSalary (){
        double maxSalary = 0;
        Employees maxSalaryEmployee = null;
        int x = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null){
                maxSalary = maxSalary + employee[i].getSalary();
                maxSalaryEmployee = employee[i];
                x = i;
                break;
            }
        }
        for (int i = x; i < employee.length; i++) {
            if (employee[i] != null){
                if (employee[i].getSalary() > maxSalary){
                    maxSalary = employee[i].getSalary();
                    maxSalaryEmployee = employee[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double averageSalary (){
        if (employee.length != 0){
            return sumSalary() / employee.length;
        }else {
            return 0;
        }
    }

    public static void printAllEmployees (){
        for (int i = 0; i < employee.length; i++){
            if (employee [i] != null){
                System.out.println(employee[i].toString());
            }
        }
    }

    public static void fullNameEmployees (){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null){
                System.out.println(employee[i].getFirstName() + " " + employee[i].getLastName());
            }
        }
    }
}