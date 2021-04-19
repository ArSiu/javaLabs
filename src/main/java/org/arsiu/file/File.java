package org.arsiu.file;
import org.arsiu.file.FileType.FILETYPE;

public class File {
    public FILETYPE type;
    public String name;

    public File(FILETYPE type, String name) {
        this.type = type;
        this.name = name;
    }

}
