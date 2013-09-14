public class AppComercioEletronico
{
	public static void main(String args[])
	{
		MeuBuscape mb = new MeuBuscape();
		LeitorParceiros lp = new LeitorParceiros();
		lp.parseListProdutos(mb.getListaProdutos());
		mb.showList();
	}
}