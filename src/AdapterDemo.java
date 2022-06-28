import adapter.EmployeeClient;

public class AdapterDemo {
    public static void main(String[] args) throws Exception {
        EmployeeClient client = new EmployeeClient();
        System.out.println(client.getEmployeeList());
    }
}
