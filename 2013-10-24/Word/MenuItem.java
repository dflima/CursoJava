class MenuItem
{
	private Comando comando;

	public MenuItem(Comando comando)
	{
		this.comando = comando;
	}

	public void executarComando()
	{
		this.comando.executar();
	}
}