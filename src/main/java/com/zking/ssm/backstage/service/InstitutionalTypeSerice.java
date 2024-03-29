package com.zking.ssm.backstage.service;

import com.zking.ssm.base.model.InstitutionalType;
import org.springframework.stereotype.Repository;

/*
机构类型
 */

public interface InstitutionalTypeSerice {
    int deleteByPrimaryKey(InstitutionalType institutionalType);

    int insert(InstitutionalType institutionalType);

    int insertSelective(InstitutionalType institutionalType);

    InstitutionalType selectByPrimaryKey(InstitutionalType institutionalType);

    int updateByPrimaryKeySelective(InstitutionalType institutionalType);

    int updateByPrimaryKey(InstitutionalType institutionalType);
}