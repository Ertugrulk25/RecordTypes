package record_2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    List<Student> students = new ArrayList<>();




    //öğrencileri kaydetme
    public void save (Student student){
        this.students.add(student);


    }
    //tüm öğrencileri listeleme
   public void printAllStudent(){
       //System.out.println(this.students);
        //this.students.stream().forEach(System.out::println);

        for (Student std : this.students){
            System.out.println(std);


        }
   }
    //mevcut öğrenci silme
    public void delete (Student student){
        this.students.remove(student);


    }




}
