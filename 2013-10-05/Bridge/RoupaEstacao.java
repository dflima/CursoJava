public abstract class RoupaEstacao extends Estacao
{
	private String descricao;
	private int tamanho;
	private String cor;

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return this.descricao;
	}

	public void setTamanho(String tamanho)
	{
		this.tamanho = tamanho;
	}

	public int getTamanho()
	{
		return this.tamanho;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getCor()
	{
		return this.cor;
	}
}