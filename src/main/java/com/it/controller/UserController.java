
package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.pojo.User;
import com.it.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="hello")
	public String  hello(){
		return "hello";
	}
	
	@RequestMapping(value="selectAll")
	public List<User>  selectAll(){
		List<User> selectAll = userService.selectAll();
		return selectAll;
	}
	
	@RequestMapping(value="selectOne")
	public User  selectOne(Integer id){
		System.out.println(id);
		User user = userService.selectByPrimaryKey(id);
		return user;
	}
	
	
	@RequestMapping(value = "selectAll_page")
    public List<User> selectAll_page(@RequestParam(value = "pageNum",defaultValue="1") int pageNum ){
        //pageNum:表示第几页  pageSize:表示一页展示的数据
        PageHelper.startPage(pageNum,5);
        List<User> list=userService.selectAll();
        //将查询到的数据封装到PageInfo对象
        PageInfo<User> pageInfo=new PageInfo(list,2);
        //分割数据成功
        return list;
    }
	
}
