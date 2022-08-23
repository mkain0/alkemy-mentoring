package foo.api.common.image;

public interface UploadFile {

    String upload(IFile file);

    CloudService getServiceName();

}
