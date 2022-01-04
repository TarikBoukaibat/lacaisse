package com.application.Dao.Implementation;

public class ManagerDaoImpl {
  public static  void save(Employee employee){

        String query= "inset into employee ( Firstname, Lastname, Username, Gender,Salary,email, Role) values('"+employee.getFirstname()+"','"+employee.getLastname()+"','"+employee.getUsername()+"','"+employee.getEmail()+"','"+employee.getSalary()+"','"+employee.getGender()+"','"+employee.getRole()+"','"+employee.getPassword()+"')";
        DbOperations.SetData(query);
    }
  
}
