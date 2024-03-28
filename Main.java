public class Main {
    public static void main(String[] args){
        Gerente gerente = new Gerente("José", 5000.0);
        Diretor diretor = new Diretor("Clodovil", 15000.0);
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());

        System.out.println("\nDiretor:");
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("Salário: " + diretor.getSalario());
    }
}
