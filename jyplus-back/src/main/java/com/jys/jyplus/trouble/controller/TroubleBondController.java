/**
 * @author hanbo
 * @date 2018/8/25 19:19
 */

package com.jys.jyplus.trouble.controller;

import com.jys.jyplus.trouble.vo.TroubleBondVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.jys.jyplus.trouble.service.TroubleBondService;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/trouble-bond")
public class TroubleBondController {

    @Autowired
    private TroubleBondService TroubleBondService;

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public List<TroubleBondVo> select(){
        return TroubleBondService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int insert(@RequestBody TroubleBondVo o){
        return TroubleBondService.add(o);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public int deleteById(@RequestParam("troubleId") Integer o){
        return TroubleBondService.delete(o);
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int update(@RequestBody TroubleBondVo o){
        return TroubleBondService.update(o);
    }
}