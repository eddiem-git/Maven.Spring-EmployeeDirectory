package io.zipcoder;

import io.zipcoder.persistenceapp.modules.Department;
import io.zipcoder.persistenceapp.modules.Employee;
import org.junit.Assert;
import org.junit.Test;

public class TestDepartment {

    @Test
    public void setDepartmentNameTest() {
        Department department = new Department();

        department.setName("Apparel");

        Assert.assertEquals("Apparel", department.getName());
    }

    @Test
    public void setDepartmentManagerTest() {
        Department department = new Department();
        Employee manager = new Employee();

        department.setManager(manager);

        Assert.assertEquals(manager, department.getManager());
    }
}
