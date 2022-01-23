package abstract_factory_pattern;

interface Window {
    void setTitle(String title);
    void paint();
}

class MSWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("MS Window Title: " + title);
    }

    @Override
    public void paint() {
        System.out.println("MS Window Painted!");
    }
}

class MacWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("Mac Window Title: " + title);
    }

    @Override
    public void paint() {
        System.out.println("Mac Window Painted!");
    }
}

// Abstract Factory
interface WidgetFactory {
    Window createWindow();
}

// Factory for MS
class MSWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new MSWindow();
    }
}

// Factory for Mac
class MacWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // If Platform is MS Windows
        WidgetFactory msWidgetFactory = new MSWidgetFactory();
        Window msWindow = msWidgetFactory.createWindow();
        msWindow.setTitle("Hello MS Windows");
        msWindow.paint();

        // If Platform is Mac
        WidgetFactory macWidgetFactory = new MacWidgetFactory();
        Window macWindow = macWidgetFactory.createWindow();
        macWindow.setTitle("Hello Mac");
        macWindow.paint();
    }
}
