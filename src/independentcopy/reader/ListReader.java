package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tquigley1
 * 
 * This class is used to read data from a list.
 */
public class ListReader implements Reader {
    
    private final List<String> listReader;
    
    public ListReader() {
        listReader = new ArrayList<>();
        listReader.add("list input text");
    }
    
    @Override
    public String readln() {        
        return this.listReader.get(0);
    }
    
}
