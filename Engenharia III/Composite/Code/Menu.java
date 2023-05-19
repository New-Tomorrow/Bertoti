import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuItem {
    private String name;
    private List<MenuItem> items = new ArrayList<MenuItem>();
    
    public Menu(String name) {
        this.name = name;
    }
    
    public void addComponent(MenuItem item) {
        items.add(item);
    }
    
    public void removeComponent(MenuItem item) {
        items.remove(item);
    }
    
    public MenuItem getComponent(int item) {
        return items.get(item);
    }
    
    public void execute() {
        System.out.println(name + ":");
        for (MenuItem component : items) {
            component.execute();
        }
    }
}
