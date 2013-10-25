import java.util.ArrayList;

class Word
{
	public static Documento documento;
	private ArrayList<MenuItem> itens;

	public Word()
	{
		documento = Sessao.getDocumentInstance();

		this.itens = new ArrayList<MenuItem>();
		this.itens.add(new MenuItem(new ComandoAbrir()));
		this.itens.add(new MenuItem(new ComandoSalvar()));
		this.itens.add(new MenuItem(new ComandoFechar()));
	}

	public void selecionarOpcao(int opcao)
	{
		this.itens.get(opcao-1).executarComando();
	}
}