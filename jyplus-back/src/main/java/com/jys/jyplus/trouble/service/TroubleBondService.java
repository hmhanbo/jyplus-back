/**
 * @author hanbo
 * @date 2018/8/25 17:30
 */

package com.jys.jyplus.trouble.service;

import com.jys.jyplus.trouble.vo.TroubleBondVo;

import java.util.List;

public interface TroubleBondService {

    List<TroubleBondVo> findAll();

    int add(TroubleBondVo o);

    int delete(Integer o);

    int update(TroubleBondVo o);
}
