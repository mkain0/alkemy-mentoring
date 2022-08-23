package foo.api.model;

import foo.api.common.IAddress;
import foo.api.common.image.IFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.InputStream;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements IFile, IAddress {

    private String name;
    private String lastName;
    private String email;
    private String address;
    private String postalCode;
    private String city;
    private String country;

    private String photoUrl; // only apply for entity
    private InputStream inputStream;

    @Override
    public String getContentType() {
        return "plain/txt";
    }

    @Override
    public InputStream getContent() {
        return this.inputStream;
    }

}
