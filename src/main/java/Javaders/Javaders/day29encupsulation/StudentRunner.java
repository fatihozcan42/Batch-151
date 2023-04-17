package Javaders.Javaders.day29encupsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getStudentId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        System.out.println("-----------------------");

        s1.setStudentId("MU123456");

        s1.setNotOrt(4.99);

        s1.setSuccesful(true);

        System.out.println(s1.getStudentId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        System.out.println("-----------------------");


        s1.setStudentId("DH131756");

        s1.setNotOrt(4.50);

        s1.setSuccesful(true);

        System.out.println(s1.getStudentId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());





    }//main
}//Class
