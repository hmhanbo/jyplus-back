/**
 * @author hanbo
 * @date 2018/8/25 17:56
 */

package com.jys.jyplus.trouble.dao;

import com.jys.jyplus.trouble.vo.TroubleBondVo;

import java.util.List;

public interface TroubleBondDao {
    List<TroubleBondVo> select();

    int insert(TroubleBondVo o);

    int deleteById(Integer o);

    int update(TroubleBondVo o);

}
