package lab_07;

public interface PrintingService {

    // OutOfInkException   - unchecked exception
    // OutOfPaperException - checked exception
    void print(Document document) throws OutOfPaperException;

    void refillPaper();

    void refillInk();
}
