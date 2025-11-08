public class GSS06 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 06
                int x = 0;
                try { x = Integer.parseInt(args.length>0?args[0]:"0"); } catch(Exception e) { System.out.println("Informe um número como argumento."); return; }
                boolean m3 = x%3==0, m5 = x%5==0;
                if (m3 && m5) System.out.println(x + " é múltiplo de 3 e 5"); else if (m3) System.out.println(x + " é múltiplo de 3"); else if (m5) System.out.println(x + " é múltiplo de 5"); else System.out.println(x + " não é múltiplo de 3 nem de 5");
    }
}
