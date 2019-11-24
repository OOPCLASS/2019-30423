package printintingService;

public interface PrintingService {
	    // OutOfInkException   - unchecked exception
		// OutOfPaperException - checked exception
		void refillPaper();
		
		void refullInk();
}
