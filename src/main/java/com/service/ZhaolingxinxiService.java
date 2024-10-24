package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaolingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaolingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaolingxinxiView;


/**
 * 招领信息
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface ZhaolingxinxiService extends IService<ZhaolingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaolingxinxiVO> selectListVO(Wrapper<ZhaolingxinxiEntity> wrapper);
   	
   	ZhaolingxinxiVO selectVO(@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);
   	
   	List<ZhaolingxinxiView> selectListView(Wrapper<ZhaolingxinxiEntity> wrapper);
   	
   	ZhaolingxinxiView selectView(@Param("ew") Wrapper<ZhaolingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaolingxinxiEntity> wrapper);
   	
}

