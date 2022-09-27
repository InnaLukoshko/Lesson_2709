import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class General {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream("");
        InputStreamReader ipsr = new InputStreamReader(fileReader, StandardCharsets.UTF_8));
        BufferedReader bufferedReader = new BufferedReader(ipsr);
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(System.getProperty("user.dir") + File.separator, "users.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Петя");
        fileWriter.close();

        FileReader fileReader1 = new FileReader(file);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        System.out.println(bufferedReader1.readLine());
        fileReader1.close();

//        Files.copy(Path.get(file.getAbsolutePath()), Path.get(file.getAbsolutePath()));

//        2 var
//        FileReader fileReader1 = new
//        fileReader1.read
    }
    public  static void addName() {

    }
}
