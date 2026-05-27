package mercadinhoprototype;

public class CaixaTesteMercadinho {

    public static void main(String[] args) {

        System.out.println(" CAIXA DE TESTE - PROTOTYPE");



        System.out.println("\nTESTE 01 - Criar produto");

        Produto produtoOriginal =
                new Produto(
                        "Feijão",
                        9.50,
                        "Alimento"
                );

        if (produtoOriginal != null) {
            System.out.println("TESTE 01 APROVADO");
        } else {
            System.out.println("TESTE 01 REPROVADO");
        }


        System.out.println("\nTESTE 02 - Clonar produto");

        Produto produtoClone =
                (Produto) produtoOriginal.clonar();

        if (produtoClone != null) {
            System.out.println("TESTE 02 APROVADO");
        } else {
            System.out.println("TESTE 02 REPROVADO");
        }


        System.out.println("\nTESTE 03 - Comparar objetos");

        if (produtoOriginal != produtoClone) {
            System.out.println("Objetos diferentes.");
            System.out.println("TESTE 03 APROVADO");
        } else {
            System.out.println("TESTE 03 REPROVADO");
        }


        System.out.println("\nTESTE 04 - Exibir dados");

        produtoOriginal.exibir();
        produtoClone.exibir();

        System.out.println("TESTE 04 APROVADO");


        System.out.println(" TODOS OS TESTES FINALIZADOS");
    }
}