package controller;

public class Controller11 {
	
	public Controller11() {
		super();
	}
	
	public int Fibonacci(int n) {
		
		// Condição de parada: se n for 1 ou 2, retorna 1
        if (n == 1 || n == 2) {
            return 1;
	} else {
		// Chamada recursiva: soma dos dois termos anteriores
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

 }

}
