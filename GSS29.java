public class GSS29 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 29
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Número positivo: "); long n = sc.nextLong(); int dig=0; while(n>0){ dig++; n/=10; }
                System.out.println("Dígitos: " + (dig==0?1:dig));
    }
}
