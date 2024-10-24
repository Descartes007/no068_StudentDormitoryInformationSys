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


import com.dao.BaoxiuchuliDao;
import com.entity.BaoxiuchuliEntity;
import com.service.BaoxiuchuliService;
import com.entity.vo.BaoxiuchuliVO;
import com.entity.view.BaoxiuchuliView;

@Service("baoxiuchuliService")
public class BaoxiuchuliServiceImpl extends ServiceImpl<BaoxiuchuliDao, BaoxiuchuliEntity> implements BaoxiuchuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiuchuliEntity> page = this.selectPage(
                new Query<BaoxiuchuliEntity>(params).getPage(),
                new EntityWrapper<BaoxiuchuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiuchuliEntity> wrapper) {
		  Page<BaoxiuchuliView> page =new Query<BaoxiuchuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiuchuliVO> selectListVO(Wrapper<BaoxiuchuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiuchuliVO selectVO(Wrapper<BaoxiuchuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiuchuliView> selectListView(Wrapper<BaoxiuchuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiuchuliView selectView(Wrapper<BaoxiuchuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
