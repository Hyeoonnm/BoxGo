package kr.ac.kopo.pager;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class KeywordsPager extends Pager{
    private int keywordsDomainId;

    public KeywordsPager() {
    }

    public KeywordsPager(int keywordsDomainId) {
        this.keywordsDomainId = keywordsDomainId;
    }
}
