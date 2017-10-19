package com.wg.service;

import com.wg.domain.ContactInfo;
import com.wg.domain.ContactInfoExample;
import com.wg.domain.VipMemberInfo;
import com.wg.domain.VipMemberInfoExample;

import java.util.List;

public interface UserService {
	int insertContactInfo(ContactInfo record);
	List<ContactInfo> selectByExample(ContactInfoExample example);
	int deleteContactInfo(Integer id);
	int updateByPrimaryKeySelective(ContactInfo record);

	int insertMemberInfo(VipMemberInfo record);
	List<VipMemberInfo> selectMemberInfoByExample(VipMemberInfoExample example);
	int updateMemberByPrimaryKeySelective(VipMemberInfo record);
	int deleteMemberContactInfo(String id);

}
