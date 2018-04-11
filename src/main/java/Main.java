public class Main {
    public static void main(String[] args) {

        Book fiveNights = new Book("Five Nights at Freddy's: The Silver Eyes", new Author("Scott Cawthon", "Scott9083@gmail.com", 'M'), 7.99,3 );

        System.out.println(fiveNights.getName() + " is by " + fiveNights.getAuthor().getName());
        System.out.println(fiveNights.getName());
        System.out.println(fiveNights.getAuthor().getName());
        fiveNights.Invoicefrom();
        System.out.println(fiveNights.getAuthor().createBookEmail());
    }
}

