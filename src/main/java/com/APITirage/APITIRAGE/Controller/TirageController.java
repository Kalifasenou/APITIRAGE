package com.APITirage.APITIRAGE.Controller;

import com.APITirage.APITIRAGE.Services.TirageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TirageController {
    @Autowired
    TirageServiceImpl tirageServiceImpl;
    @GetMapping(value = "/tirer/{id}")
    Iterable<Object[]> tirerAleatoirement(@PathVariable long id) {
        return tirageServiceImpl.tirerAleatoirement(id);
    }
}
