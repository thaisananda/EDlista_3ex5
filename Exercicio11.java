package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller11;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Controller11 Fibonacci = new Controller11();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n termo de Fibonacci que deseja: "));
		
		if (n <= 0 || n > 20) {
            JOptionPane.showMessageDialog(null, "A posição deve ser entre 1 e 20.");
        } else {
        	System.out.print("Série de Fibonacci até o " + n + "º termo: ");
			for (int i = 1; i <= n; i++) {
				// Chama a função recursiva para cada termo e imprime
				System.out.print(Fibonacci.Fibonacci(i) + " ");
			}
			System.out.println(); 

  }
 }
} 