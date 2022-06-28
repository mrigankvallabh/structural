package adapter;

public class EmployeeLDAPtoEmployeeAdapter implements Employee {
    private EmployeeLDAP instance;

    public EmployeeLDAPtoEmployeeAdapter(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return instance.toString();
    }
}
