package com.dao;

import com.entity.TongzhuangshuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhuangshuiVO;
import com.entity.view.TongzhuangshuiView;


/**
 * 桶装水
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface TongzhuangshuiDao extends BaseMapper<TongzhuangshuiEntity> {
	
	List<TongzhuangshuiVO> selectListVO(@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);
	
	TongzhuangshuiVO selectVO(@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);
	
	List<TongzhuangshuiView> selectListView(@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);

	List<TongzhuangshuiView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);
	
	TongzhuangshuiView selectView(@Param("ew") Wrapper<TongzhuangshuiEntity> wrapper);
	
}
