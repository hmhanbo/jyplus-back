/**
 * @author hanbo
 * @date 2018/8/21 14:11
 */

package com.jys.jyplus.heytea.controller;


import com.jys.jyplus.heytea.service.TeaMenuService;
import com.jys.jyplus.heytea.vo.TeaMenuVo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/heytea")
public class TeaMenuController {

    @Autowired
    private TeaMenuService TeaMenuService;

    @ResponseBody
    @PostMapping("/add")
    public int add(@RequestBody TeaMenuVo o){
        return TeaMenuService.add(o);
    }

//    http://localhost:8080/heytea/deleteByTeaId/1005
    @ResponseBody
    @GetMapping("/deleteByTeaId/{teaId}")
    public int deleteByTeaId(@PathVariable("teaId") Integer o){
        return TeaMenuService.deleteByTeaId(o);
    }

}
