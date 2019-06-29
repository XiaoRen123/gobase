package com.gobase.component.dao.mall.goods;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.gobase.component.bean.mall.goods.Goods;
import com.gobase.component.bean.mall.goods.GoodsExample;
import com.gobase.component.dao.IBaseMapper;

public interface GoodsMapper extends IBaseMapper<GoodsExample,Goods>{
	
	public static final String TABLE = " `goods` ";
	public static final String INSERT_COLS = " `id`,`goods_id`,`tiny_name`,`full_name`,`description`,`create_time`,`creator`,`offline_time`,`online_time`,`big_img`,`small_img`,`category1`,`category2`,`category3`,`status`,`remark`,`shop_id`,`audit_status`,`real_price`,`ori_price`,`update_time`,`total_num` ";
	public static final String SELECT_COLS = " `id`,`goods_id`,`tiny_name`,`full_name`,`description`,`create_time`,`creator`,`offline_time`,`online_time`,`big_img`,`small_img`,`category1`,`category2`,`category3`,`status`,`remark`,`shop_id`,`audit_status`,`real_price`,`ori_price`,`update_time`,`total_num` ";
	public static final String SELECT_JOIN_COLS = " g.`id`,g.`goods_id`,g.`tiny_name`,g.`full_name`,g.`description`,g.`create_time`,g.`creator`,g.`offline_time`,g.`online_time`,g.`big_img`,g.`small_img`,g.`category1`,g.`category2`,g.`category3`,g.`status`,g.`remark`,g.`shop_id`,g.`audit_status`,g.`real_price`,g.`ori_price`,g.`update_time`,g.`total_num` ";

    
    @Select("<script>"+
    		" select "+SELECT_JOIN_COLS+" from "+TABLE+ " g left join shop s on s.id = g.shop_id"+
    		" where 1=1 "+
    		" <if test='search != null'> "+
    		" and g.full_name like '%:search%' "+
    		" </if>"+
    		" <if test='category1 != null'> "+
    		" and g.category1 = :category1 "+
    		" </if>"+
    		" <if test='category2 != null'> "+
    		" and g.category2 = :category2 "+
    		" </if>"+
    		" <if test='category3 != null'> "+
    		" and g.category3 = :category3 "+
    		" </if>"+
    		" <if test='cityId != null'> "+
    		" and s.city_id = :cityId "+
    		" </if>"+
    		" <if test='shopId != null'> "+
    		" and s.shop_id = :shopId "+
    		" </if>"+
    		" <if test='start != null and limit != null '> "+
    		" limit #{start},#{limit} "+
    		" </if>"+
    		"</script>")
    List<Goods> searchGoods(@Param("search")String search,@Param("category1")String category1,
    		@Param("category2")String category2,@Param("category3")String category3,@Param("cityId")Integer cityId,@Param("shopId")Integer shopId,
    		@Param("start")Integer start,@Param("limit")Integer limit);
    @Select("<script>"+
    		" select count(1) from "+TABLE+ " g left join shop s on s.id = g.shop_id"+
    		" where 1=1 "+
    		" <if test='search != null'> "+
    		" and g.full_name like '%:search%' "+
    		" </if>"+
    		" <if test='category1 != null'> "+
    		" and g.category1 = :category1 "+
    		" </if>"+
    		" <if test='category2 != null'> "+
    		" and g.category2 = :category2 "+
    		" </if>"+
    		" <if test='category3 != null'> "+
    		" and g.category3 = :category3 "+
    		" </if>"+
    		" <if test='cityId != null'> "+
    		" and s.city_id = :cityId "+
    		" </if>"+
    		" <if test='shopId != null'> "+
    		" and s.shop_id = :shopId "+
    		" </if>"+
    		" <if test='start != null and limit != null '> "+
    		" limit #{start},#{limit} "+
    		" </if>"+
    		"</script>")
    int countSearchGoods(@Param("search")String search,@Param("category1")String category1,
    		@Param("category2")String category2,@Param("category3")String category3,@Param("cityId")Integer cityId,@Param("shopId")Integer shopId,
    		@Param("start")Integer start,@Param("limit")Integer limit);
}