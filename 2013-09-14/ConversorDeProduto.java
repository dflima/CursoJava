public abstract class ConversorDeProduto
{
	protected int id;
	protected String descricao;
	protected float preco;
	protected String fornecedor;

	public abstract void parseProduto(String str);
	
	public int getId() {
		return this.id; 
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return this.preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getFornecedor() {
		return this.fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
}