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


import com.dao.WenmingsusheDao;
import com.entity.WenmingsusheEntity;
import com.service.WenmingsusheService;
import com.entity.vo.WenmingsusheVO;
import com.entity.view.WenmingsusheView;

@Service("wenmingsusheService")
public class WenmingsusheServiceImpl extends ServiceImpl<WenmingsusheDao, WenmingsusheEntity> implements WenmingsusheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenmingsusheEntity> page = this.selectPage(
                new Query<WenmingsusheEntity>(params).getPage(),
                new EntityWrapper<WenmingsusheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenmingsusheEntity> wrapper) {
		  Page<WenmingsusheView> page =new Query<WenmingsusheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenmingsusheVO> selectListVO(Wrapper<WenmingsusheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenmingsusheVO selectVO(Wrapper<WenmingsusheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenmingsusheView> selectListView(Wrapper<WenmingsusheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenmingsusheView selectView(Wrapper<WenmingsusheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
