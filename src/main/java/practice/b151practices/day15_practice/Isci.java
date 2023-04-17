package practice.b151practices.day15_practice;

public class Isci extends Muhasebe{

    protected String isciStatu = "Surekli Isci";

    protected void mesai (){
        System.out.println("Isciler gunluk 8  saat ve haftada 5 gun calisir");
    }

    // Bu class'tanda obje olusturabiliriz. Bu Class'in child class'larinin olmasi obje olusturmaya engel degi.
    // fakat isciler icin surekli isci ve ustabasi olmaktan baska ihtimal olmadigi icin isci class'indan isci uretmeye gerek yok



}//class
