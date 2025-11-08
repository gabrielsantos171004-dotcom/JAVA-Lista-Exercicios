public class GSS22 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 22
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int soma=0; int x;
                do{ System.out.print("Digite (0 para encerrar): "); x = sc.nextInt(); soma += x; } while(x!=0);
                System.out.println("Soma = " + soma);
    }
}
