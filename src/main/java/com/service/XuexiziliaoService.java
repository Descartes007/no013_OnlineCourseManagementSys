package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiziliaoView;


/**
 * 学习资料
 *
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface XuexiziliaoService extends IService<XuexiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiziliaoVO> selectListVO(Wrapper<XuexiziliaoEntity> wrapper);
   	
   	XuexiziliaoVO selectVO(@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);
   	
   	List<XuexiziliaoView> selectListView(Wrapper<XuexiziliaoEntity> wrapper);
   	
   	XuexiziliaoView selectView(@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiziliaoEntity> wrapper);
   	
}

