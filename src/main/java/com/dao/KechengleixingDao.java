package com.dao;

import com.entity.KechengleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengleixingVO;
import com.entity.view.KechengleixingView;


/**
 * 课程类型
 * 
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface KechengleixingDao extends BaseMapper<KechengleixingEntity> {
	
	List<KechengleixingVO> selectListVO(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
	
	KechengleixingVO selectVO(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
	
	List<KechengleixingView> selectListView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);

	List<KechengleixingView> selectListView(Pagination page,@Param("ew") Wrapper<KechengleixingEntity> wrapper);
	
	KechengleixingView selectView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);
	
}
