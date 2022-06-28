package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("johnd", "John", "Dean", "john.d@pie.net");
        employees.add(employeeFromDB);

        EmployeeLDAP employeeFromLDAP = new EmployeeLDAP("elizab", "Barnes", "Eliza", "barnes.eliza@oiler.net");
        employees.add(new EmployeeLDAPtoEmployeeAdapter(employeeFromLDAP));

        EmployeeCsv employeeFromCsv = new EmployeeCsv("29,Erika,Nunnez,nunnez.erika@epsilon.net");
        employees.add(new EmployeeCsvToEmployeeAdapter(employeeFromCsv));

        return employees;
    }
}
