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


import com.dao.DiscusszhaolingxinxiDao;
import com.entity.DiscusszhaolingxinxiEntity;
import com.service.DiscusszhaolingxinxiService;
import com.entity.vo.DiscusszhaolingxinxiVO;
import com.entity.view.DiscusszhaolingxinxiView;

@Service("discusszhaolingxinxiService")
public class DiscusszhaolingxinxiServiceImpl extends ServiceImpl<DiscusszhaolingxinxiDao, DiscusszhaolingxinxiEntity> implements DiscusszhaolingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhaolingxinxiEntity> page = this.selectPage(
                new Query<DiscusszhaolingxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhaolingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhaolingxinxiEntity> wrapper) {
		  Page<DiscusszhaolingxinxiView> page =new Query<DiscusszhaolingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhaolingxinxiVO> selectListVO(Wrapper<DiscusszhaolingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhaolingxinxiVO selectVO(Wrapper<DiscusszhaolingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhaolingxinxiView> selectListView(Wrapper<DiscusszhaolingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhaolingxinxiView selectView(Wrapper<DiscusszhaolingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
