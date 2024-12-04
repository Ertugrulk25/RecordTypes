package record_1;

import java.util.Objects;

/*
Bazı durumlarda thread güvenliği(thread-safe), cachede veri tutarlılığı,
test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.

Dataları saklamak veya dataları transfer(DTO) etmek için
kullanılan ilkel classlar immutable olarak tanımlanabilir.
 */
public class ImmutableEmployee {


    private String firstName;

    private String lastName;

    private String email;

    //paramli cons


    public ImmutableEmployee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //setter methodu kullanmıyorum!!!!
    //sadece getter okuma işlemi yapıyorum


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //toString sadece yazdırma işlemi yapar

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;//employee2.equals(employee2);

        if (obj==null||obj.getClass()!=this.getClass())return false;
        //employee2.equals(null)
        //employee2.equals(employee1);

        ImmutableEmployee emp=(ImmutableEmployee)obj;

        return Objects.equals(emp.email,this.email)&&
                Objects.equals(emp.firstName,this.firstName)&&
                Objects.equals(emp.lastName,this.lastName);
        //employee2.equals(employee3)
    }
// objeler için benzersiz kodlar üretmek için
    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,email);

    }
}



