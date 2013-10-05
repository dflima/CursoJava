public class Closet
{
	public static void main(String args[])
	{
		RoupaFactory fabrica = new RoupaFactory();

		Genero h = new RoupaHomem();
		h.setPecaCima(fabrica.createRoupa(RoupaFactory.VERAO));
		h.setPecaBaixo(fabrica.createRoupa(RoupaFactory.VERAO));

		System.out.println(h);
	}
}