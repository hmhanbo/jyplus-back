/**
 * @author hanbo
 * @date 2018/8/25 17:53
 */

package com.jys.jyplus.trouble.service.impl;

import com.jys.jyplus.trouble.dao.TroubleBondDao;
import com.jys.jyplus.trouble.service.TroubleBondService;
import com.jys.jyplus.trouble.vo.TroubleBondVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "TroubleBondService")
public class TroubleBondServiceImpl implements TroubleBondService {

    @Autowired
    private TroubleBondDao TroubleBondDao;

    @Override
    public List<TroubleBondVo> findAll(){
        return TroubleBondDao.select();
    }

    @Override
    public int add(TroubleBondVo o){
        return TroubleBondDao.insert(o);
    }

    @Override
    public int delete(Integer o){
        return TroubleBondDao.deleteById(o);
    }

    @Override
    public int update(TroubleBondVo o){
        return TroubleBondDao.update(o);
    }
}
