package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    
    public Lab() {
        this(null);
    }
    
    public Lab(String labName) {
        this.name = labName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setStatus(LabStatus labStatus) {
    }
    
    public LabStatus getStatus() {
        return null;
    }
    
    public int CompareTo(Lab o) {
        return name.compareTo(o.name);
    }
}
