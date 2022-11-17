package kr.ac.kopo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobileDetail extends Detail {

    private String detailCategory;
    private String detailBrand;
    private String detailSize;
    private String detailColor;

    @Override
    public String get(String key) {
        if ("detailCategory".equals(key))
            return detailCategory;

        else if ("detailBrand".equals(key))
            return detailBrand;

        else if ("detailSize".equals(key))
            return detailSize;

        else if ("detailColor".equals(key))
            return detailColor;

        return null;
    }
}
