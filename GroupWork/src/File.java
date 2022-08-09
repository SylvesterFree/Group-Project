import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class File {
    private int size = 0;
    private String filename = "C:\\Users\\freeman\\IdeaProjects\\GroupWork\\res\\input3.txt";;

    public List<String> getInput(){
        List<String> inputs = new ArrayList<>();
        try{
            try(Stream<String> lines = Files.lines(Path.of(filename))){
                inputs = lines.collect(Collectors.toList());
            }
        }catch (IOException e){
            System.out.println("Unable to locate file");
        }
        this.size = inputs.size();
        return inputs;
    }

    public int getSize() {
        return size;
    }

    public void setFile(String filename)
    {
        this.filename = filename;
    }
}
