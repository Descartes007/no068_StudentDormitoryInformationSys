package com.dao;

import com.entity.DiscusstongzhuangshuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstongzhuangshuiVO;
import com.entity.view.DiscusstongzhuangshuiView;


/**
 * 桶装水评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface DiscusstongzhuangshuiDao extends BaseMapper<DiscusstongzhuangshuiEntity> {
	
	List<DiscusstongzhuangshuiVO> selectListVO(@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);
	
	DiscusstongzhuangshuiVO selectVO(@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);
	
	List<DiscusstongzhuangshuiView> selectListView(@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);

	List<DiscusstongzhuangshuiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);
	
	DiscusstongzhuangshuiView selectView(@Param("ew") Wrapper<DiscusstongzhuangshuiEntity> wrapper);
	
}
