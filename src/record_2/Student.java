package record_2;

public record Student (String firstName, String lastName,String studentNumber){

//    public void setStudentNumber(String studentNumber){
//
//        this.studentNumber = studentNumber;
//
//    }
    //Not record: ready only
    public void printStudentNumber(){

        System.out.println(this.studentNumber);


    }


}
