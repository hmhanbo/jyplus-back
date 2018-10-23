/**
 * @author hanbo
 * @date 2018/9/19 19:54
 */

package com.jys.jyplus.wiki.dao;

import com.jys.jyplus.wiki.vo.WikiVo;

import java.util.List;

public interface WikiDao {
    List<WikiVo> selectById(Integer o);

    List<WikiVo> selectAll();

    int insert(WikiVo o);

    int delete(Integer o);

    int update(WikiVo o);

}
