package me.personal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import me.personal.model.User;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户相关接口", value = "提供用户相关的 Rest API")
@RestController
@RequestMapping("/user")
public class UserController {
    @ApiOperation("新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation("查询用户接口 by id")
    @ApiImplicitParam(name = "id", value = "用户 id")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新用户接口")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @ApiOperation("删除用户接口 by id")
    @ApiImplicitParam(name = "id", value = "用户 id")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
