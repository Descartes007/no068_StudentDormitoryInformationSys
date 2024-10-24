package com.dao;

import com.entity.DiscusszhaolingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhaolingxinxiVO;
import com.entity.view.DiscusszhaolingxinxiView;


/**
 * 招领信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface DiscusszhaolingxinxiDao extends BaseMapper<DiscusszhaolingxinxiEntity> {
	
	List<DiscusszhaolingxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);
	
	DiscusszhaolingxinxiVO selectVO(@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);
	
	List<DiscusszhaolingxinxiView> selectListView(@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);

	List<DiscusszhaolingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);
	
	DiscusszhaolingxinxiView selectView(@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);
	
}
