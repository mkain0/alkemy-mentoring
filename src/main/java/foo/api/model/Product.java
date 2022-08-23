package foo.api.model;

import foo.api.common.image.IFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.InputStream;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements IFile {

    private String vendor;
    private String description;
    private Integer stock;
    private BigDecimal price;

    private String imageUrl; // only apply for entity
    private InputStream inputStream;

    @Override
    public String getContentType() {
        return "image/jpg";
    }

    @Override
    public InputStream getContent() {
        return this.inputStream;
    }

}
