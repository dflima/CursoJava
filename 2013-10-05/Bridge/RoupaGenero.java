public abstract class RoupaGenero extends Genero
{
	private Estacao pecaCima;
	private Estacao pecaBaixo;

	public void setPecaCima(Estacao pecaCima)
	{
		this.pecaCima = pecaCima;
	}

	public Estacao getPecaCima()
	{
		return this.pecaCima;
	}

	public void setPecaBaixo(Estacao pecaBaixo)
	{
		this.pecaBaixo = pecaBaixo;
	}

	public Estacao getPecaBaixo()
	{
		return this.pecaBaixo;
	}
}