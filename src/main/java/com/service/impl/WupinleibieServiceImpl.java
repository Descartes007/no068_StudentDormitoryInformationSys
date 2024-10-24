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


import com.dao.WupinleibieDao;
import com.entity.WupinleibieEntity;
import com.service.WupinleibieService;
import com.entity.vo.WupinleibieVO;
import com.entity.view.WupinleibieView;

@Service("wupinleibieService")
public class WupinleibieServiceImpl extends ServiceImpl<WupinleibieDao, WupinleibieEntity> implements WupinleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinleibieEntity> page = this.selectPage(
                new Query<WupinleibieEntity>(params).getPage(),
                new EntityWrapper<WupinleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinleibieEntity> wrapper) {
		  Page<WupinleibieView> page =new Query<WupinleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinleibieVO> selectListVO(Wrapper<WupinleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinleibieVO selectVO(Wrapper<WupinleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinleibieView> selectListView(Wrapper<WupinleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinleibieView selectView(Wrapper<WupinleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
