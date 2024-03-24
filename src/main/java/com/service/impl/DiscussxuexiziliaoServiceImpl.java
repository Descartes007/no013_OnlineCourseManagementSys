package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxuexiziliaoDao;
import com.entity.DiscussxuexiziliaoEntity;
import com.service.DiscussxuexiziliaoService;
import com.entity.vo.DiscussxuexiziliaoVO;
import com.entity.view.DiscussxuexiziliaoView;

@Service("discussxuexiziliaoService")
public class DiscussxuexiziliaoServiceImpl extends ServiceImpl<DiscussxuexiziliaoDao, DiscussxuexiziliaoEntity> implements DiscussxuexiziliaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexiziliaoEntity> page = this.selectPage(
                new Query<DiscussxuexiziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexiziliaoEntity> wrapper) {
		  Page<DiscussxuexiziliaoView> page =new Query<DiscussxuexiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexiziliaoVO> selectListVO(Wrapper<DiscussxuexiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexiziliaoVO selectVO(Wrapper<DiscussxuexiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexiziliaoView> selectListView(Wrapper<DiscussxuexiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexiziliaoView selectView(Wrapper<DiscussxuexiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
