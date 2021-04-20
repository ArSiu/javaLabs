package org.arsiu.file;

import org.arsiu.file.FileType.FILETYPE;

public class File {
    private final FILETYPE type;
    private final String name;

    public File(FILETYPE type, String name) {
        this.type = type;
        this.name = name;
    }
}
