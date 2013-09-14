public class IOSButtonFactory extends ButtonFactory {

    @Override
    public Button createButton()
    {
        return new IOSButton();
    }

}
