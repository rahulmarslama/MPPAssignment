package Lab13.prob2;

import java.util.ArrayList;
import java.util.List;

public class Group<T> {
    private T specialElement;
    private List<T> elements;

    public Group(T specialElement, List<T> elements) {
        this.specialElement = specialElement;
        this.elements = new ArrayList<>(elements);
    }

    public T getSpecialElement() {
        return specialElement;
    }

    public List<T> getElements() {
        return elements;
    }

    public static Group<?> copy(Group<?> group) {
        return copyHelper(group);
    }

    private static <T> Group<T> copyHelper(Group<T> group) {
        T specialElement = group.getSpecialElement();
        List<T> elements = group.getElements();
        return new Group<T>(specialElement, elements);
    }

    @Override
    public String toString() {
        return "Group{special=" + specialElement + ", elements=" + elements + "}";
    }
}
