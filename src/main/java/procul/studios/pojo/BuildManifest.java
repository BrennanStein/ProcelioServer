package procul.studios.pojo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BuildManifest {
    public Integer[] version;
    public List<String> ignore;
    public transient File baseDir;
    public void init(){
        if(ignore == null)
            ignore = new ArrayList<>();
        ignore.add("manifest.json");
    }
}