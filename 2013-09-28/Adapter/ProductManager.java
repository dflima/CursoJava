import java.util.ArrayList;

public class ProductManager
{
	private ArrayList<Produto> listaProdutos;

	public ProductManager()
	{
		this.listaProdutos = new ArrayList<Produto>();
	}

	public void addProduto(Produto p)
	{
		this.listaProdutos.add(p);
	}

	public ArrayList<Produto> getListaProdutos()
	{
		return this.listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos)
	{
		this.listaProdutos = listaProdutos;
	}
}