package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tquigley1
 * 
 * This class is used to write to a List.
 */
public class ListWriter implements Writer {
    
    private final List<String> listReader;
    
    public ListWriter() {
        listReader = new ArrayList<>();
    }
    
    @Override
    public void writeln(String line) {
        this.listReader.add(line);
        System.out.println("Here is the text you entered, which I've copied below.");
        System.out.println(this.listReader.get(0));
    }
}
