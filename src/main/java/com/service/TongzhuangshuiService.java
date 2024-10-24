package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhuangshuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhuangshuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhuangshuiView;


/**
 * 桶装水
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface TongzhuangshuiService extends IService<TongzhuangshuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhuangshuiVO> selectListVO(Wrapper<TongzhuangshuiEntity> wrapper);
   	
   	TongzhuangshuiVO selectVO(@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);
   	
   	List<TongzhuangshuiView> selectListView(Wrapper<TongzhuangshuiEntity> wrapper);
   	
   	TongzhuangshuiView selectView(@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhuangshuiEntity> wrapper);
   	
}

