package com.zking.ssm.backstage.service.impl;

import com.zking.ssm.backstage.service.InstitutionalTypeSerice;
import com.zking.ssm.base.mapper.InstitutionalTypeMapper;
import com.zking.ssm.base.model.InstitutionalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InstitutionalTypeServiceImpl implements InstitutionalTypeSerice {
    @Autowired
    private InstitutionalTypeMapper typeMapper;
    @Override
    public int deleteByPrimaryKey(InstitutionalType institutionalType) {
        return typeMapper.deleteByPrimaryKey(institutionalType.getiTypeid());
    }

    @Override
    public int insert(InstitutionalType institutionalType) {

        return typeMapper.insert(institutionalType);
    }

    @Override
    public int insertSelective(InstitutionalType institutionalType) {

        return typeMapper.insertSelective(institutionalType);
    }

    @Override
    public InstitutionalType selectByPrimaryKey(InstitutionalType institutionalType) {
        return typeMapper.selectByPrimaryKey(institutionalType.getiTypeid());
    }

    @Override
    public int updateByPrimaryKeySelective(InstitutionalType institutionalType) {
        return typeMapper.updateByPrimaryKeySelective(institutionalType);
    }

    @Override
    public int updateByPrimaryKey(InstitutionalType institutionalType) {
        return typeMapper.updateByPrimaryKey(institutionalType);
    }
}
