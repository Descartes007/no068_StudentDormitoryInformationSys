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


import com.dao.ShiwuxinxiDao;
import com.entity.ShiwuxinxiEntity;
import com.service.ShiwuxinxiService;
import com.entity.vo.ShiwuxinxiVO;
import com.entity.view.ShiwuxinxiView;

@Service("shiwuxinxiService")
public class ShiwuxinxiServiceImpl extends ServiceImpl<ShiwuxinxiDao, ShiwuxinxiEntity> implements ShiwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwuxinxiEntity> page = this.selectPage(
                new Query<ShiwuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShiwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwuxinxiEntity> wrapper) {
		  Page<ShiwuxinxiView> page =new Query<ShiwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwuxinxiVO> selectListVO(Wrapper<ShiwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwuxinxiVO selectVO(Wrapper<ShiwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwuxinxiView> selectListView(Wrapper<ShiwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwuxinxiView selectView(Wrapper<ShiwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
