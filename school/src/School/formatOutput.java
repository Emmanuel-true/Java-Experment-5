package School;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class formatOutput {
    public static void main(String[] args) {
        Student str1 = new Student("emmanuel", 2020322091,21, "man", "软件技术");
        try(FileReader reader = new FileReader("noComma.txt");
            FileWriter writer = new FileWriter("school.txt")
        ){
            StringBuffer sb = new StringBuffer();
            char[] cs = new char[14];
            while ((reader.read(cs)) != -1) {
                sb.append(cs , 0, 7);
                sb.append(", ");
                sb.append(cs, 7, 7);
                sb.append("。 "+"\n");
            }
            System.out.println(sb);
            writer.write(str1.toString());
            writer.write("\n");
            writer.write(new String(sb));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

