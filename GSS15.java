public class GSS15 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 15
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Número: "); int n = sc.nextInt(); long f=1; for(int i=2;i<=n;i++) f*=i;
                System.out.println(n + "! = " + f);
    }
}
