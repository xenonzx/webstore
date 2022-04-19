package com.megastores.webstore;

import com.megastores.webstore.config.AppConfigs;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

    @Autowired
    private AppConfigs myBean;

    @GetMapping("/")
    public String welcome() {
        return "welcome to " + myBean.getName();
    }

}
