package foo.api.controller;

import foo.api.common.image.CloudService;
import foo.api.common.image.File;
import foo.api.common.image.UploadFile;
import foo.api.model.Product;
import foo.api.model.User;
import java.io.InputStream;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainController {

    private final Map<String, UploadFile> uploadFileServiceByVendor;

    public MainController(List<UploadFile> uploadFiles) {
        uploadFileServiceByVendor = new HashMap<>();
        for (UploadFile uploadFile : uploadFiles) {
            uploadFileServiceByVendor.put(uploadFile.getServiceName().getVendor(), uploadFile);
        }
    }

    @PostMapping(value = "/image")
    public ResponseEntity<?> upload(InputStream inputStream, String contentType) {
        uploadFileServiceByVendor.get(CloudService.DROPBOX.getVendor())
            .upload(new File(contentType, inputStream));

        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/image-base-64-encoded")
    public ResponseEntity<?> upload(String imageBase64Encoded, String contentType) {
        uploadFileServiceByVendor.get(CloudService.DROPBOX.getVendor())
            .upload(new File(contentType, imageBase64Encoded));

        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/user")
    public ResponseEntity<?> add(User user) {
        uploadFileServiceByVendor.get(CloudService.DROPBOX.getVendor()).upload(user);

        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/product")
    public ResponseEntity<?> add(Product product) {
        uploadFileServiceByVendor.get(product.getVendor()).upload(product);

        return ResponseEntity.noContent().build();
    }
}
