package org.arsiu.file;

public class File {
    private FileType type;
    private String name;

    public File(final FileType fileType, final String fileName) {
        type = fileType;
        name = fileName;
    }
}
