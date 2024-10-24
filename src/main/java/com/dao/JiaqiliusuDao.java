package com.dao;

import com.entity.JiaqiliusuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaqiliusuVO;
import com.entity.view.JiaqiliusuView;


/**
 * 假期留宿
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface JiaqiliusuDao extends BaseMapper<JiaqiliusuEntity> {
	
	List<JiaqiliusuVO> selectListVO(@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);
	
	JiaqiliusuVO selectVO(@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);
	
	List<JiaqiliusuView> selectListView(@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);

	List<JiaqiliusuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);
	
	JiaqiliusuView selectView(@Param("ew") Wrapper<JiaqiliusuEntity> wrapper);
	
}
