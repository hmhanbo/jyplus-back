/**
 * @author hanbo
 * @date 2018/8/21 10:56
 */


package com.jys.jyplus.heytea.service;

import com.jys.jyplus.heytea.vo.TeaMenuVo;

public interface TeaMenuService {
    int add(TeaMenuVo o);

    int deleteByTeaId(Integer o);
}
