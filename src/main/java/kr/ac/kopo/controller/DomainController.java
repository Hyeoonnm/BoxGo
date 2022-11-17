package kr.ac.kopo.controller;

import kr.ac.kopo.pager.Pager;
import kr.ac.kopo.service.DomainService;
import kr.ac.kopo.vo.Domain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/domain")
public class DomainController {

    private final DomainService domainService;

    @GetMapping("/list")
    public String list(Model model, Pager pager) {

        List<Domain> domain = domainService.list(pager);

        model.addAttribute("domain", domain);

        return "domain/list";
    }

    @GetMapping("/add")
    public String add() {
        return "domain/add";
    }

    @PostMapping("/add")
    public String add(Domain domain) {

        domainService.add(domain);

        return "redirect:list";
    }

    @GetMapping("/delete/{domainId}")
    public String delete(@PathVariable int domainId) {

        domainService.delete(domainId);

        return "redirect:../list";
    }

    @GetMapping("/update/{domainId}")
    public String update(@PathVariable int domainId, Model model) {

        Domain domain = domainService.item(domainId);

        model.addAttribute(domain);

        return "domain/update";
    }

    @PostMapping("/update/{domainId}")
    public String update(@PathVariable int domainId, Domain domain) {

        domain.setDomainId(domainId);

        domainService.update(domain);

        return "redirect:../list";
    }

}
