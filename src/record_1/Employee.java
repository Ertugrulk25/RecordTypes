package record_1;
//mutable
public class Employee {// pojo ---- plain old java object
    //pasif ozelliklerini belirleriz
    private String firstName;

    private String lastName;

    private String email;

    //paramli cons

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //getter-setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "isim='" + firstName + '\'' +
                ", soyisim='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
