package com.dao;

import com.entity.QijirijiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QijirijiLiuyanView;

/**
 * 骑记分享留言 Dao 接口
 *
 * @author 
 */
public interface QijirijiLiuyanDao extends BaseMapper<QijirijiLiuyanEntity> {

   List<QijirijiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
