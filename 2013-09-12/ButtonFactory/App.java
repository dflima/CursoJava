public class App {
    public static void main(String args[])
    {
		Button ab;
		ButtonFactory f = new IOSButtonFactory();

		ab = f.createButton();
		ab.showLabel();
    }
}
