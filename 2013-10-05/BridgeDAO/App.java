public class App
{
	public static void main(String args[])
	{
		GenericDAO dao = new GenericDAO();
		GenericCliente cli = new GenericCliente();

		// Wrapper para manipular de forma genérica um cliente
		cli.setCliente(new ClientePF());
		// Wrapper para manipular de forma genérica um DAO
		dao.setDao(new DAODB());

		// Gravar cliente no DAO
		dao.getDao().create(cli.getCliente());
	}
}