package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenmingsusheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenmingsusheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenmingsusheView;


/**
 * 文明宿舍
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface WenmingsusheService extends IService<WenmingsusheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenmingsusheVO> selectListVO(Wrapper<WenmingsusheEntity> wrapper);
   	
   	WenmingsusheVO selectVO(@Param("ew") Wrapper<WenmingsusheEntity> wrapper);
   	
   	List<WenmingsusheView> selectListView(Wrapper<WenmingsusheEntity> wrapper);
   	
   	WenmingsusheView selectView(@Param("ew") Wrapper<WenmingsusheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenmingsusheEntity> wrapper);
   	
}

