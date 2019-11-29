package lab_07;

public class PrintingServiceImpl implements PrintingService {
    private static int INK_PER_PAGE = 10;
    private final int initialNumberOfPages;
    private final int initialValueOfInk;
    private int numberOfPages;
    private int valueOfInk;


    public PrintingServiceImpl(int numberOfPages, int valueOfInk) {
        this.numberOfPages = this.initialNumberOfPages = numberOfPages;
        this.valueOfInk = this.initialValueOfInk = valueOfInk;
    }

    @Override
    public void print(Document document) throws OutOfPaperException {
        int documentNumberOfPages = document.getNumberOfPages();
        if (valueOfInk < INK_PER_PAGE * documentNumberOfPages) {
            throw new OutOfInkException();
        }
        if (documentNumberOfPages > numberOfPages) {
            throw new OutOfPaperException();
        }
        numberOfPages -= documentNumberOfPages;
        valueOfInk -= INK_PER_PAGE * documentNumberOfPages;
        System.out.println("printing: " + document.getMessage());
    }

    @Override
    public void refillPaper() {
        numberOfPages = initialNumberOfPages;
    }

    @Override
    public void refillInk() {
        valueOfInk = initialValueOfInk;
    }
}
