/**
 * @author hanbo
 * @date 2018/9/19 19:55
 */

package com.jys.jyplus.wiki.service.impl;

import com.jys.jyplus.wiki.dao.WikiDao;
import com.jys.jyplus.wiki.service.WikiService;
import com.jys.jyplus.wiki.vo.WikiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "WikiService")
public class WikiServiceImpl implements WikiService {

    @Autowired
    private WikiDao WikiDao;

    @Override
    public List<WikiVo> selectById(Integer o){
        return WikiDao.selectById(o);
    }

    @Override
    public List<WikiVo> selectAll(){
        return WikiDao.selectAll();
    }


    @Override
    public int add(WikiVo o){
        return WikiDao.insert(o);
    }

    @Override
    public int delete(String o){
        return WikiDao.delete(o);
    }

    @Override
    public int update(WikiVo o){
        return WikiDao.update(o);
    }
}
