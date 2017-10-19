package com.wg.service;

import com.wg.dao.VipMemberInfoMapper;
import com.wg.domain.ContactInfo;
import com.wg.domain.ContactInfoExample;
import com.wg.domain.VipMemberInfo;
import com.wg.domain.VipMemberInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wg.dao.ContactInfoMapper;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private ContactInfoMapper contactInfoMapper;
    @Autowired
    private VipMemberInfoMapper vipMemberInfoMapper;
    public int insertContactInfo(ContactInfo record) {
        int result = contactInfoMapper.insert(record);
        return result;
    }

    public List<ContactInfo> selectByExample(ContactInfoExample example) {
        return contactInfoMapper.selectByExample(example);
    }

    public int deleteContactInfo(Integer id) {
        return contactInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ContactInfo record) {
        return contactInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int insertMemberInfo(VipMemberInfo record) {
        return vipMemberInfoMapper.insert(record);
    }

    public List<VipMemberInfo> selectMemberInfoByExample(VipMemberInfoExample example) {
        return vipMemberInfoMapper.selectByExample(example);
    }

    public int updateMemberByPrimaryKeySelective(VipMemberInfo record) {
        return vipMemberInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int deleteMemberContactInfo(String id) {
        return vipMemberInfoMapper.deleteByPrimaryKey(id);
    }
}
