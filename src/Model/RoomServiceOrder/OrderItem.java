package Model.RoomServiceOrder;

import Model.Menu.MenuItem;
import Persistence.Entity;

public class OrderItem extends Entity {
    private MenuItem menuItem;
    private String orderRemark;

    public OrderItem(MenuItem menuItem, String orderRemark) {
        this.menuItem = menuItem.copyMenuItem();
        this.orderRemark = orderRemark;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    @Override
    public String toString() {

        // format room rate
        String stringPrice = String.format("%.2f",menuItem.getPrice());

        return    "\n------------Order Item-------------"
                + "\nName             : " + menuItem.getName()
                + "\nDescription      : " + menuItem.getDescription()
                + "\nPrice            : SGD " + stringPrice
                + "\nOrder Remark     : " + orderRemark;

    }
}
