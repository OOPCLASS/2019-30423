package lab_07;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Hello there, general Kenobi!");
        PrintingService printingService = new PrintingServiceImpl(10, 120);
        try {
            printingService.print(document);
            printingService.print(document);
            printingService.print(document);
            printingService.refillPaper();
            printingService.print(document);
            printingService.refillInk();
            printingService.print(document);
            printingService.print(document);
            printingService.print(document);
        } catch (OutOfPaperException e) {
            System.out.println("Sorry, out of paper. Please insert more");
        }

    }
}
