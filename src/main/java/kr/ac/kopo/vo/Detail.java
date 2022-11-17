package kr.ac.kopo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Detail {
    // FK and PK
    private int detailProductId;

    public abstract String get(String Key);

    private String detailCategory;
    private String detailBrand;
    private String detailSize;
    private String detailColor;
    private int detailPrice;
    private int detailSalePrice;
    private String detailContents;
}
