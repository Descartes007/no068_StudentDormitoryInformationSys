package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheanpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheanpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheanpaiView;


/**
 * 宿舍安排
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface SusheanpaiService extends IService<SusheanpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheanpaiVO> selectListVO(Wrapper<SusheanpaiEntity> wrapper);
   	
   	SusheanpaiVO selectVO(@Param("ew") Wrapper<SusheanpaiEntity> wrapper);
   	
   	List<SusheanpaiView> selectListView(Wrapper<SusheanpaiEntity> wrapper);
   	
   	SusheanpaiView selectView(@Param("ew") Wrapper<SusheanpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheanpaiEntity> wrapper);
   	
}

