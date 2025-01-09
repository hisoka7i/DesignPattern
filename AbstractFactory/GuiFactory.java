package AbstractFactory;

//Abstract Factory
interface GuiFactory {
    Button createButton();
    CheckBox createCheckBox();
}

//Abstract products
interface Button(){
    void render();
}
interface CheckBox(){
    void render();
}

//Concrete factory for windows
class WindowsFactory implements GuiFactory{
    public Button createButton(){
        return new WindowsButton();
    }
    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}

//concreate factory for mac
class MacFactory implements GuiFactory{
    public Button createButton(){
        return new MacButton();
    }
    public CheckBox createCheckBox(){
        return new macCheckbox();
    }
}

class WindowsButton implements Button{
    @Override
    public void render() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }

}

class WindowsCheckBox implements Button{
    @Override
    public void render() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }

}

class MacButton implements Button{
    @Override
    public void render() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }
}

class macCheckbox implements Button{
    @Override
    public void render() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }
}

class Application{
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory guiFactory){
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void render(){
        button.render();
        checkBox.render();
    }
}