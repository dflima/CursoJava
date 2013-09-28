import java.util.ArrayList;

public class LeitorParceiros
{
	public void parseListProdutos(ArrayList<MeuProduto> lista)
	{
		ConversorDeProduto c;
		MeuProduto p = new MeuProduto();

		c = new ConversorAmericanas();
		c.parseProduto("computador@1000.0@1234@987");
		p.setId(c.getId());
		p.setDescricao(c.getDescricao());
		p.setPreco(c.getPreco());
		p.setFornecedor(c.getFornecedor());
		lista.add(p);

		c = new ConversorRicardoEletro();
		p = new MeuProduto();
		c.parseProduto("1111//TV LG//LED 45 pol//1250.0");
		p.setId(c.getId());
		p.setDescricao(c.getDescricao());
		p.setPreco(c.getPreco());
		p.setFornecedor(c.getFornecedor());
		lista.add(p);

		c = new ConversorSubmarino();
		p = new MeuProduto();
		c.parseProduto("22;XisBread;1.50;Que Maravilha!");
		p.setId(c.getId());
		p.setDescricao(c.getDescricao());
		p.setPreco(c.getPreco());
		p.setFornecedor(c.getFornecedor());
		lista.add(p);
	}    
}
