package programa;

import java.util.Stack;

public class ProgramaPilha extends pilhaRepo{
	
	public static void main(String[] args) {
	
	//create an object of Stack class
	Stack<String> pilhinha = new Stack<>();
	System.out.println("stack: "+ pilhinha);
	
	//pushing elements into the stack
	inserindoPush(pilhinha, "Caixa acustica 110");
	inserindoPush(pilhinha, "Caixa acustica 220");
	inserindoPush(pilhinha, "Note");
	deletandoPop(pilhinha);
	deletandoPop(pilhinha);
	
	}

}
