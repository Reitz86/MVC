package uebung3;

public class Fibonacci {
	

	    public int[] calcFibonacci(int n) { // Entgegennehmen von int Parameter
			int[] fibo = new int[n+1];
			
			if (n <= 0) {
				fibo[0] = 0;
				return fibo;
			}
			
			else if(n==1) {
				fibo[1] = 1;
				return fibo;
			}
			
			else {
				fibo[0] = 0; // hat am Anfang der Schleife den Wert Fib(i-2)
				fibo[1] = 1; // hat am Anfang der Schleife den Wert Fib(i-1)
				fibo[2] = 1;
				for (int i= 3; i<=n; i++) { // Schleife fuer alle Werte von 2 bis n
					fibo[i] = fibo[i-1] + fibo[i-2]; // Wert von Fib(i-1)
				}
				return fibo;
			}

	    }
		
	}