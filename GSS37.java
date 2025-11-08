public class GSS37 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 37
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int soma=0; int x; do{ System.out.print("Digite um número: "); x=sc.nextInt(); soma+=x; } while(x%10!=0);
                System.out.println("Soma total = " + soma);
    }
}
