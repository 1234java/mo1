package com.zking.ssm.base.mapper;

import com.zking.ssm.base.model.InvestmentType;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentTypeMapper {
    int deleteByPrimaryKey(Integer iTypeid);

    int insert(InvestmentType record);

    int insertSelective(InvestmentType record);

    InvestmentType selectByPrimaryKey(Integer iTypeid);

    int updateByPrimaryKeySelective(InvestmentType record);

    int updateByPrimaryKey(InvestmentType record);
}