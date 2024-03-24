package com.entity.model;

import com.entity.XuexibijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学习笔记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public class XuexibijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 笔记内容
	 */
	
	private String bijineirong;
		
	/**
	 * 学习日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xuexiriqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
				
	
	/**
	 * 设置：笔记内容
	 */
	 
	public void setBijineirong(String bijineirong) {
		this.bijineirong = bijineirong;
	}
	
	/**
	 * 获取：笔记内容
	 */
	public String getBijineirong() {
		return bijineirong;
	}
				
	
	/**
	 * 设置：学习日期
	 */
	 
	public void setXuexiriqi(Date xuexiriqi) {
		this.xuexiriqi = xuexiriqi;
	}
	
	/**
	 * 获取：学习日期
	 */
	public Date getXuexiriqi() {
		return xuexiriqi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
			
}
