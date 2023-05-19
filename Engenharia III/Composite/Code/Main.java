public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("\nMain Menu");
        
        Menu option1 = new Menu("File");
        Menu option2 = new Menu("Edit");
        
        MenuItem item1 = new MenuImpl("New");
        MenuItem item2 = new MenuImpl("Open");
        MenuItem item3 = new MenuImpl("Copy");
        MenuItem item4 = new MenuImpl("Paste");
       
        option1.addComponent(item1);
        option1.addComponent(item2);
        option2.addComponent(item3);
        option2.addComponent(item4);
        
        mainMenu.addComponent(option1);
        mainMenu.addComponent(option2);

        mainMenu.execute();
    }
}