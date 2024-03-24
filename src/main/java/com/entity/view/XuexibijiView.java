package com.entity.view;

import com.entity.XuexibijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习笔记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
@TableName("xuexibiji")
public class XuexibijiView  extends XuexibijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexibijiView(){
	}
 
 	public XuexibijiView(XuexibijiEntity xuexibijiEntity){
 	try {
			BeanUtils.copyProperties(this, xuexibijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
