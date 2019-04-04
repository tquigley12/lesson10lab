package independentcopy.reader;

import java.io.*;

/**
 * A simple low-level, derived class that demonstrates the capability to read a
 * line of input from a file. Notice this class is derived from the interface
 * <code>Reader</code>, which is an abstraction of these details.
 *
 * @author Jim Lombardo, WCTC Lead Java Instructor
 * @version 1.02
 * @see Driver for run instructions and info about design rules
 * @see DependentCopy project for a poor design
 */
public class FileReader implements Reader {

    private boolean lineReadFlag = false;

    /**
     * Read a line of input from a file
     *
     * @see Reader#readln()
     */
    @Override
    public String readln() {
        File data = new File("data.txt");

        BufferedReader in = null;
        String line = null;

        try {
            if (data.exists()) {
                // make sure we differentiate between java.io.FileReader
                // class and this class (also called FileReader)
                in = new BufferedReader(new java.io.FileReader(data));
                line = in.readLine();
                in.close();
            } else {
                System.out.println("File not found - data.txt");
                line = null;
            }
        } catch (IOException ioe) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe2) {
                System.out.println(ioe2.getMessage());
            }
            System.out.println(ioe.getMessage());
            System.exit(1);  // 1 = signals program end with error
        }

        // ugly hack so we can end the program after reading a line
        if (lineReadFlag) {
            return null;
        } else {
            lineReadFlag = true;
            return line;
        }
    }

    public void method2() {
        System.out.println("not a polymorphic method");
    }

}
