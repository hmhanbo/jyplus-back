/**
 * @author hanbo
 * @date 2018/8/21 10:26
 */

package com.jys.jyplus.heytea.dao;

import com.jys.jyplus.heytea.vo.TeaMenuVo;
import java.util.List;

public interface TeaMenuDao {

    int insert(TeaMenuVo o);


    int deleteByTeaId(Integer o);


    List<TeaMenuVo> selectUsers();

}
