public class GSS01 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 01
                int x = 0;
                try { x = Integer.parseInt(args.length>0?args[0]:"0"); } catch(Exception e) { System.out.println("Informe um número como argumento."); return; }
                if (x>0) System.out.println(x + " é positivo"); else if (x<0) System.out.println(x + " é negativo"); else System.out.println("Zero");
    }
}
