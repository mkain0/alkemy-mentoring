package foo.api.common.image;

public class AwsUtils implements UploadImage {

    public String upload(IFile file) {
        // AWS logic
        //.setFileName(UUID.randomUUID().toString())
        //.setFileName(file.getFileName())
        return "url";
    }

    @Override
    public CloudService getServiceName() {
        return CloudService.AWS;
    }

}
