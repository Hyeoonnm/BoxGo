package kr.ac.kopo.controller;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.service.ProductService;
import kr.ac.kopo.vo.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("list")
    public String list(Model model, Pager pager) {

        List<Product> product = productService.list(pager);

        model.addAttribute("product", product);

        return "product/list";
    }

    @GetMapping("/add")
    public String add() {
        return "product/add";
    }

    @PostMapping("/add")
    public String add(Product product) {

        productService.add(product);

        return "redirect:list";
    }

    @GetMapping("/delete/{productId}")
    public String delete(@PathVariable int productId) {

        productService.delete(productId);

        return "redirect:../list";
    }

    @GetMapping("/update/{productId}")
    public String update(@PathVariable int productId, Model model) {

        Product product = productService.item(productId);

        model.addAttribute("product", product);

        return "product/update";
    }

    @PostMapping("/update/{productId}")
    public String update(@PathVariable int productId, Product product) {

        productService.update(product);

        return "redirect:../list";
    }

}
