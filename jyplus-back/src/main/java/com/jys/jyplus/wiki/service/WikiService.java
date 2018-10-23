/**
 * @author hanbo
 * @date 2018/9/19 19:55
 */

package com.jys.jyplus.wiki.service;

import com.jys.jyplus.wiki.vo.WikiVo;

import java.util.List;

public interface WikiService {

    List<WikiVo> selectById(Integer o);

    List<WikiVo> selectAll();

    int add(WikiVo o);

    int delete(Integer o);

    int update(WikiVo o);
}
