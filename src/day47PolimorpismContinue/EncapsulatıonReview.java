package day47PolimorpismContinue;

public class EncapsulatÄ±onReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulatÄ±onReview(String bookTitle, String publishDate) {
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
