class ComandoSalvar extends Comando
{
	public void executar()
	{
		Word.documento.salvar();
	}
}