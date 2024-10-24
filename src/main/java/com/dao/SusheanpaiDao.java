package com.dao;

import com.entity.SusheanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheanpaiVO;
import com.entity.view.SusheanpaiView;


/**
 * 宿舍安排
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface SusheanpaiDao extends BaseMapper<SusheanpaiEntity> {
	
	List<SusheanpaiVO> selectListVO(@Param("ew") Wrapper<SusheanpaiEntity> wrapper);
	
	SusheanpaiVO selectVO(@Param("ew") Wrapper<SusheanpaiEntity> wrapper);
	
	List<SusheanpaiView> selectListView(@Param("ew") Wrapper<SusheanpaiEntity> wrapper);

	List<SusheanpaiView> selectListView(Pagination page,@Param("ew") Wrapper<SusheanpaiEntity> wrapper);
	
	SusheanpaiView selectView(@Param("ew") Wrapper<SusheanpaiEntity> wrapper);
	
}
