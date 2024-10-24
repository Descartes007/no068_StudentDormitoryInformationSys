package com.dao;

import com.entity.TongzhuangshuipinpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhuangshuipinpaiVO;
import com.entity.view.TongzhuangshuipinpaiView;


/**
 * 桶装水品牌
 * 
 * @author 
 * @email 
 * @date 2021-05-06 16:19:28
 */
public interface TongzhuangshuipinpaiDao extends BaseMapper<TongzhuangshuipinpaiEntity> {
	
	List<TongzhuangshuipinpaiVO> selectListVO(@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);
	
	TongzhuangshuipinpaiVO selectVO(@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);
	
	List<TongzhuangshuipinpaiView> selectListView(@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);

	List<TongzhuangshuipinpaiView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);
	
	TongzhuangshuipinpaiView selectView(@Param("ew") Wrapper<TongzhuangshuipinpaiEntity> wrapper);
	
}
