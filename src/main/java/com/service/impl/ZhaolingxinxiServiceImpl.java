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


import com.dao.ZhaolingxinxiDao;
import com.entity.ZhaolingxinxiEntity;
import com.service.ZhaolingxinxiService;
import com.entity.vo.ZhaolingxinxiVO;
import com.entity.view.ZhaolingxinxiView;

@Service("zhaolingxinxiService")
public class ZhaolingxinxiServiceImpl extends ServiceImpl<ZhaolingxinxiDao, ZhaolingxinxiEntity> implements ZhaolingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaolingxinxiEntity> page = this.selectPage(
                new Query<ZhaolingxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhaolingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaolingxinxiEntity> wrapper) {
		  Page<ZhaolingxinxiView> page =new Query<ZhaolingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaolingxinxiVO> selectListVO(Wrapper<ZhaolingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaolingxinxiVO selectVO(Wrapper<ZhaolingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaolingxinxiView> selectListView(Wrapper<ZhaolingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaolingxinxiView selectView(Wrapper<ZhaolingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
