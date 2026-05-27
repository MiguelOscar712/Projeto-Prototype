package mercadinhoprototype;

public class Produto implements ProdutoPrototype {

    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome,
                   double preco,
                   String categoria) {

        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public ProdutoPrototype clonar() {

        return new Produto(
                this.nome,
                this.preco,
                this.categoria
        );
    }

    public void exibir() {

        System.out.println(
                "Produto: " + nome +
                        " | Preço: R$ " + preco +
                        " | Categoria: " + categoria
        );
    }
}