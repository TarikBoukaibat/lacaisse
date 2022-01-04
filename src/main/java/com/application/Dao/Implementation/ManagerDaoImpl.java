package com.application.Dao.Implementation;

public class ManagerDaoImpl {
  public static  void saveEmp(Employee employee){

        String query= "insert into employee ( Firstname, Lastname, Username, Gender,Salary,email, Role,Password) values('"+employee.getFirstname()+"','"+employee.getLastname()+"','"+employee.getUsername()+"','"+employee.getEmail()+"','"+employee.getSalary()+"','"+employee.getGender()+"','"+employee.getRole()+"','"+employee.getPassword()+"')";
        DbOperations.SetData(query);
    }
  
}
