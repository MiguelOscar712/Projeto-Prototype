package mercadinhoprototype;

public class Main {

    public static void main(String[] args) {

        Produto produtoOriginal =
                new Produto(
                        "Arroz",
                        25.90,
                        "Alimento"
                );

        System.out.println("PRODUTO ORIGINAL");
        produtoOriginal.exibir();

        Produto produtoClone =
                (Produto) produtoOriginal.clonar();

        System.out.println("\nPRODUTO CLONADO");
        produtoClone.exibir();
    }
}