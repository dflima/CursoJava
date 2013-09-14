public interface ConversorDeProduto
{
	private int id;
	private String descricao;
	private float valor;
	private String fornecedor;
	
	public int getId();
	public void setId();
	public String getDescricao();
	public void setDescricao();
	public float getValor();
	public void setValor();
	public String getFornecedor();
	public void setFornecedor();
}