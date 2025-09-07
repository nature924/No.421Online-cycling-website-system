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
 * 新手知识
 *
 * @author 
 * @email
 */
@TableName("xinshouzhishi")
public class XinshouzhishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinshouzhishiEntity() {

	}

	public XinshouzhishiEntity(T t) {
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
     * 知识标题
     */
    @TableField(value = "xinshouzhishi_name")

    private String xinshouzhishiName;


    /**
     * 知识类型
     */
    @TableField(value = "xinshouzhishi_types")

    private Integer xinshouzhishiTypes;


    /**
     * 封面
     */
    @TableField(value = "xinshouzhishi_photo")

    private String xinshouzhishiPhoto;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 详情内容
     */
    @TableField(value = "xinshouzhishi_content")

    private String xinshouzhishiContent;


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
	 * 设置：知识标题
	 */
    public String getXinshouzhishiName() {
        return xinshouzhishiName;
    }
    /**
	 * 获取：知识标题
	 */

    public void setXinshouzhishiName(String xinshouzhishiName) {
        this.xinshouzhishiName = xinshouzhishiName;
    }
    /**
	 * 设置：知识类型
	 */
    public Integer getXinshouzhishiTypes() {
        return xinshouzhishiTypes;
    }
    /**
	 * 获取：知识类型
	 */

    public void setXinshouzhishiTypes(Integer xinshouzhishiTypes) {
        this.xinshouzhishiTypes = xinshouzhishiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getXinshouzhishiPhoto() {
        return xinshouzhishiPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setXinshouzhishiPhoto(String xinshouzhishiPhoto) {
        this.xinshouzhishiPhoto = xinshouzhishiPhoto;
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
    public String getXinshouzhishiContent() {
        return xinshouzhishiContent;
    }
    /**
	 * 获取：详情内容
	 */

    public void setXinshouzhishiContent(String xinshouzhishiContent) {
        this.xinshouzhishiContent = xinshouzhishiContent;
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
        return "Xinshouzhishi{" +
            "id=" + id +
            ", xinshouzhishiName=" + xinshouzhishiName +
            ", xinshouzhishiTypes=" + xinshouzhishiTypes +
            ", xinshouzhishiPhoto=" + xinshouzhishiPhoto +
            ", yonghuId=" + yonghuId +
            ", xinshouzhishiContent=" + xinshouzhishiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
