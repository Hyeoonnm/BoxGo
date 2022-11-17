package kr.ac.kopo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Detail {
    // FK and PK
    private int detailProductId;

    private int detailPrice;
    private int detailSalePrice;

    // 추상 클래스
    public abstract String get(String key);

    /* private String detailCategory;
    private String detailBrand;
    private String detailSize;
    private String detailColor;
    private String detailContents; */
}
