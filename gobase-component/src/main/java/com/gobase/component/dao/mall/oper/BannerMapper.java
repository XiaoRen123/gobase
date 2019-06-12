package com.gobase.component.dao.mall.oper;

import com.gobase.component.bean.mall.oper.Banner;
import com.gobase.component.bean.mall.oper.BannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    long countByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int deleteByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int insert(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int insertSelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    List<Banner> selectByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    Banner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated Tue Jun 11 21:26:35 CST 2019
     */
    int updateByPrimaryKey(Banner record);
}