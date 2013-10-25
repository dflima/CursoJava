class Documento
{
	private String nomeArquivo;

	public Documento(String nomeArquivo)
	{
		this.nomeArquivo = nomeArquivo;
	}

	public void abrir()
	{
		System.out.println("Abrindo arquivo: " + nomeArquivo);
	}

	public void salvar()
	{
		System.out.println("Salvando arquivo: " + nomeArquivo);
	}

	public void fechar()
	{
		System.out.println("Fechando arquivo: " + nomeArquivo);
	}
}