package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstongzhuangshuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstongzhuangshuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstongzhuangshuiView;


/**
 * 桶装水评论表
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface DiscusstongzhuangshuiService extends IService<DiscusstongzhuangshuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstongzhuangshuiVO> selectListVO(Wrapper<DiscusstongzhuangshuiEntity> wrapper);
   	
   	DiscusstongzhuangshuiVO selectVO(@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);
   	
   	List<DiscusstongzhuangshuiView> selectListView(Wrapper<DiscusstongzhuangshuiEntity> wrapper);
   	
   	DiscusstongzhuangshuiView selectView(@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstongzhuangshuiEntity> wrapper);
   	
}

