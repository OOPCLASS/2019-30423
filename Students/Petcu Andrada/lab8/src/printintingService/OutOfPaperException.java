package printintingService;

public class OutOfPaperException extends Exception{
	public String messsage;
	
	public OutOfPaperException(String msg)
	{
		this.messsage = msg;
	}

}
