package com.dao;

import com.entity.XinshouzhishiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XinshouzhishiCollectionView;

/**
 * 新手知识收藏 Dao 接口
 *
 * @author 
 */
public interface XinshouzhishiCollectionDao extends BaseMapper<XinshouzhishiCollectionEntity> {

   List<XinshouzhishiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
