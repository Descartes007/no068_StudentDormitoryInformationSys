package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiurenyuanView;


/**
 * 维修人员
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface WeixiurenyuanService extends IService<WeixiurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiurenyuanVO> selectListVO(Wrapper<WeixiurenyuanEntity> wrapper);
   	
   	WeixiurenyuanVO selectVO(@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);
   	
   	List<WeixiurenyuanView> selectListView(Wrapper<WeixiurenyuanEntity> wrapper);
   	
   	WeixiurenyuanView selectView(@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiurenyuanEntity> wrapper);
   	
}

