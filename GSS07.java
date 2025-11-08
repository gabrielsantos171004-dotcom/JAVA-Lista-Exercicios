public class GSS07 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 07
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Lado a: "); int a = sc.nextInt();
                System.out.print("Lado b: "); int b = sc.nextInt();
                System.out.print("Lado c: "); int c = sc.nextInt();
                boolean valido = a + b > c && a + c > b && b + c > a;
                System.out.println(valido ? "Triângulo válido" : "Triângulo inválido");
    }
}
