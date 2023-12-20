package bai1;

import java.util.ArrayList;
import java.util.List;

class Couple implements Person {
    private Person husband;
    private Person wife;
    private List<Person> children;

    public Couple(Person husband, Person wife) {
        this.husband = husband;
        this.wife = wife;
        this.children = new ArrayList<>();

        if (husband instanceof Individual) {
            ((Individual) husband).setCouple(this);
        }
        if (wife instanceof Individual) {
            ((Individual) wife).setCouple(this);
        }
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Husband: ").append(husband.getInfo()).append("\n");
        info.append("Wife: ").append(wife.getInfo()).append("\n");
        info.append("Children: ");
        for (Person child : children) {
            info.append(child.getInfo()).append(", ");
        }
        return info.toString();
    }
}
