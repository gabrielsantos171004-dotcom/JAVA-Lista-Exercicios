public class GSS02 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 02
                int x = 0;
                try { x = Integer.parseInt(args.length>0?args[0]:"0"); } catch(Exception e) { System.out.println("Informe um número como argumento."); return; }
                System.out.println(x % 2 == 0 ? x + " é par" : x + " é ímpar");
    }
}
