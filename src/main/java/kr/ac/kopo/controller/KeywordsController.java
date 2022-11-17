package kr.ac.kopo.controller;

import kr.ac.kopo.pager.KeywordsPager;
import kr.ac.kopo.service.KeywordsService;
import kr.ac.kopo.vo.Keywords;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/keywords/{keywordsDomainId}")
public class KeywordsController {

    private final KeywordsService keywordsService;

    @GetMapping("/list")
    public String list(@PathVariable int keywordsDomainId, Model model, @ModelAttribute("pager") KeywordsPager pager) {

        pager.setKeywordsDomainId(keywordsDomainId);

        List<Keywords> keywords = keywordsService.list(pager);

        model.addAttribute("keywords", keywords);

        return "keywords/list";
    }

    @GetMapping("/add")
    public String add() {
        return "keywords/add";
    }

    @PostMapping("/add")
    public String add(@PathVariable int keywordsDomainId, Keywords keywords) {

        keywords.setKeywordsDomainId(keywordsDomainId);

        keywordsService.add(keywords);

        return "redirect:list";
    }

    @GetMapping("/delete/{keywordsId}")
    public String delete(@PathVariable int keywordsId, @PathVariable int keywordsDomainId) {

        keywordsService.delete(new Keywords(keywordsId, keywordsDomainId));

        return "redirect:../list";
    }

    @GetMapping("/update/{keywordsId}")
    public String update(@PathVariable int keywordsId, @PathVariable int keywordsDomainId, Model model) {

        Keywords keywords = keywordsService.item(new Keywords(keywordsId, keywordsDomainId));

        model. addAttribute("keywords", keywords);

        return "keywords/update";
    }

    @PostMapping("/update/{keywordsId}")
    public String update(@PathVariable int keywordsId, @PathVariable int keywordsDomainId, Keywords keywords) {

        keywords.setKeywordsDomainId(keywordsDomainId);
        keywords.setKeywordsId(keywordsId);

        keywordsService.update(keywords);

        return "redirect:../list";
    }
}
