package com.dao;

import com.entity.XuexiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiziliaoVO;
import com.entity.view.XuexiziliaoView;


/**
 * 学习资料
 * 
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface XuexiziliaoDao extends BaseMapper<XuexiziliaoEntity> {
	
	List<XuexiziliaoVO> selectListVO(@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);
	
	XuexiziliaoVO selectVO(@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);
	
	List<XuexiziliaoView> selectListView(@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);

	List<XuexiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);
	
	XuexiziliaoView selectView(@Param("ew") Wrapper<XuexiziliaoEntity> wrapper);
	
}
