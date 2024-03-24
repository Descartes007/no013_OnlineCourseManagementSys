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


import com.dao.KechengleixingDao;
import com.entity.KechengleixingEntity;
import com.service.KechengleixingService;
import com.entity.vo.KechengleixingVO;
import com.entity.view.KechengleixingView;

@Service("kechengleixingService")
public class KechengleixingServiceImpl extends ServiceImpl<KechengleixingDao, KechengleixingEntity> implements KechengleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengleixingEntity> page = this.selectPage(
                new Query<KechengleixingEntity>(params).getPage(),
                new EntityWrapper<KechengleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengleixingEntity> wrapper) {
		  Page<KechengleixingView> page =new Query<KechengleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengleixingVO> selectListVO(Wrapper<KechengleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengleixingVO selectVO(Wrapper<KechengleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengleixingView> selectListView(Wrapper<KechengleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengleixingView selectView(Wrapper<KechengleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
