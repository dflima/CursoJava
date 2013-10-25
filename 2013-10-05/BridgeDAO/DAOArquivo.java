public class DAOArquivo implements DAO
{
	private String nomeArquivo;

	public void create(Object o)
	{
		this.nomeArquivo = o.toString() + ".txt";
		System.out.println("Gravei " + o + " no arquivo " + this.nomeArquivo);
	}

	public void setNomeArquivo(String nomeArquivo)
	{
		this.nomeArquivo = nomeArquivo;
	}

	public String getNomeArquivo()
	{
		return this.nomeArquivo;
	}
}