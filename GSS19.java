public class GSS19 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 19
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Número: "); int n = sc.nextInt();
                if(n<2) { System.out.println("Não primo"); return; }
                boolean primo=true; for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0){ primo=false; break; }
                System.out.println(primo?"É primo":"Não é primo");
    }
}
