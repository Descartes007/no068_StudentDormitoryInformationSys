package com.dao;

import com.entity.BaoxiuchuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiuchuliVO;
import com.entity.view.BaoxiuchuliView;


/**
 * 报修处理
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface BaoxiuchuliDao extends BaseMapper<BaoxiuchuliEntity> {
	
	List<BaoxiuchuliVO> selectListVO(@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);
	
	BaoxiuchuliVO selectVO(@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);
	
	List<BaoxiuchuliView> selectListView(@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);

	List<BaoxiuchuliView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);
	
	BaoxiuchuliView selectView(@Param("ew") Wrapper<BaoxiuchuliEntity> wrapper);
	
}
