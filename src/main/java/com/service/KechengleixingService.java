package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengleixingView;


/**
 * 课程类型
 *
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface KechengleixingService extends IService<KechengleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengleixingVO> selectListVO(Wrapper<KechengleixingEntity> wrapper);
   	
   	KechengleixingVO selectVO(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
   	
   	List<KechengleixingView> selectListView(Wrapper<KechengleixingEntity> wrapper);
   	
   	KechengleixingView selectView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengleixingEntity> wrapper);
   	
}

