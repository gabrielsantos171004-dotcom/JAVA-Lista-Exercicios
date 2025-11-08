public class GSS40 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 40
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("Digite números (negativo para sair):"); int x = sc.nextInt(); int maior = Integer.MIN_VALUE;
                while(x>=0){ if(x>maior) maior = x; x = sc.nextInt(); }
                if(maior==Integer.MIN_VALUE) System.out.println("Nenhum número positivo informado"); else System.out.println("Maior: " + maior);
    }
}
