package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhaolingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhaolingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhaolingxinxiView;


/**
 * 招领信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-06 16:19:29
 */
public interface DiscusszhaolingxinxiService extends IService<DiscusszhaolingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhaolingxinxiVO> selectListVO(Wrapper<DiscusszhaolingxinxiEntity> wrapper);
   	
   	DiscusszhaolingxinxiVO selectVO(@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);
   	
   	List<DiscusszhaolingxinxiView> selectListView(Wrapper<DiscusszhaolingxinxiEntity> wrapper);
   	
   	DiscusszhaolingxinxiView selectView(@Param("ew") Wrapper<DiscusszhaolingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhaolingxinxiEntity> wrapper);
   	
}

