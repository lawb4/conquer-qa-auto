package consulting.hw4readingapp.objects;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;
    private Book currentBook;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book openBookByAuthorAndTitle(String author, String title) {
        for (Book book : books) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new NullPointerException("Book is not found!"); //TODO fix this method exception
    }

    public Book getActiveBook() {
        for (Book book : books) {
            if (book.getStatus().equals(BookStatus.ACTIVE)) {
                return book;
            }
        }
        throw new NullPointerException("No Active books found!"); //TODO fix this method exception
    }

    public void closeActiveBook(Book book) {
        book.setStatus(BookStatus.INACTIVE);
    }

}
