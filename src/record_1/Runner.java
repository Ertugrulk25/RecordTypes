package record_1;

public class Runner {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Ali", "Can", "alican@gmail.com");
        System.out.println(employee1);//to string sayesinde degerimi cagirdigimda sonuclar bana yazdılırdı :)

        //emaili degistirmek istersem
        employee1.setEmail("alican123@gmail.com");
        System.out.println("Degisiklik sonrasi mail : "+employee1.getEmail());

        //bazı durumlarda bir kere değerleri belirlendikten sonra
        //fieldlarimin degismemesini isterim
        String str="123";

        System.out.println("--------------------Immutable---------------------");
        ImmutableEmployee employee2=new ImmutableEmployee("Veli","Han","velihan@gmail.com");
        System.out.println(employee2);

        //emaili degistirmek istersem
        //employee2.setEmail("......");

        System.out.println(employee2.getFirstName());

        ImmutableEmployee employee3=new ImmutableEmployee("Veli","Han","velihan@gmail.com");

        System.out.println(employee3.getFirstName());

        System.out.println("Double equal ile : "+(employee2==employee3));//false
        System.out.println("Equals methodu ile : "+employee2.equals(employee3));//true
        System.out.println(employee2.hashCode());//object class

        //peki boiler plate(basma kalıp ) kodları kullanmadan
        //immutable class oluşturalım

        //Cevap Java 14 ile gelen record type özelliğini kullanırız.

        System.out.println("----------Record--------------");

        EmployeeRecord employeeRecord1 = new EmployeeRecord("Yuşa","Siyah","yusasiyah@gmail.com");
        System.out.println("Record Employee: " + employeeRecord1);


        EmployeeRecord employee5 = new EmployeeRecord("Yuşa","Siyah","yusasiyah@gmail.com");
        System.out.println("==: "+ employeeRecord1.equals(employee5));

    }


}




