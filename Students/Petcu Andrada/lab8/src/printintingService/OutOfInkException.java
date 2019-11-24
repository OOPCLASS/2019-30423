package printintingService;

public class OutOfInkException extends Error{
	public String message;
	
	public OutOfInkException(String msg)
	{
		this.message = msg;
	}
}
