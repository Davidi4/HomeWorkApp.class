package lesson5;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Name = " + employee.name + " Post = " + employee.post + " Email = " + employee.email + " Number = " + employee.number + " Salary = " + employee.salary + " Age = " + employee.age);
        employee.name = "Ivanov Ivan Ivanovich";
        employee.post = "Manager";
        employee.email = " Ivan@mail.ru";
        employee.number = 1234567890;
        employee.salary = 30000;
        employee.age = 33;
        System.out.println("Name = " + employee.name + " Post = " + employee.post + " Email = " + employee.email + " Number = " + employee.number + " Salary = " + employee.salary + " Age = " + employee.age);

        Employee employee2 = new Employee();
        employee2.name = "IT Olga Nikolaevna";
        employee2.post = "Administrator";
        employee2.email = " Olgaga@mail.ru";
        employee2.number = 1324354657;
        employee2.salary = 50000;
        employee2.age = 40;
        System.out.println("Name = " + employee2.name + " Post = " + employee2.post + " Email = " + employee2.email + " Number = " + employee2.number + " Salary = " + employee2.salary + " Age = " + employee2.age);

        Employee employee3 = new Employee();
        employee3.name = "Dmitriev Sergey Mihailovich";
        employee3.post = "Director";
        employee3.email = " Sergey@mail.ru";
        employee3.number = 987654321;
        employee3.salary = 90000;
        employee3.age = 55;
        System.out.println("Name = " + employee3.name + " Post = " + employee3.post + " Email = " + employee3.email + " Number = " + employee3.number + " Salary = " + employee3.salary + " Age = " + employee3.age);

        Employee employee4 = new Employee();
        employee4.name = "Dron Andrey Alexandrovich";
        employee4.post = "Callmanager";
        employee4.email = "Andry@mail.ru";
        employee4.number = 1112111;
        employee4.salary = 44000;
        employee4.age = 23;
        System.out.println("Name = " + employee4.name + " Post = " + employee4.post + " Email = " + employee4.email + " Number = " + employee4.number + " Salary = " + employee4.salary + " Age = " + employee4.age);

        Employee employee5 = new Employee();
        employee5.name = "Car Alexey Alexandrovich";
        employee5.post = "Courier";
        employee5.email = "Alex@mail.ru";
        employee5.number = 88989898;
        employee5.salary = 40000;
        employee5.age = 32;
        System.out.println("Name = " + employee5.name + " Post = " + employee5.post + " Email = " + employee5.email + " Number = " + employee5.number + " Salary = " + employee5.salary + " Age = " + employee5.age);


    }

}
