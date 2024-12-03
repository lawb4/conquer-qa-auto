package consulting.hw4readingapp.objects;

public class Page {
    private final String text;
    private int pageNumber;

    public Page(String text, int pageNumber) {
        this.text = text;
        this.pageNumber = pageNumber;
    }

    public String getText() {
        return text;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
