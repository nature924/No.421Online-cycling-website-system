package com.entity.model;

import com.entity.QijirijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 骑记分享
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QijirijiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 骑记标题
     */
    private String qijirijiName;


    /**
     * 骑记类型
     */
    private Integer qijirijiTypes;


    /**
     * 封面
     */
    private String qijirijiPhoto;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 详情内容
     */
    private String qijirijiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：骑记标题
	 */
    public String getQijirijiName() {
        return qijirijiName;
    }


    /**
	 * 设置：骑记标题
	 */
    public void setQijirijiName(String qijirijiName) {
        this.qijirijiName = qijirijiName;
    }
    /**
	 * 获取：骑记类型
	 */
    public Integer getQijirijiTypes() {
        return qijirijiTypes;
    }


    /**
	 * 设置：骑记类型
	 */
    public void setQijirijiTypes(Integer qijirijiTypes) {
        this.qijirijiTypes = qijirijiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getQijirijiPhoto() {
        return qijirijiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setQijirijiPhoto(String qijirijiPhoto) {
        this.qijirijiPhoto = qijirijiPhoto;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：详情内容
	 */
    public String getQijirijiContent() {
        return qijirijiContent;
    }


    /**
	 * 设置：详情内容
	 */
    public void setQijirijiContent(String qijirijiContent) {
        this.qijirijiContent = qijirijiContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
