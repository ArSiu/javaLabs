package org.arsiu.file;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class File {
    private FileType type;
    private String name;

    public File(final FileType fileType, final String fileName) {
        type = fileType;
        setName(fileName);
    }

}
