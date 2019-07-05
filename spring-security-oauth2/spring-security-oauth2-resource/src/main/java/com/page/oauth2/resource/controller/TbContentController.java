package com.page.oauth2.resource.controller;

import com.page.oauth2.resource.config.Result;
import com.page.oauth2.resource.domain.TbContent;
import com.page.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    /**
     * 获取全部资源
     *
     * @return
     */
    @GetMapping("/")
    public Result<List<TbContent>> selectAll() {
        return new Result<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContentService.selectAll());
    }
}
