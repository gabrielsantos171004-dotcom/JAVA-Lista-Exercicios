public class GSS26 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 26
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Número: "); int n = sc.nextInt(); if(n<2){ System.out.println("Não primo"); return; }
                int i=2; boolean primo=true; while(i<=Math.sqrt(n)){ if(n%i==0){ primo=false; break; } i++; }
                System.out.println(primo?"É primo":"Não é primo");
    }
}
