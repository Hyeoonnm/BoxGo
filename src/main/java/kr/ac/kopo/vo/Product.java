package kr.ac.kopo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    private int productId;
    private String productName;
    private String productBarcode;

    private Detail productDetail;
}
