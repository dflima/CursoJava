class App
{
	public static void main(String args[])
	{
		AplicacaoChat chat = new AplicacaoChat("danilo@danilo.com");
		chat.enviarMensagem("oi quer tc?");
		chat.enviarMensagem("vem sempre aqui?");
		chat.enviarMensagem("tchau");
	}
}