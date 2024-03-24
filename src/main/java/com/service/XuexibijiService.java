package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexibijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexibijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexibijiView;


/**
 * 学习笔记
 *
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface XuexibijiService extends IService<XuexibijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexibijiVO> selectListVO(Wrapper<XuexibijiEntity> wrapper);
   	
   	XuexibijiVO selectVO(@Param("ew") Wrapper<XuexibijiEntity> wrapper);
   	
   	List<XuexibijiView> selectListView(Wrapper<XuexibijiEntity> wrapper);
   	
   	XuexibijiView selectView(@Param("ew") Wrapper<XuexibijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexibijiEntity> wrapper);
   	
}

