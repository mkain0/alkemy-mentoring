package foo.api.common.image;

import foo.api.external.DropboxException;

public interface UploadImage {

    String upload(IFile file);

    CloudService getServiceName();

}
