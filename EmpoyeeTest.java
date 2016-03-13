package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.mzilikazi.Domain.Employee;
import za.ac.mzilikazi.Service.EmployeeInterface;

/**
 * Created by Asavela on 2016-03-13.
 */
public class EmpoyeeTest {

    Employee emp;
    private EmployeeInterface service;

    @Before
    public void setUp() throws Exception {
        emp = new Employee("Asavela", 14, "Developer");
        emp = new Employee("milisa", 14, "Tester");
        emp = new Employee("Mandisi", 14, "clerk");
        emp = new Employee("lina", 14, "cleaner");
        }



    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testEmployee() throws Exception {


        Assert.assertEquals("cleaner", emp.getEmployeeDepartment());
    }
}
