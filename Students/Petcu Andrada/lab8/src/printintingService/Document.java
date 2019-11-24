package printintingService;

public class Document {
	private String documentName;
	private Integer numberOfPages;
	
	public Document() {
		this.numberOfPages = 1;
	}

	public void setDocName(String documentName) {
		this.documentName = documentName;
	}
	
	public String getDocName()
	{
		return this.documentName;
	}
	
	public void setNumberOfPages(Integer nbPages) {
		this.numberOfPages = nbPages;
	}
	
	public Integer getNumberOfPages()
	{
		return this.numberOfPages;
	}	
}
