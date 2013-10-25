class AplicacaoChat
{
	private String destinatario;
	private Mensageiro mensageiro;

	public AplicacaoChat(String destinatario)
	{
		this.destinatario = destinatario;
		this.mensageiro = new Mensageiro("localhost", 3306);
	}

	public void enviarMensagem(String mensagem)
	{
		this.mensageiro.enviarMensagem(this.destinatario + "|" + mensagem);
	}
}