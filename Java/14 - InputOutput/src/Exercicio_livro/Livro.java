package Exercicio_livro;

import javax.swing.JOptionPane;

public class Livro extends Produto {
	
	public void exibirDados() {
		
		JOptionPane.showMessageDialog(null, "Produtos");
		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do produto?")));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?")));
		setDescricao(JOptionPane.showInputDialog("Qual o nome do produto? "));
		
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Descriçao: " + getDescricao());
		System.out.println("Preço: R$ " + getPreco());
		
	}

}
