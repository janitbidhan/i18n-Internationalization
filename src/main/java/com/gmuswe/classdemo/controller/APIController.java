package com.gmuswe.classdemo.controller;

import com.gmuswe.classdemo.model.LanguageData;
import com.gmuswe.classdemo.service.I18NService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/i18n")
public class APIController {
    @Autowired
    I18NService service;

    @RequestMapping(value = "/english", method = RequestMethod.GET)
    public List<LanguageData> getAllEnglish() {
        return service.getAllLanguageData("EN");
    }
    @RequestMapping(value = "/spanish", method = RequestMethod.GET)
    public List<LanguageData> getAllSpanish() {
        return service.getAllLanguageData("ES");
    }

}
