public class GSS09 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 09
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("N1: "); int n1 = sc.nextInt();
                System.out.print("N2: "); int n2 = sc.nextInt();
                System.out.print("N3: "); int n3 = sc.nextInt();
                int[] v = {n1,n2,n3}; java.util.Arrays.sort(v);
                System.out.println(v[0] + " " + v[1] + " " + v[2]);
    }
}
