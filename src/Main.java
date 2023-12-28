public class Main {
    public static void main(String[] args) {


        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1398);
        pessoa1.setDono("Pessoa 1");
        pessoa1.abrirConta("CP");
        pessoa1.depositar(350);
        pessoa1.estadoAtual();

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(1995);
        pessoa2.setDono("Pessoa 2");
        pessoa2.abrirConta("CC");
        pessoa2.depositar(200);
        pessoa2.estadoAtual();

    }
}