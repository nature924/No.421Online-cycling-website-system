package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 骑记分享
 *
 * @author 
 * @email
 */
@TableName("qijiriji")
public class QijirijiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QijirijiEntity() {

	}

	public QijirijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 骑记标题
     */
    @TableField(value = "qijiriji_name")

    private String qijirijiName;


    /**
     * 骑记类型
     */
    @TableField(value = "qijiriji_types")

    private Integer qijirijiTypes;


    /**
     * 封面
     */
    @TableField(value = "qijiriji_photo")

    private String qijirijiPhoto;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 详情内容
     */
    @TableField(value = "qijiriji_content")

    private String qijirijiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：骑记标题
	 */
    public String getQijirijiName() {
        return qijirijiName;
    }
    /**
	 * 获取：骑记标题
	 */

    public void setQijirijiName(String qijirijiName) {
        this.qijirijiName = qijirijiName;
    }
    /**
	 * 设置：骑记类型
	 */
    public Integer getQijirijiTypes() {
        return qijirijiTypes;
    }
    /**
	 * 获取：骑记类型
	 */

    public void setQijirijiTypes(Integer qijirijiTypes) {
        this.qijirijiTypes = qijirijiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getQijirijiPhoto() {
        return qijirijiPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setQijirijiPhoto(String qijirijiPhoto) {
        this.qijirijiPhoto = qijirijiPhoto;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：详情内容
	 */
    public String getQijirijiContent() {
        return qijirijiContent;
    }
    /**
	 * 获取：详情内容
	 */

    public void setQijirijiContent(String qijirijiContent) {
        this.qijirijiContent = qijirijiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qijiriji{" +
            "id=" + id +
            ", qijirijiName=" + qijirijiName +
            ", qijirijiTypes=" + qijirijiTypes +
            ", qijirijiPhoto=" + qijirijiPhoto +
            ", yonghuId=" + yonghuId +
            ", qijirijiContent=" + qijirijiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
