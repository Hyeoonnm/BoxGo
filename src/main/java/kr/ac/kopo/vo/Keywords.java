package kr.ac.kopo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Keywords {

    private int keywordsId;

    /* Domain FK */
    private int keywordsDomainId;
    private String keywordsName;

    /* Domain */
    private String domainName;
    private String domainCaption;


    public Keywords() {
    }

    public Keywords(int keywordsId, int keywordsDomainId) {
        this.keywordsId = keywordsId;
        this.keywordsDomainId = keywordsDomainId;
    }
}
