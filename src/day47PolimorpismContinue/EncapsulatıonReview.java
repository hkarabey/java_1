package day47PolimorpismContinue;

public class EncapsulatıonReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulatıonReview(String bookTitle, String publishDate) {
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }


    public void setBookTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.isEmpty()) {
            throw new RuntimeException("it is not correct title");
        }
        this.bookTitle = bookTitle;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
