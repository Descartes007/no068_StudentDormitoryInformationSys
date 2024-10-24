package com.dao;

import com.entity.WeixiurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiurenyuanVO;
import com.entity.view.WeixiurenyuanView;


/**
 * 维修人员
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface WeixiurenyuanDao extends BaseMapper<WeixiurenyuanEntity> {
	
	List<WeixiurenyuanVO> selectListVO(@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);
	
	WeixiurenyuanVO selectVO(@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);
	
	List<WeixiurenyuanView> selectListView(@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);

	List<WeixiurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);
	
	WeixiurenyuanView selectView(@Param("ew") Wrapper<WeixiurenyuanEntity> wrapper);
	
}
