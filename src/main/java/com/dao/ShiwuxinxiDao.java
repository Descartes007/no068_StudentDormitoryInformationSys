package com.dao;

import com.entity.ShiwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuxinxiVO;
import com.entity.view.ShiwuxinxiView;


/**
 * 失物信息
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface ShiwuxinxiDao extends BaseMapper<ShiwuxinxiEntity> {
	
	List<ShiwuxinxiVO> selectListVO(@Param("ew") Wrapper<ShiwuxinxiEntity> wrapper);
	
	ShiwuxinxiVO selectVO(@Param("ew") Wrapper<ShiwuxinxiEntity> wrapper);
	
	List<ShiwuxinxiView> selectListView(@Param("ew") Wrapper<ShiwuxinxiEntity> wrapper);

	List<ShiwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuxinxiEntity> wrapper);
	
	ShiwuxinxiView selectView(@Param("ew") Wrapper<ShiwuxinxiEntity> wrapper);
	
}
