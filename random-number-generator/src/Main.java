import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Long min = 100000000000L;
        Long max = 999999999999L;
        List<Long> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            long l = (long) ((Math.random() * ((max - min) + 1)) + min);
            randomNumbers.add(l);
            System.out.println(l);
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");

            for (Long l : randomNumbers) {
                writer.write(l + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
