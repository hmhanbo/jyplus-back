/**
 * @author hanbo
 * @date 2018/9/19 19:54
 */

package com.jys.jyplus.wiki.controller;

import com.jys.jyplus.wiki.service.WikiService;
import com.jys.jyplus.wiki.vo.WikiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/wiki")
public class WikiController {

    @Autowired
    private WikiService WikiService;

//    @ResponseBody
//    @RequestMapping(value = "/{id}")
//    public List<WikiVo> selectById(@PathVariable("id") Integer o){
//       return WikiService.selectById(o);
////        request.getQueryString()
//
//    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<WikiVo> selectAll(){
        return WikiService.selectAll();
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int insert(@RequestBody WikiVo o){
        return WikiService.add(o);
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public int deleteById(@RequestParam("wikiId") Integer o){
        return WikiService.delete(o);
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int update(@RequestBody WikiVo o){
        return WikiService.update(o);
    }
}
