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


import com.dao.TongzhuangshuipinpaiDao;
import com.entity.TongzhuangshuipinpaiEntity;
import com.service.TongzhuangshuipinpaiService;
import com.entity.vo.TongzhuangshuipinpaiVO;
import com.entity.view.TongzhuangshuipinpaiView;

@Service("tongzhuangshuipinpaiService")
public class TongzhuangshuipinpaiServiceImpl extends ServiceImpl<TongzhuangshuipinpaiDao, TongzhuangshuipinpaiEntity> implements TongzhuangshuipinpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhuangshuipinpaiEntity> page = this.selectPage(
                new Query<TongzhuangshuipinpaiEntity>(params).getPage(),
                new EntityWrapper<TongzhuangshuipinpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhuangshuipinpaiEntity> wrapper) {
		  Page<TongzhuangshuipinpaiView> page =new Query<TongzhuangshuipinpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhuangshuipinpaiVO> selectListVO(Wrapper<TongzhuangshuipinpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhuangshuipinpaiVO selectVO(Wrapper<TongzhuangshuipinpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhuangshuipinpaiView> selectListView(Wrapper<TongzhuangshuipinpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhuangshuipinpaiView selectView(Wrapper<TongzhuangshuipinpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
