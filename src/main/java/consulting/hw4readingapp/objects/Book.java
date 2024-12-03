package consulting.hw4readingapp.objects;

import java.util.ArrayList;

public class Book {
    private final int bookId;
    private final String author;
    private final String title;
    private final ArrayList<Page> pages;
    private int currentPage;
    private BookStatus status;
    private static int counterId;

    public Book(String author, String title) {
        this.bookId = counterId++;
        this.author = author;
        this.title = title;
        this.pages = new ArrayList<>();
        this.currentPage = 1;
        this.status = BookStatus.INACTIVE;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void turnPageForward() {
        for (Page page : pages) {
            if (page.getPageNumber() == this.currentPage) {
                page.setPageNumber(this.currentPage++);
            } else if (page.getPageNumber() + 1 > pages.size()) {
                page.setPageNumber(getCurrentPage());
            }
        }
        this.currentPage++;
    }

    public void turnPageBackward() {
        for (Page page : pages) {
            if (page.getPageNumber() == this.currentPage) {
                page.setPageNumber(this.currentPage--);
            } else if (page.getPageNumber() - 1 == 0) {
                page.setPageNumber(getCurrentPage());
            }
        }
        this.currentPage--;
    }

    public void goToPage(int pageNumber) {
        for (Page page : pages) {
            if (pages.size() <= pageNumber) {
                page.setPageNumber(pageNumber);
            } else throw new IllegalArgumentException("Page number does not exist!"); //TODO fix?
        }
        this.currentPage = pageNumber;
    }
}
