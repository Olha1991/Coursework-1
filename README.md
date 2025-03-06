# Coursework-1
# Personnel book
Assignment description:
Write a program that keeps track of employees and helps the HR and accounting departments automate processes.
With the help of the program, the accounting and HR departments will be able to find out the following information:
- Get a list of all employees;
- Calculate the amount of wage expenses;
- Find the employee with the minimum wage;
- Find the employee with the maximum wage;
- Calculate the average wage.

#### Basic Complexity
1. Create an Employee class that contains information about the employee's full name, department, and salary. For simplicity, the departments should be named from 1 to 5.
2. Add a static counter variable that will be responsible for the ID.
3. Add an ID field to the Employee class that is set from the counter, and then the counter increments its value.
4. Hide direct access to the Employee class fields and add the ability to get field values ​​(getters) and set the department and salary fields (setters).
5. Implement the equals and hashCode contracts in the Employee class.
6. By default, all fields should be passed through the constructor (except id) and populated in it (including id, which should be obtained from the counter).
7. Create a main method and an Employee[10] field inside the Main class that will act as a "storage" for employee records.
8. Let's create static methods that will interact with the array from point 7 and return the result:
- Get a list of all employees with all available data about them (output the values ​​of all fields (toString) to the console);
- Calculate the amount of salary expenses per month;
- Find the employee with the minimum salary;
- Find the employee with the maximum salary;
- Calculate the average salary (for this, you can use the method from point b);
- Output the full names of all employees (void method).

#### Advanced Complexity
Create additional static methods to solve the following problems.
1. Index the salary (call a change in the salary of all employees by the argument value in %)
2. Get the department number (1-5) as a parameter and find (6 methods in total):
- The employee with the minimum salary;
- The employee with the maximum salary;
- The sum of salary expenses by department;
- The average salary by department (note that the number of people in the department differs from employees.length);
- Index the salary of all employees in the department by the percentage that comes as a parameter;
- Display all employees of the department (all data except the department).
3. Get a number as a parameter and display:
- All employees with a salary less than the number (display id, full name and salary on the console);
- All employees with a salary greater than (or equal to) the number (display the id, full name and salary on the console).

#### Very difficult
We bring the project structure to OOP.
1. Create the EmployeeBook class;
2. Move the array with employees to the EmployeeBook class, close access to it from the outside (make it private);
3. Move all static methods for working with the array to this class and make them non-static;
4. Add methods for managing the internal array in EmployeeBook:
- Add a new employee. (the method must find a free cell in the array and place a new employee in it. The search for free cells occurs from the beginning of the array. If there are no free places for the employee, the method must return false, if there is a place for the employee, the method must return true);
- Delete the employee (find the employee by id, zero out his cell in the array).
5. Add a method for getting an employee by id;
6. Initialize in the main EmployeeBook method and check the correctness of the methods.
