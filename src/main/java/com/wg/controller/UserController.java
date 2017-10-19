package com.wg.controller;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.wg.common.utils.JsonUtil;
import com.wg.domain.VipMemberInfo;
import com.wg.domain.VipMemberInfoExample;
import com.wg.dto.BasicReturnBO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wg.service.UserService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller  
public class UserController {  
	
    @Resource  
    private UserService userService;

      
    @RequestMapping("/")
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
//        User user = userService.selectUserById(1);
//        mav.addObject("user", user);
        return mav;    
    }
    
    @RequestMapping(value="/insertVip",method={RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String insertVip(VipMemberInfo record ){
        BasicReturnBO returnBO = new BasicReturnBO();
        record.setGmtCreate(new Date());
        record.setGmtModity(new Date());
        record.setStatus("S");
        record.setLevel("H");
        int restlt ;
        try{
            restlt = userService.insertMemberInfo(record);
        }catch(Exception e){
            restlt = -1;
        }
        if (restlt >= 1) {
            returnBO.setReturnCode("000");
            returnBO.setReturnMsg("success");
        }else if(restlt == -1){
            returnBO.setReturnCode("002");
            returnBO.setReturnMsg("success");
        }  else {
            returnBO.setReturnCode("001");
            returnBO.setReturnMsg("error");
        }
        return JsonUtil.json2String(returnBO);
    }
    @RequestMapping(value="/queryVip",method={RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String queryVip(){
        VipMemberInfoExample example = new VipMemberInfoExample();
        ModelAndView mav = new ModelAndView("test");
        List<VipMemberInfo> list =  userService.selectMemberInfoByExample(example);
        for (VipMemberInfo info : list) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String gmtCreateStr = formatter.format(info.getGmtCreate());
            info.setRemark(info.getRemark()==null?"":info.getRemark());
            info.setGmtCreateStr(gmtCreateStr);
        }
        return JSON.toJSONString(list);

    }
  
}  
