public class ConversorAmericanas extends ConversorDeProduto
{
	public void parseProduto(String str)
	{
		// descricao | preco | codigoInterno | codigoParceiro
		String elementos[] = str.split("|");

		super.setId(Integer.parseInt(elementos[3]));
		super.setDescricao(elementos[0]);
		super.setPreco(Float.parseFloat(elementos[1]));
		super.setFornecedor("Americanas.com");
	}
}