package foo.api.common.image;

import foo.api.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DropboxUtils implements UploadFile {

    public String upload(IFile file) {
        try {
            // Dropbox logic
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            throw new ServiceException("Something goes wrong when uploading file.");
        }
        return "url";
    }

    @Override
    public CloudService getServiceName() {
        return CloudService.DROPBOX;
    }

}
