package com.entity.vo;

import com.entity.QijirijiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 骑记分享
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qijiriji")
public class QijirijiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
