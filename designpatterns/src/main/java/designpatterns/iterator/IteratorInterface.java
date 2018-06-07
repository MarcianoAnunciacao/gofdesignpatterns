package designpatterns.iterator;

public interface IteratorInterface {
	
	void first();
	void next();
	
	boolean isDone();
	
	Canal currentItem();
	
	
}
