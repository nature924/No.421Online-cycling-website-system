package com.entity.view;

import com.entity.QijirijiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 骑记分享收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qijiriji_collection")
public class QijirijiCollectionView extends QijirijiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String qijirijiCollectionValue;



		//级联表 qijiriji
			/**
			* 骑记标题
			*/
			private String qijirijiName;
			/**
			* 骑记类型
			*/
			private Integer qijirijiTypes;
				/**
				* 骑记类型的值
				*/
				private String qijirijiValue;
			/**
			* 封面
			*/
			private String qijirijiPhoto;
			/**
			* 骑记分享 的 用户
			*/
			private Integer qijirijiYonghuId;
			/**
			* 详情内容
			*/
			private String qijirijiContent;

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

	public QijirijiCollectionView() {

	}

	public QijirijiCollectionView(QijirijiCollectionEntity qijirijiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, qijirijiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getQijirijiCollectionValue() {
				return qijirijiCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setQijirijiCollectionValue(String qijirijiCollectionValue) {
				this.qijirijiCollectionValue = qijirijiCollectionValue;
			}






















				//级联表的get和set qijiriji

					/**
					* 获取： 骑记标题
					*/
					public String getQijirijiName() {
						return qijirijiName;
					}
					/**
					* 设置： 骑记标题
					*/
					public void setQijirijiName(String qijirijiName) {
						this.qijirijiName = qijirijiName;
					}

					/**
					* 获取： 骑记类型
					*/
					public Integer getQijirijiTypes() {
						return qijirijiTypes;
					}
					/**
					* 设置： 骑记类型
					*/
					public void setQijirijiTypes(Integer qijirijiTypes) {
						this.qijirijiTypes = qijirijiTypes;
					}


						/**
						* 获取： 骑记类型的值
						*/
						public String getQijirijiValue() {
							return qijirijiValue;
						}
						/**
						* 设置： 骑记类型的值
						*/
						public void setQijirijiValue(String qijirijiValue) {
							this.qijirijiValue = qijirijiValue;
						}

					/**
					* 获取： 封面
					*/
					public String getQijirijiPhoto() {
						return qijirijiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setQijirijiPhoto(String qijirijiPhoto) {
						this.qijirijiPhoto = qijirijiPhoto;
					}

					/**
					* 获取：骑记分享 的 用户
					*/
					public Integer getQijirijiYonghuId() {
						return qijirijiYonghuId;
					}
					/**
					* 设置：骑记分享 的 用户
					*/
					public void setQijirijiYonghuId(Integer qijirijiYonghuId) {
						this.qijirijiYonghuId = qijirijiYonghuId;
					}


					/**
					* 获取： 详情内容
					*/
					public String getQijirijiContent() {
						return qijirijiContent;
					}
					/**
					* 设置： 详情内容
					*/
					public void setQijirijiContent(String qijirijiContent) {
						this.qijirijiContent = qijirijiContent;
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
