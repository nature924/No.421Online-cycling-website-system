package com.entity.view;

import com.entity.LuxianCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 路线攻略收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("luxian_collection")
public class LuxianCollectionView extends LuxianCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String luxianCollectionValue;



		//级联表 luxian
			/**
			* 路线标题
			*/
			private String luxianName;
			/**
			* 路线类型
			*/
			private Integer luxianTypes;
				/**
				* 路线类型的值
				*/
				private String luxianValue;
			/**
			* 封面
			*/
			private String luxianPhoto;
			/**
			* 路线攻略 的 用户
			*/
			private Integer luxianYonghuId;
			/**
			* 详情内容
			*/
			private String luxianContent;

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

	public LuxianCollectionView() {

	}

	public LuxianCollectionView(LuxianCollectionEntity luxianCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, luxianCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getLuxianCollectionValue() {
				return luxianCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setLuxianCollectionValue(String luxianCollectionValue) {
				this.luxianCollectionValue = luxianCollectionValue;
			}










				//级联表的get和set luxian

					/**
					* 获取： 路线标题
					*/
					public String getLuxianName() {
						return luxianName;
					}
					/**
					* 设置： 路线标题
					*/
					public void setLuxianName(String luxianName) {
						this.luxianName = luxianName;
					}

					/**
					* 获取： 路线类型
					*/
					public Integer getLuxianTypes() {
						return luxianTypes;
					}
					/**
					* 设置： 路线类型
					*/
					public void setLuxianTypes(Integer luxianTypes) {
						this.luxianTypes = luxianTypes;
					}


						/**
						* 获取： 路线类型的值
						*/
						public String getLuxianValue() {
							return luxianValue;
						}
						/**
						* 设置： 路线类型的值
						*/
						public void setLuxianValue(String luxianValue) {
							this.luxianValue = luxianValue;
						}

					/**
					* 获取： 封面
					*/
					public String getLuxianPhoto() {
						return luxianPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setLuxianPhoto(String luxianPhoto) {
						this.luxianPhoto = luxianPhoto;
					}

					/**
					* 获取：路线攻略 的 用户
					*/
					public Integer getLuxianYonghuId() {
						return luxianYonghuId;
					}
					/**
					* 设置：路线攻略 的 用户
					*/
					public void setLuxianYonghuId(Integer luxianYonghuId) {
						this.luxianYonghuId = luxianYonghuId;
					}


					/**
					* 获取： 详情内容
					*/
					public String getLuxianContent() {
						return luxianContent;
					}
					/**
					* 设置： 详情内容
					*/
					public void setLuxianContent(String luxianContent) {
						this.luxianContent = luxianContent;
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
