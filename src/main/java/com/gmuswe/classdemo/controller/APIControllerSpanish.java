package com.gmuswe.classdemo.controller;

import com.gmuswe.classdemo.model.LanguageData;
import com.gmuswe.classdemo.service.I18NService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/i18n/spanish")
public class APIControllerSpanish {
    @Autowired
    I18NService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LanguageData getPairSpanish(@PathVariable String id) {
        return service.getLanguageData(id, "ES");
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void addLanguagePairs(@RequestBody LanguageData data) {
        service.insertLanguageData(data);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateLanguagePair(@RequestBody LanguageData data) {
        service.updateLanguageData(data);
    }
}
