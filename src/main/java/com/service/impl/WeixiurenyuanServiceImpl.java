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


import com.dao.WeixiurenyuanDao;
import com.entity.WeixiurenyuanEntity;
import com.service.WeixiurenyuanService;
import com.entity.vo.WeixiurenyuanVO;
import com.entity.view.WeixiurenyuanView;

@Service("weixiurenyuanService")
public class WeixiurenyuanServiceImpl extends ServiceImpl<WeixiurenyuanDao, WeixiurenyuanEntity> implements WeixiurenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiurenyuanEntity> page = this.selectPage(
                new Query<WeixiurenyuanEntity>(params).getPage(),
                new EntityWrapper<WeixiurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiurenyuanEntity> wrapper) {
		  Page<WeixiurenyuanView> page =new Query<WeixiurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiurenyuanVO> selectListVO(Wrapper<WeixiurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiurenyuanVO selectVO(Wrapper<WeixiurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiurenyuanView> selectListView(Wrapper<WeixiurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiurenyuanView selectView(Wrapper<WeixiurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
