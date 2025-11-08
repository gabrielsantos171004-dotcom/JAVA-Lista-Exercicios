public class GSS05 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 05
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Nota 1: "); double n1 = sc.nextDouble();
                System.out.print("Nota 2: "); double n2 = sc.nextDouble();
                double media = (n1+n2)/2.0;
                System.out.printf("Média: %.2f - %s\n", media, media>=6? "Aprovado":"Reprovado");
    }
}
