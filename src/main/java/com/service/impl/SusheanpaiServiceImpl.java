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


import com.dao.SusheanpaiDao;
import com.entity.SusheanpaiEntity;
import com.service.SusheanpaiService;
import com.entity.vo.SusheanpaiVO;
import com.entity.view.SusheanpaiView;

@Service("susheanpaiService")
public class SusheanpaiServiceImpl extends ServiceImpl<SusheanpaiDao, SusheanpaiEntity> implements SusheanpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheanpaiEntity> page = this.selectPage(
                new Query<SusheanpaiEntity>(params).getPage(),
                new EntityWrapper<SusheanpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheanpaiEntity> wrapper) {
		  Page<SusheanpaiView> page =new Query<SusheanpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheanpaiVO> selectListVO(Wrapper<SusheanpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheanpaiVO selectVO(Wrapper<SusheanpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheanpaiView> selectListView(Wrapper<SusheanpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheanpaiView selectView(Wrapper<SusheanpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
