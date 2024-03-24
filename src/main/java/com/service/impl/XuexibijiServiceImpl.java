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


import com.dao.XuexibijiDao;
import com.entity.XuexibijiEntity;
import com.service.XuexibijiService;
import com.entity.vo.XuexibijiVO;
import com.entity.view.XuexibijiView;

@Service("xuexibijiService")
public class XuexibijiServiceImpl extends ServiceImpl<XuexibijiDao, XuexibijiEntity> implements XuexibijiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexibijiEntity> page = this.selectPage(
                new Query<XuexibijiEntity>(params).getPage(),
                new EntityWrapper<XuexibijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexibijiEntity> wrapper) {
		  Page<XuexibijiView> page =new Query<XuexibijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexibijiVO> selectListVO(Wrapper<XuexibijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexibijiVO selectVO(Wrapper<XuexibijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexibijiView> selectListView(Wrapper<XuexibijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexibijiView selectView(Wrapper<XuexibijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
