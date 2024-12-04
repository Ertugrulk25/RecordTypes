package record_2;

public class Runner {
    public static void main(String[] args) {


        Student student1 = new Student("Victor", "Hugo", "123456");
        Student student2 = new Student("Lev", "Tolsyoy", "1315554");

        StudentRepo repo = new StudentRepo();

        // bu öğrencileri database' gönderelim
        repo.save(student1);
        repo.save(student2);

        //tüm kayıtları listele
        repo.printAllStudent();

        //listedeki 1. indeksteki öğrencinin numarası yanlış girildiyse
        // değiştirmek istiyoruz...

        Student newStudent = new Student(repo.students.get(1).firstName(),
                repo.students.get(1).lastName(),"123123");

        repo.students.add(newStudent);
        //eski öğrenci silelim
        repo.delete(student2);

        //tüm öğrenciler
        repo.printAllStudent();




        

    }
}
