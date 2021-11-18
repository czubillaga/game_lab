package items;

import behaviors.IContent;

public class Item implements IContent {
    private String name;

    public Item(String name) {
        this.name = name;
    }
}
