class DescontoEletronico implements CalculadoraDesconto {
    @Override
    public double calcular(Produto produto) {
        System.out.println("Aplicando 5% de desconto para eletrônico.");
        return produto.getValor() * 0.05;
    }
}