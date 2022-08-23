package foo.api.common.image;

import java.io.InputStream;

public interface IFile {

    String getContentType();

    InputStream getContent();

}
