public class GSS10 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 10
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Ano: "); int ano = sc.nextInt();
                boolean bis = (ano%4==0 && ano%100!=0) || (ano%400==0);
                System.out.println(bis ? "Bissexto" : "Não bissexto");
    }
}
