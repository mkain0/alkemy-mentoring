package foo.api.common.image;

public class GoogleUtils implements UploadFile {

    public String upload(IFile file) {
        // Google logic
        return "url";
    }

    @Override
    public CloudService getServiceName() {
        return CloudService.GOOGLE;
    }

}
