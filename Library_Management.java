class Library {
    static class Book {
        private String title;
        private String author;
        private String ISBN;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        public void displayDetails() {
            System.out.println("Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }

    public static void main(String[] args) {
        Library.Book book1= new Library.Book("Elder Rings", "Alexander Da vinci", "978-0743273565");
        Library.Book book2= new Library.Book("Let us java", "Kabir Das ", "978-0243273565");
        book1.displayDetails();
        book2.displayDetails();
    }
}
