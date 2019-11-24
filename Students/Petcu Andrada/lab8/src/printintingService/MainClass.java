package printintingService;

public class MainClass {

	public static void main(String[] args) {
		Document myDoc = new Document();
		myDoc.setDocName("Document1");
		myDoc.setNumberOfPages(300);
		System.out.println(myDoc.getDocName());
		System.out.println(myDoc.getNumberOfPages());
		Printer printer = new Printer();
		try {
			printer.print(myDoc);
		} catch (OutOfPaperException | OutOfInkException e) {
			System.out.println(e);
			if(e instanceof OutOfPaperException)
			{
				printer.refillPaper();
			}
			else
			{
				printer.refullInk();
			}
		}
		System.out.println(printer.getPaper());
	}
}
