public class GSS08 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 08
                String user = "admin", pass = "1234";
                if (args.length<2) { System.out.println("Uso: java GSS08 <user> <senha>"); return; }
                System.out.println((user.equals(args[0]) && pass.equals(args[1])) ? "Login OK" : "Login falhou");
    }
}
