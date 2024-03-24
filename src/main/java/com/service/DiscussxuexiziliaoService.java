package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexiziliaoView;


/**
 * 学习资料评论表
 *
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface DiscussxuexiziliaoService extends IService<DiscussxuexiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexiziliaoVO> selectListVO(Wrapper<DiscussxuexiziliaoEntity> wrapper);
   	
   	DiscussxuexiziliaoVO selectVO(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
   	
   	List<DiscussxuexiziliaoView> selectListView(Wrapper<DiscussxuexiziliaoEntity> wrapper);
   	
   	DiscussxuexiziliaoView selectView(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexiziliaoEntity> wrapper);
   	
}

