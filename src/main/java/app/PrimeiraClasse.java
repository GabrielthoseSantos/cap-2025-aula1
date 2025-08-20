package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");


        Aluno a1 = new Aluno();
        a1.setId(1);
        a1.setNome("Marcos");
        a1.setIdade(45);

        System.out.println(a1.getNome());
    }

}