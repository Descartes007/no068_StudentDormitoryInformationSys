package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinleibieView;


/**
 * 物品类别
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface WupinleibieService extends IService<WupinleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinleibieVO> selectListVO(Wrapper<WupinleibieEntity> wrapper);
   	
   	WupinleibieVO selectVO(@Param("ew") Wrapper<WupinleibieEntity> wrapper);
   	
   	List<WupinleibieView> selectListView(Wrapper<WupinleibieEntity> wrapper);
   	
   	WupinleibieView selectView(@Param("ew") Wrapper<WupinleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinleibieEntity> wrapper);
   	
}

