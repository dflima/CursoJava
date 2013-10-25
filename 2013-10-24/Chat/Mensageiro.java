class Mensageiro
{
	private String maquinaDestino;
	private int porta;
	private InterfaceComunicacao interfaceComunicacao;

	public Mensageiro(String maquinaDestino, int porta)
	{
		this.maquinaDestino = maquinaDestino;
		this.porta = porta;
		this.interfaceComunicacao = new InterfaceComunicacao(23);
	}

	public void enviarMensagem(String mensagem)
	{
		this.interfaceComunicacao.enviarMensagem(this.maquinaDestino + ":" + this.porta + "|" + mensagem);
	}
}