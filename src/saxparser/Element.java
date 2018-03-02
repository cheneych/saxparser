package saxparser;
import java.util.HashMap;

public class Element {
    private String tag;
    private String value;
    HashMap<String, String> attr;
    
    public Element() {
        
    }
    
    public Element(String tag, HashMap<String, String> attr, String value) {
        this.tag = tag;
        this.value = value;
        this.attr = attr;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public void setAttr(HashMap<String, String> attr) {
        this.attr = attr;
    }

    
    public String getTag() {
        return tag;
    }
    
    public HashMap<String, String> getAttr(){
        return attr;
    }
    
    public String getValue() {
        return value;
    }
    
}
