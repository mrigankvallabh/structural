package adapter;


public class EmployeeCsv {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    
    public EmployeeCsv(int id, String firstName, String lastName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public EmployeeCsv(String csvText) {
        String[] parts = csvText.split(",");
        if(parts.length < 4) {
            throw new IllegalArgumentException(
                "Illegal csv received. Expected 4 comma separated tokens. Received " + parts.length + " tokens in <" + csvText + ">"
            );
        }

        this.id = Integer.parseInt(parts[0]);
        this.firstName = parts[1];
        this.lastName = parts[2];
        this.emailAddress = parts[3];
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "EmployeeCsv [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + "]";
    }

}
