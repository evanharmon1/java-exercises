package exercises.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MenuItem {

    private float price;
    public String description;
    public String category;
    public Date updated;
    public Boolean isNew;

    public static List<String> allowedCategories = new ArrayList<>(Arrays.asList("Appetizer", "Main Course", "Dessert"));


    public MenuItem(float price, String description, String category) {
        this.price = price;
        this.description = description;

        this.updated = new Date();

        if (allowedCategories.contains(category)) {
            this.category = category;
        }
        else {
            System.exit(2);
        }

        this.isNew = true;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public static void main(String[] args) {

        MenuItem cake = new MenuItem(2, "Good", "Dessert");
        System.out.println(cake.getPrice());
        MenuItem salad = new MenuItem(2, "Good", "side");
    }

}
