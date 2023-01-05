public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();

        c1.setSexo("Masculino");
        c1.setIdade(24);
        c1.setNome("Roberto");
        c1.setAnoNasc(1998);
        c1.setValorDiv(2500.12);

        System.out.println(c1);

        g1.setNome("Julia");
        g1.setIdade(34);
        g1.setNomeGerencia("Coordenadora de operacoes");
        g1.setMatricula("RE2560AK");
        g1.setSalario(10542.32);
        g1.calcINSS();
        System.out.println(g1);

        v1.setNome("Luis");
        v1.setIdade(19);
        v1.setQtdVendas(201);
        v1.setValorVendas(10.99);
        v1.setSalario(2000.50);

        System.out.println(v1);



    }
}
