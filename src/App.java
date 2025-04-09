public class App {
    public static void main(String[] args) {
        Author clayson = new Author("George", "Clayson");
        Book richestManInBabylon = new Book("The richest man in Babylon", clayson, 1927);

        Author napoleonHill = new Author("Napoleon", "Hill");
        Book thinkAndGetRich = new Book("Think and get rich", napoleonHill, 1930);


        System.out.println(richestManInBabylon.getPublisher());

        richestManInBabylon.setPublisher(1926);

        System.out.println(richestManInBabylon.getPublisher());
    }
}
