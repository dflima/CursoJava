public class RoupaFactory
{
	public static final int VERAO = 0;
	public static final int INVERNO = 1;

	public Estacao createRoupa(int estacao)
	{
		switch(estacao)
		{
			case 0:
				return new RoupaVerao();
			case 1:
			default:
				return new RoupaInverno();
		}
	}
}