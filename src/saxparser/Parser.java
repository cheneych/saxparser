package saxparser;

import java.util.ArrayList;

public class Parser {
    private ArrayList<Element> elements;
    
    public Parser() {
        elements = new ArrayList<>();
    }
    
    public ArrayList<Element> getElements() {
        return elements;
    }
    
    public void addElement(Element element) {
        elements.add(element);
    }
}
