package com.dao;

import com.entity.ZhaolingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaolingxinxiVO;
import com.entity.view.ZhaolingxinxiView;


/**
 * 招领信息
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface ZhaolingxinxiDao extends BaseMapper<ZhaolingxinxiEntity> {
	
	List<ZhaolingxinxiVO> selectListVO(@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);
	
	ZhaolingxinxiVO selectVO(@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);
	
	List<ZhaolingxinxiView> selectListView(@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);

	List<ZhaolingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);
	
	ZhaolingxinxiView selectView(@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);
	
}
