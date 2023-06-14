package com.jmoh.myeis.controller;

import com.jmoh.myeis.dao.UserDAO;
import com.jmoh.myeis.entity.TB_USER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDAO userDao;

    @GetMapping("/user")
    public @ResponseBody Map<String, Object> users() throws Exception {


        Map<String, Object> rtnObj = new HashMap<>();

        List<TB_USER> tb_user = userDao.getAllUsers();
        logger.info("users->" + tb_user.toString());
        rtnObj.put("users", tb_user);
        return rtnObj;
    }
}
