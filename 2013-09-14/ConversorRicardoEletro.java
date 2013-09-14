public class ConversorRicardoEletro extends ConversorDeProduto
{
	public void parseProduto(String str)
	{
		// codigo // tituloProduto // detalheProduto // preco
		String elementos[] = str.split("//");

		super.setId(Integer.parseInt(elementos[0]));
		super.setDescricao(elementos[1] + " " + elementos[2]);
		super.setPreco(Float.parseFloat(elementos[3]));
		super.setFornecedor("RicardoEletro.com.br");
	}
}