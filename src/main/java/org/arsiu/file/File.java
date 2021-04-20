package org.arsiu.file;

import org.arsiu.file.FileType;

public class File {
    private final FileType type;
    private final String name;

    public File(FileType type, String name) {
        this.type = type;
        this.name = name;
    }
}
