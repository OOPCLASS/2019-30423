package lab_07;

public class Document {
    private static int CHARACTER_PER_PAGE = 10;
    private String message;
    private int numberOfPages;

    public Document(String message) {
        this.message = message;
        this.numberOfPages = message.length() / CHARACTER_PER_PAGE + (message.length() % CHARACTER_PER_PAGE > 0 ? 1 : 0);
    }

    public String getMessage() {
        return message;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

}
