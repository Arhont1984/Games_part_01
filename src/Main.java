import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Creator creator = new Creator();
        creator.createFolder("D://ТЕМП//Games");

        List<String> folders = Arrays.asList(
                "D://ТЕМП//Games//src", "D://ТЕМП//Games//res", "D://ТЕМП//Games//savegames", "D://ТЕМП//Games//temp",
                "D://ТЕМП//Games//src//main", "D://ТЕМП//Games//src//test",
                "D://ТЕМП//Games//res//drawables", "D://ТЕМП//Games//res//vectors", "D://ТЕМП//Games//res//icons");

        List<String> files = Arrays.asList("D://ТЕМП//Games//src//main//Main.java", "D://ТЕМП//Games//src//main//Utils.java","D://ТЕМП//Games//temp//temp.txt");

        creator.createFilesAndFolders(folders, files);
        creator.writeLogToFile();

    }

}

