import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Creator {

    private StringBuilder log = new StringBuilder();
    private List<String> floderPaths = new ArrayList<>();
    private List<String> filePaths = new ArrayList<>();

    public void createFolder(String folderPath) {
        File dir = new File(folderPath);
        boolean result = dir.mkdir();
        if (result) {
            log.append("Папка создана: ").append(folderPath).append("\n");
            floderPaths.add(folderPath);
        } else {
            log.append("Папка НЕ создалась: ").append(folderPath).append("\n");
        }

    }

    public void createFile(String filePath) {
        File file = new File(filePath);
        try {
            boolean result = file.createNewFile();

            if (result) {
                log.append("Файл создан: ").append(filePath).append("\n");
                filePaths.add(filePath);
            } else {
                log.append("Файл НЕ создался: ").append(filePath).append("\n");
            }
        } catch (IOException e) {
            log.append("Файл НЕ создался: ").append(filePath).append("\n");
        }
    }

    public void createFilesAndFolders(List<String> folderPaths, List<String> filePaths) {
        for (String folderPath : folderPaths) {
            createFolder(folderPath);
        }
        for (String filePath : filePaths) {
            createFile(filePath);
        }
    }

    public void writeLogToFile() {
        try {
            FileWriter writer = new FileWriter("D://ТЕМП//Games//temp//temp.txt");
            writer.write(log.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}