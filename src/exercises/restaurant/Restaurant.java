package exercises.restaurant;

public class Restaurant {
    public static void main(String[] args) {

        Menu dinnerMenu = new Menu("Dinner Menu");
        MenuItem cake = new MenuItem(2, "chocoate cake", "Dessert");
        dinnerMenu.addItem(cake);

        System.out.println(cake.getPrice());
        System.out.println(dinnerMenu.items);
        System.out.println(cake.isNew);
        System.out.println(dinnerMenu.getLastUpdated());

        MenuItem pie = new MenuItem(5, "pumpkin pie", "Dessert");
        dinnerMenu.addItem(pie);
        System.out.println(dinnerMenu.items);
        System.out.println(dinnerMenu.getLastUpdated());
        MenuItem salad = new MenuItem(2, "Good", "side");
    }
}
