package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="hello")
	public String  hello(){
		return "hello";
	}
	
//	@RequestMapping(value = "/getPerson")
//    public List<TbPersonPO> getSomePerson(@RequestParam(value = "pageNum",defaultValue="1") int pageNum ){
//        //pageNum:表示第几页  pageSize:表示一页展示的数据
//        PageHelper.startPage(pageNum,3);
//        List<TbPersonPO> list=tbPersonDao.queryPerosn();
//        //将查询到的数据封装到PageInfo对象
//        PageInfo<TbPersonPO> pageInfo=new PageInfo(list,3);
//        //分割数据成功
//        return list;
//    }
	
}
