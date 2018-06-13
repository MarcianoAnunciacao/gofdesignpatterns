package designpatterns.interpreter;

public class Contexto {

	protected String input;
	protected int out;

	public Contexto(String input) {
		this.input = input;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
}
