package com.dao;

import com.entity.TongzhuangshuiyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhuangshuiyudingVO;
import com.entity.view.TongzhuangshuiyudingView;


/**
 * 桶装水预订
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface TongzhuangshuiyudingDao extends BaseMapper<TongzhuangshuiyudingEntity> {
	
	List<TongzhuangshuiyudingVO> selectListVO(@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);
	
	TongzhuangshuiyudingVO selectVO(@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);
	
	List<TongzhuangshuiyudingView> selectListView(@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);

	List<TongzhuangshuiyudingView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);
	
	TongzhuangshuiyudingView selectView(@Param("ew") Wrapper<TongzhuangshuiyudingEntity> wrapper);
	
}
