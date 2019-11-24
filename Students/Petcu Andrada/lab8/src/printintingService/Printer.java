package printintingService;

public class Printer implements PrintingService {
	private Integer nbOfPrintedPages = 0;
	private Integer paperSet = 220;
	private Integer tankVolume = 100;
	
	@Override
	public void refillPaper() {
		this.paperSet = 220;
	}
	
	@Override
	public void refullInk() {
		this.tankVolume = 100;
	}
	
	public void print(Document doc) throws OutOfPaperException, OutOfInkException
	{
		for(int i=0; i<doc.getNumberOfPages(); i++)
		{
			System.out.println("page " + i + " from document " + doc.getDocName() + " printed");
			nbOfPrintedPages++;
			tankVolume = tankVolume - 10;
			if(nbOfPrintedPages >= paperSet)
			{
				throw new OutOfPaperException("Out of paper exception");
			}
			if(tankVolume <= 0)
			{
				throw new OutOfInkException("Out of Ink Exception");
			}
		}
	}
	
	public Integer getPaper()
	{
		return this.nbOfPrintedPages;
	}
}
