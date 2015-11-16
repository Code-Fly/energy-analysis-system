package com.flycode.masterop.mapper;

import com.flycode.masterop.entity.TabMasterOp;
import com.flycode.masterop.entity.TabMasterOpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabMasterOpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int countByExample(TabMasterOpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int deleteByExample(TabMasterOpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int deleteByPrimaryKey(Integer opID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int insert(TabMasterOp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int insertSelective(TabMasterOp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    List<TabMasterOp> selectByExample(TabMasterOpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    TabMasterOp selectByPrimaryKey(Integer opID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int updateByExampleSelective(@Param("record") TabMasterOp record, @Param("example") TabMasterOpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int updateByExample(@Param("record") TabMasterOp record, @Param("example") TabMasterOpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int updateByPrimaryKeySelective(TabMasterOp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_master_op
     *
     * @mbggenerated Mon Nov 16 22:19:18 CST 2015
     */
    int updateByPrimaryKey(TabMasterOp record);
}