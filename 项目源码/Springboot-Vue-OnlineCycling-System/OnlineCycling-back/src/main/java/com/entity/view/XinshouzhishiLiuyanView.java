package com.entity.view;

import com.entity.XinshouzhishiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 新手知识留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinshouzhishi_liuyan")
public class XinshouzhishiLiuyanView extends XinshouzhishiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xinshouzhishi
			/**
			* 知识标题
			*/
			private String xinshouzhishiName;
			/**
			* 知识类型
			*/
			private Integer xinshouzhishiTypes;
				/**
				* 知识类型的值
				*/
				private String xinshouzhishiValue;
			/**
			* 封面
			*/
			private String xinshouzhishiPhoto;
			/**
			* 新手知识 的 用户
			*/
			private Integer xinshouzhishiYonghuId;
			/**
			* 详情内容
			*/
			private String xinshouzhishiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XinshouzhishiLiuyanView() {

	}

	public XinshouzhishiLiuyanView(XinshouzhishiLiuyanEntity xinshouzhishiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xinshouzhishiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


































				//级联表的get和set xinshouzhishi

					/**
					* 获取： 知识标题
					*/
					public String getXinshouzhishiName() {
						return xinshouzhishiName;
					}
					/**
					* 设置： 知识标题
					*/
					public void setXinshouzhishiName(String xinshouzhishiName) {
						this.xinshouzhishiName = xinshouzhishiName;
					}

					/**
					* 获取： 知识类型
					*/
					public Integer getXinshouzhishiTypes() {
						return xinshouzhishiTypes;
					}
					/**
					* 设置： 知识类型
					*/
					public void setXinshouzhishiTypes(Integer xinshouzhishiTypes) {
						this.xinshouzhishiTypes = xinshouzhishiTypes;
					}


						/**
						* 获取： 知识类型的值
						*/
						public String getXinshouzhishiValue() {
							return xinshouzhishiValue;
						}
						/**
						* 设置： 知识类型的值
						*/
						public void setXinshouzhishiValue(String xinshouzhishiValue) {
							this.xinshouzhishiValue = xinshouzhishiValue;
						}

					/**
					* 获取： 封面
					*/
					public String getXinshouzhishiPhoto() {
						return xinshouzhishiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setXinshouzhishiPhoto(String xinshouzhishiPhoto) {
						this.xinshouzhishiPhoto = xinshouzhishiPhoto;
					}

					/**
					* 获取：新手知识 的 用户
					*/
					public Integer getXinshouzhishiYonghuId() {
						return xinshouzhishiYonghuId;
					}
					/**
					* 设置：新手知识 的 用户
					*/
					public void setXinshouzhishiYonghuId(Integer xinshouzhishiYonghuId) {
						this.xinshouzhishiYonghuId = xinshouzhishiYonghuId;
					}


					/**
					* 获取： 详情内容
					*/
					public String getXinshouzhishiContent() {
						return xinshouzhishiContent;
					}
					/**
					* 设置： 详情内容
					*/
					public void setXinshouzhishiContent(String xinshouzhishiContent) {
						this.xinshouzhishiContent = xinshouzhishiContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
