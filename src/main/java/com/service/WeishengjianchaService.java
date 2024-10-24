package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengjianchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeishengjianchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeishengjianchaView;


/**
 * 卫生检查
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface WeishengjianchaService extends IService<WeishengjianchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeishengjianchaVO> selectListVO(Wrapper<WeishengjianchaEntity> wrapper);
   	
   	WeishengjianchaVO selectVO(@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);
   	
   	List<WeishengjianchaView> selectListView(Wrapper<WeishengjianchaEntity> wrapper);
   	
   	WeishengjianchaView selectView(@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeishengjianchaEntity> wrapper);
   	
}

