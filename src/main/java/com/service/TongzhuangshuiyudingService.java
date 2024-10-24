package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhuangshuiyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhuangshuiyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhuangshuiyudingView;


/**
 * 桶装水预订
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface TongzhuangshuiyudingService extends IService<TongzhuangshuiyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhuangshuiyudingVO> selectListVO(Wrapper<TongzhuangshuiyudingEntity> wrapper);
   	
   	TongzhuangshuiyudingVO selectVO(@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);
   	
   	List<TongzhuangshuiyudingView> selectListView(Wrapper<TongzhuangshuiyudingEntity> wrapper);
   	
   	TongzhuangshuiyudingView selectView(@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhuangshuiyudingEntity> wrapper);
   	
}

