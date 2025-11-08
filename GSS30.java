public class GSS30 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 30
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int op;
                do{
                    System.out.println("1 - Olá\n2 - Sair"); System.out.print("Opção: "); op = sc.nextInt();
                    if(op==1) System.out.println("Você escolheu Olá");
                } while(op!=2);
                System.out.println("Fim");
    }
}
