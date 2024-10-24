package com.dao;

import com.entity.DiscussshiwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshiwuxinxiVO;
import com.entity.view.DiscussshiwuxinxiView;


/**
 * 失物信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface DiscussshiwuxinxiDao extends BaseMapper<DiscussshiwuxinxiEntity> {
	
	List<DiscussshiwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);
	
	DiscussshiwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);
	
	List<DiscussshiwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);

	List<DiscussshiwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);
	
	DiscussshiwuxinxiView selectView(@Param("ew") Wrapper<DiscussshiwuxinxiEntity> wrapper);
	
}
