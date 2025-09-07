package com.entity.vo;

import com.entity.XinshouzhishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 新手知识
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinshouzhishi")
public class XinshouzhishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
