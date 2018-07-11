package org.java.web;

import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by 马果 on 2018/7/8.
 */
@Controller
public class InfController {

    @Autowired
    private InfService service;

    @RequestMapping("/load")
    public String load(Model model){
        List<Map<String,Object>> list = service.getList();
        System.out.println("============="+list.size());
        model.addAttribute("list",list);
        return "/show";
    }

}
