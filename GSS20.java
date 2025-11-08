public class GSS20 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 20
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Quantos termos? "); int n = sc.nextInt();
                long a=0,b=1;
                for(int i=1;i<=n;i++){ System.out.println(a); long t=a+b; a=b; b=t; }
    }
}
