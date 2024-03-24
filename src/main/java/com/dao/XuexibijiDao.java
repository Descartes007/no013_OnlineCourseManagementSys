package com.dao;

import com.entity.XuexibijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexibijiVO;
import com.entity.view.XuexibijiView;


/**
 * 学习笔记
 * 
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface XuexibijiDao extends BaseMapper<XuexibijiEntity> {
	
	List<XuexibijiVO> selectListVO(@Param("ew") Wrapper<XuexibijiEntity> wrapper);
	
	XuexibijiVO selectVO(@Param("ew") Wrapper<XuexibijiEntity> wrapper);
	
	List<XuexibijiView> selectListView(@Param("ew") Wrapper<XuexibijiEntity> wrapper);

	List<XuexibijiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexibijiEntity> wrapper);
	
	XuexibijiView selectView(@Param("ew") Wrapper<XuexibijiEntity> wrapper);
	
}
