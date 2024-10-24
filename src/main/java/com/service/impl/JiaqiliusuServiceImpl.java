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


import com.dao.JiaqiliusuDao;
import com.entity.JiaqiliusuEntity;
import com.service.JiaqiliusuService;
import com.entity.vo.JiaqiliusuVO;
import com.entity.view.JiaqiliusuView;

@Service("jiaqiliusuService")
public class JiaqiliusuServiceImpl extends ServiceImpl<JiaqiliusuDao, JiaqiliusuEntity> implements JiaqiliusuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaqiliusuEntity> page = this.selectPage(
                new Query<JiaqiliusuEntity>(params).getPage(),
                new EntityWrapper<JiaqiliusuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaqiliusuEntity> wrapper) {
		  Page<JiaqiliusuView> page =new Query<JiaqiliusuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaqiliusuVO> selectListVO(Wrapper<JiaqiliusuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaqiliusuVO selectVO(Wrapper<JiaqiliusuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaqiliusuView> selectListView(Wrapper<JiaqiliusuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaqiliusuView selectView(Wrapper<JiaqiliusuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
