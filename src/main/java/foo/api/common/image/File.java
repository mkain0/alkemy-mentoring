package foo.api.common.image;

import java.io.InputStream;

public class File implements IFile {

    private String contentType;
    private InputStream inputStream;
    private String fileName;

    public File(String contentType, String imageBase64Encoded) {
        this(contentType, getInput(imageBase64Encoded));
    }

    private static InputStream getInput(String imageBase64Encoded) {
        // processing String > InputStream
        return null;
    }

    public File(String contentType, InputStream inputStream) {
        this.contentType = contentType;
        this.inputStream = inputStream;
    }


    @Override
    public String getContentType() {
        return this.contentType;
    }

    @Override
    public InputStream getContent() {
        return this.inputStream;
    }
}
