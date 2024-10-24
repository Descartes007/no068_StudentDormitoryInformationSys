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


import com.dao.DiscusstongzhuangshuiDao;
import com.entity.DiscusstongzhuangshuiEntity;
import com.service.DiscusstongzhuangshuiService;
import com.entity.vo.DiscusstongzhuangshuiVO;
import com.entity.view.DiscusstongzhuangshuiView;

@Service("discusstongzhuangshuiService")
public class DiscusstongzhuangshuiServiceImpl extends ServiceImpl<DiscusstongzhuangshuiDao, DiscusstongzhuangshuiEntity> implements DiscusstongzhuangshuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstongzhuangshuiEntity> page = this.selectPage(
                new Query<DiscusstongzhuangshuiEntity>(params).getPage(),
                new EntityWrapper<DiscusstongzhuangshuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstongzhuangshuiEntity> wrapper) {
		  Page<DiscusstongzhuangshuiView> page =new Query<DiscusstongzhuangshuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstongzhuangshuiVO> selectListVO(Wrapper<DiscusstongzhuangshuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstongzhuangshuiVO selectVO(Wrapper<DiscusstongzhuangshuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstongzhuangshuiView> selectListView(Wrapper<DiscusstongzhuangshuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstongzhuangshuiView selectView(Wrapper<DiscusstongzhuangshuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
