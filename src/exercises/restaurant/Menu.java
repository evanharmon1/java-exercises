// List new menu items
// Display date menu was last updated

package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public ArrayList<MenuItem> items = new ArrayList<>();
    public Date lastUpdated;

    public Menu(ArrayList<MenuItem> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

