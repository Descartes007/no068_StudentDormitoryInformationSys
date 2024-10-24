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


import com.dao.WeishengjianchaDao;
import com.entity.WeishengjianchaEntity;
import com.service.WeishengjianchaService;
import com.entity.vo.WeishengjianchaVO;
import com.entity.view.WeishengjianchaView;

@Service("weishengjianchaService")
public class WeishengjianchaServiceImpl extends ServiceImpl<WeishengjianchaDao, WeishengjianchaEntity> implements WeishengjianchaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeishengjianchaEntity> page = this.selectPage(
                new Query<WeishengjianchaEntity>(params).getPage(),
                new EntityWrapper<WeishengjianchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeishengjianchaEntity> wrapper) {
		  Page<WeishengjianchaView> page =new Query<WeishengjianchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeishengjianchaVO> selectListVO(Wrapper<WeishengjianchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeishengjianchaVO selectVO(Wrapper<WeishengjianchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeishengjianchaView> selectListView(Wrapper<WeishengjianchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeishengjianchaView selectView(Wrapper<WeishengjianchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
