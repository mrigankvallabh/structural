package adapter;

public class EmployeeCsvToEmployeeAdapter implements Employee {
    private EmployeeCsv instance;

    public EmployeeCsvToEmployeeAdapter(EmployeeCsv instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return instance.toString();
    }

}
