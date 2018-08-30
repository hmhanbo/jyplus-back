/**
 * @author hanbo
 * @date 2018/8/21 13:59
 */

package com.jys.jyplus.heytea.service.impl;

import com.jys.jyplus.heytea.service.TeaMenuService;
import com.jys.jyplus.heytea.vo.TeaMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "TeaMenuService")
public class TeaMenuServiceImpl implements TeaMenuService {


    @Autowired
    private com.jys.jyplus.heytea.dao.TeaMenuDao TeaMenuDao;

    @Override
    public int add(TeaMenuVo o){
        return TeaMenuDao.insert(o);
    };

    @Override
    public int deleteByTeaId(Integer o){
        return TeaMenuDao.deleteByTeaId(o);
    };


}

