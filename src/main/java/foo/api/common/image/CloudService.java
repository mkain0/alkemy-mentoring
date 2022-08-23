package foo.api.common.image;

import lombok.Getter;

@Getter
public enum CloudService {

    AWS("AWS", "A"),
    GOOGLE("GOOGLE", "B"),
    DROPBOX("DROPBOX", "C");

    private final String serviceName;
    private final String vendor;

    CloudService(String serviceName, String vendor) {
        this.serviceName = serviceName;
        this.vendor = vendor;
    }


}
