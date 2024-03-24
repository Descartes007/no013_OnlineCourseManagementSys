package com.dao;

import com.entity.DiscussxuexiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexiziliaoVO;
import com.entity.view.DiscussxuexiziliaoView;


/**
 * 学习资料评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public interface DiscussxuexiziliaoDao extends BaseMapper<DiscussxuexiziliaoEntity> {
	
	List<DiscussxuexiziliaoVO> selectListVO(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
	DiscussxuexiziliaoVO selectVO(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
	List<DiscussxuexiziliaoView> selectListView(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);

	List<DiscussxuexiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
	DiscussxuexiziliaoView selectView(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
}
