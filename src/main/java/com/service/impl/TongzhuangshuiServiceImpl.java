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


import com.dao.TongzhuangshuiDao;
import com.entity.TongzhuangshuiEntity;
import com.service.TongzhuangshuiService;
import com.entity.vo.TongzhuangshuiVO;
import com.entity.view.TongzhuangshuiView;

@Service("tongzhuangshuiService")
public class TongzhuangshuiServiceImpl extends ServiceImpl<TongzhuangshuiDao, TongzhuangshuiEntity> implements TongzhuangshuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhuangshuiEntity> page = this.selectPage(
                new Query<TongzhuangshuiEntity>(params).getPage(),
                new EntityWrapper<TongzhuangshuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhuangshuiEntity> wrapper) {
		  Page<TongzhuangshuiView> page =new Query<TongzhuangshuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhuangshuiVO> selectListVO(Wrapper<TongzhuangshuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhuangshuiVO selectVO(Wrapper<TongzhuangshuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhuangshuiView> selectListView(Wrapper<TongzhuangshuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhuangshuiView selectView(Wrapper<TongzhuangshuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
