public class GSS23 {
    public static void main(String[] args) {
        // Nome: Gabriel Santos Silva — RA: 0023595 — Exercício 23
                java.util.Scanner sc = new java.util.Scanner(System.in);
                final String senha = "senha123"; String tentativa="";
                while(true){ System.out.print("Senha: "); tentativa = sc.next(); if(tentativa.equals(senha)){ System.out.println("Acesso liberado"); break; } else System.out.println("Senha incorreta"); }
    }
}
