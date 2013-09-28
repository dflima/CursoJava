class AdapterA implements LeitorProdutosAdapter
{
	private SistemaA sistema;

	public AdapterA()
	{
		this.sistema = new SistemaA();
	}

	public Produto getNewProduct()
	{
		return this.getProdutoFromSistemaA();
	}

	public Produto getProdutoFromSistemaA()
	{
		return this.sistema.getProduto();
	}
}