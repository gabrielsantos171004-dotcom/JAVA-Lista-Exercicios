public class GSS39 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 39
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int x; do{ System.out.print("Digite um número entre 1 e 5: "); x = sc.nextInt(); } while(x<1 || x>5);
                System.out.println("Você escolheu: " + x);
    }
}
