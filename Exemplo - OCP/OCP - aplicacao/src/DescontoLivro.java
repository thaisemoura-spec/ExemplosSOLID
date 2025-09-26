class DescontoLivro implements CalculadoraDesconto {
    @Override
    public double calcular(Produto produto) {
        System.out.println("Aplicando 10% de desconto para livro.");
        return produto.getValor() * 0.10;
    }
}