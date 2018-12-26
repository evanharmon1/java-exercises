// List new menu items
// Display date menu was last updated

package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public Date lastUpdated;
    public ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(String name) {
        name = name;
        lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}

