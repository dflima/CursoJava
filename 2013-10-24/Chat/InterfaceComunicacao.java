class InterfaceComunicacao
{
	private int codigoCRC;

	public InterfaceComunicacao(int codigoCRC)
	{
		this.codigoCRC = codigoCRC;
	}

	public void enviarMensagem(String mensagem)
	{
		System.out.println(this.codigoCRC + "*" + mensagem);
	}
}