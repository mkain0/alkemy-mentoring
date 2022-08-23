package foo.api.common.image;

public class GoogleUtils implements UploadImage {

    public String upload(IFile file) {
        // Google logic
        return "url";
    }

    @Override
    public CloudService getServiceName() {
        return CloudService.GOOGLE;
    }

}
