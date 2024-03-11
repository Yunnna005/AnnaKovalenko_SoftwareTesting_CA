import org.junit.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee employee = new Employee("Anna Kovalenko", 19, 4);

    //Test Constructor
    @Test
    public void test_EmployeeConstructor(){
        assertNotNull(employee);
    }

    //Test Name
    @Test
    public void test_GetName(){
        assertEquals("Anna Kovalenko", employee.getName());
    }

    //Test Age
    @Test
    public void test_GetAge(){
        assertEquals(19, employee.getAge());
    }

    //Test Experience
    @Test
    public void test_GetExperience(){
        assertEquals(4, employee.getExperience());
    }

    //Test T1
    @Test
    public void test_Employee_Valid(){
        assertEquals("Anna Kovalenko", employee.getName());
        assertEquals(19, employee.getAge());
        assertEquals(4, employee.getExperience());
    }

    // Test T2
    @Test
    public void test_GetName_Invalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            Employee e1 = new Employee("", 30, 5);
        });
    }

    //Test T3
    @Test
    public void test_GetAge_Invalid(){
        assertThrows(IllegalArgumentException.class, ()->{
            Employee e2 = new Employee("Anna Kovalenko", 15, 4);
        });
    }

    //Test T5
    @Test
    public void test_GetExperience_Invalid(){
        Employee e3 = new Employee("Anna Kovalenko", 25, 2);
        assertEquals(2, e3.getExperience());
    }
    //Test T7
    @Test
    public void test_GetAge_getExperience_Invalid(){
        assertThrows(IllegalArgumentException.class, ()->{
            Employee e4 = new Employee("Anna Kovalenko", 64, 1);
            assertEquals(1, e4.getExperience());
        });
    }

    //Test T9
    @Test
    public void test_GetSelary_Less40_Less6(){
        assertEquals(30400.00, employee.getSalary());
    }

    //Test T10
    @Test
    public void test_GetSelary_Less40_More6(){
        Employee e5 = new Employee("Anna Kovalenko", 30, 9);
        assertEquals(31900.00, e5.getSalary());
    }

    //Test T11
    @Test
    public void test_GetSelary_More40_Less6(){
        Employee e6= new Employee("Anna Kovalenko", 45, 5);
        assertEquals(33750.00, e6.getSalary());
    }

    //Test T12
    @Test
    public void test_GetSelary_More40_More6(){
        Employee e7 = new Employee("Anna Kovalenko", 62, 10);
        assertEquals(35500.00, e7.getSalary());
    }

    // Test setAge method with age 55
    @Test
    public void test_SetAge() {
        employee.setAge(55);
        assertEquals(55, employee.getAge());
    }

}