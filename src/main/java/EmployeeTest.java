import models.Employee;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee fer = new Employee();
        fer.setFirstName("Fernando");
        fer.setLastName("Mendoza");
        fer.setGender('m');
        fer.setEmpNo(1L);
        fer.setBirthDate(new Date());
        fer.setHireDate(new Date());


        System.out.println(" fullName = " + fer.getFirstName() + " " + fer.getLastName()) ;
    }

}

