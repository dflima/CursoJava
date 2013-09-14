public class ConversorSubmarino extends ConversorDeProduto
{
	public void parseProduto(String str)
	{
		// codigo ; descricao ; preco ; avaliacao
		String elementos[] = str.split(";");

		super.setId(Integer.parseInt(elementos[0]));
		super.setDescricao(elementos[1]);
		super.setPreco(Float.parseFloat(elementos[2]));
		super.setFornecedor("Submarino.com.br");
	}
}