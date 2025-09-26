class CalculadoraDesconto {
    public double calcular(Produto produto) {
        if ("livro".equals(produto.getTipo())) {
            return produto.getValor() * 0.10;
        } else if ("eletronico".equals(produto.getTipo())) {
            return produto.getValor() * 0.05;
        }
        return 0.0;
    }
}