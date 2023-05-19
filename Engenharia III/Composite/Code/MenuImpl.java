public class MenuImpl implements MenuItem {
    private String name;
    
    public MenuImpl(String name) {
        this.name = name;
    }
    
    public void execute() {
        System.out.println("- " + name);
    }
}
