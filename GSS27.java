public class GSS27 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 27
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int count=0; for(int i=1;i<=10;i++){ System.out.print("Número " + i + ": "); int v=sc.nextInt(); if(v%2!=0) count++; }
                System.out.println("Ímpares digitados: " + count);
    }
}
