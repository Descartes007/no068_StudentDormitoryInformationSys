package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TongzhuangshuiyudingDao;
import com.entity.TongzhuangshuiyudingEntity;
import com.service.TongzhuangshuiyudingService;
import com.entity.vo.TongzhuangshuiyudingVO;
import com.entity.view.TongzhuangshuiyudingView;

@Service("tongzhuangshuiyudingService")
public class TongzhuangshuiyudingServiceImpl extends ServiceImpl<TongzhuangshuiyudingDao, TongzhuangshuiyudingEntity> implements TongzhuangshuiyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhuangshuiyudingEntity> page = this.selectPage(
                new Query<TongzhuangshuiyudingEntity>(params).getPage(),
                new EntityWrapper<TongzhuangshuiyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhuangshuiyudingEntity> wrapper) {
		  Page<TongzhuangshuiyudingView> page =new Query<TongzhuangshuiyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhuangshuiyudingVO> selectListVO(Wrapper<TongzhuangshuiyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhuangshuiyudingVO selectVO(Wrapper<TongzhuangshuiyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhuangshuiyudingView> selectListView(Wrapper<TongzhuangshuiyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhuangshuiyudingView selectView(Wrapper<TongzhuangshuiyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
