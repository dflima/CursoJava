public class DAODB implements DAO
{
	private String servidor;

	public void create(Object o)
	{
		this.servidor = "localhost/" + o.toString();
		System.out.println("Gravei " + o + " no servidor " + this.servidor);
	}

}