package com.flycode.error.mapper;

import com.flycode.error.entity.TabError;
import com.flycode.error.entity.TabErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabErrorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int countByExample(TabErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int deleteByExample(TabErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int deleteByPrimaryKey(Integer infoID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int insert(TabError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int insertSelective(TabError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    List<TabError> selectByExample(TabErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    TabError selectByPrimaryKey(Integer infoID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int updateByExampleSelective(@Param("record") TabError record, @Param("example") TabErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int updateByExample(@Param("record") TabError record, @Param("example") TabErrorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int updateByPrimaryKeySelective(TabError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_error
     *
     * @mbggenerated Thu Nov 12 15:18:13 CST 2015
     */
    int updateByPrimaryKey(TabError record);
}