import java.util.ArrayList;

public class MeuBuscape {
    protected ArrayList<MeuProduto> listaProdutos;

    public MeuBuscape() {
    	this.listaProdutos = new ArrayList<MeuProduto>();
    }
    
    public void showList() {
    	for (int i = 0; i < this.listaProdutos.size(); i++) {
    		System.out.println("PRODUTO------ " + this.listaProdutos.get(i).getDescricao());
    		System.out.println("    Cod. " + this.listaProdutos.get(i).getId() + " R$ " + this.listaProdutos.get(i).getPreco());
    	}
    }
}
