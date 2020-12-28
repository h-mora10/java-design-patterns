package behavioral.mediator.solved;

import java.util.ArrayList;

public class List {

    private java.util.List<String> items = new ArrayList<>();

    private Mediator mediator;

    public void selectItem(int itemNumber) {
        String item = items.get(itemNumber);
        if (mediator != null) {
            mediator.itemSelected(item);
        }
    }

    public java.util.List<String> getItems() {
        return items;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
