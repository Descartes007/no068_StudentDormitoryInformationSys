package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhuangshuipinpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhuangshuipinpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhuangshuipinpaiView;


/**
 * 桶装水品牌
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface TongzhuangshuipinpaiService extends IService<TongzhuangshuipinpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhuangshuipinpaiVO> selectListVO(Wrapper<TongzhuangshuipinpaiEntity> wrapper);
   	
   	TongzhuangshuipinpaiVO selectVO(@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);
   	
   	List<TongzhuangshuipinpaiView> selectListView(Wrapper<TongzhuangshuipinpaiEntity> wrapper);
   	
   	TongzhuangshuipinpaiView selectView(@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhuangshuipinpaiEntity> wrapper);
   	
}

