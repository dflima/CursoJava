public class AndroidButtonFactory extends ButtonFactory {

    @Override
    public Button createButton()
    {
        return new AndroidButton();
    }
}
