package com.dao;

import com.entity.WeishengjianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeishengjianchaVO;
import com.entity.view.WeishengjianchaView;


/**
 * 卫生检查
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface WeishengjianchaDao extends BaseMapper<WeishengjianchaEntity> {
	
	List<WeishengjianchaVO> selectListVO(@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);
	
	WeishengjianchaVO selectVO(@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);
	
	List<WeishengjianchaView> selectListView(@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);

	List<WeishengjianchaView> selectListView(Pagination page,@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);
	
	WeishengjianchaView selectView(@Param("ew") Wrapper<WeishengjianchaEntity> wrapper);
	
}
