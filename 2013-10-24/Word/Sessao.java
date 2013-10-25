public class Sessao
{
	public static Documento documento;

	public static Documento getDocumentInstance()
	{
		if(null == documento) {
			documento = new Documento("arquivo.doc");
		}

		return documento;
	}
}