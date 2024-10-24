package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaqiliusuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaqiliusuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaqiliusuView;


/**
 * 假期留宿
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface JiaqiliusuService extends IService<JiaqiliusuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaqiliusuVO> selectListVO(Wrapper<JiaqiliusuEntity> wrapper);
   	
   	JiaqiliusuVO selectVO(@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);
   	
   	List<JiaqiliusuView> selectListView(Wrapper<JiaqiliusuEntity> wrapper);
   	
   	JiaqiliusuView selectView(@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaqiliusuEntity> wrapper);
   	
}

