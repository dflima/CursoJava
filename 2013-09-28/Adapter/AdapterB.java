class AdapterB implements LeitorProdutosAdapter
{
	private SistemaB sistema;

	public AdapterB()
	{
		this.sistema = new SistemaB();
	}

	public Produto getNewProduct()
	{
		return this.getProdutoFromSistemaB();
	}

	public Produto getProdutoFromSistemaB()
	{
		return this.sistema.readProduto();
	}
}