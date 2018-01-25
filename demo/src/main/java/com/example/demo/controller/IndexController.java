package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;








import com.example.demo.entity.one.Customer;
import com.example.demo.entity.two.TblFushuLog;
import com.example.demo.repository.datasourceone.CustomerRepo;
import com.example.demo.repository.datasourcetwo.FushuLogRepo;

import java.util.Iterator;


/**
 * Created by zhanghualong on 2017/11/23.
 */

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    CustomerRepo custRepo;
    
    @Autowired
    FushuLogRepo fuShuLogRepo;
    
    @GetMapping(value = "modify/{id}")
    public ModelAndView modifyForm(@PathVariable("id") String message) {
        return new ModelAndView("messages/list", "message", message);
    }

    @GetMapping(value = "custerList")
    @ResponseBody
    public String getAllList(){
        Iterator<Customer> iterator = custRepo.findAll().iterator();
        int i = 0;
        while (iterator.hasNext()){
        	System.out.println(iterator.next().toString());
            i++;
        }
        System.out.println("=================="+i);
        return "success";
    }

    @GetMapping(value = "custerListTwo")
    @ResponseBody
    public String custerListTwo(){
        Iterator<TblFushuLog> iterator = fuShuLogRepo.findAll().iterator();
        int i = 0;
        while (iterator.hasNext()){
        	System.out.println(iterator.next().toString());
            i++;
        }
        System.out.println("=================="+i);
        return "success";
    }
}
