package day30_practices.bookTask;




public class TestBookObjects {

    public static void main(String[] args) {

        EBook eBook = new EBook("Alf layal wa layla","Fantacy","Unknown",30,"large",1500);

        AudioBook audioBook = new AudioBook("Rich dad poor dad","Economy","Mike",45,100,"lucy");

        System.out.println(eBook);
        System.out.println(audioBook);
        eBook.readBook();




    }


}
