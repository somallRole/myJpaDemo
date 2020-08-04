package com.demo.frankxu.webserviceclientandservice.service;

import com.demo.frankxu.webserviceclientandservice.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @ClassName:UserService
 * @Description:测试服务接口类
 *              include:两个测试方法
 * @author Maple
 * @date:2018年4月10日下午3:58:10
 */
@WebService(name = "UserService")
public interface UserService {

    @WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    public User getUser(@WebParam(name = "userId") String userId);

    @WebMethod
    public String getUserName(@WebParam(name = "userId") String userId);

}
