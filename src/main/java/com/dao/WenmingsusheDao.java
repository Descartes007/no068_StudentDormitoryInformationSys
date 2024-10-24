package com.dao;

import com.entity.WenmingsusheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenmingsusheVO;
import com.entity.view.WenmingsusheView;


/**
 * 文明宿舍
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface WenmingsusheDao extends BaseMapper<WenmingsusheEntity> {
	
	List<WenmingsusheVO> selectListVO(@Param("ew") Wrapper<WenmingsusheEntity> wrapper);
	
	WenmingsusheVO selectVO(@Param("ew") Wrapper<WenmingsusheEntity> wrapper);
	
	List<WenmingsusheView> selectListView(@Param("ew") Wrapper<WenmingsusheEntity> wrapper);

	List<WenmingsusheView> selectListView(Pagination page,@Param("ew") Wrapper<WenmingsusheEntity> wrapper);
	
	WenmingsusheView selectView(@Param("ew") Wrapper<WenmingsusheEntity> wrapper);
	
}
