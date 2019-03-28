package io.hailiang.web.book.service.impl;

import io.hailiang.web.book.dao.PermissionMapper;
import io.hailiang.web.book.model.Permission;
import io.hailiang.web.book.model.User;
import io.hailiang.web.book.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: luhailiang
 * @Date: 2019-03-26 23:04
 * @Description:
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {


    @Resource
    private PermissionMapper permissionMapper;

    /**
     * @param user
     * @return : java.util.List<io.hailiang.web.book.model.Permission>
     * @author: luhailiang
     * @date: 2019-03-26 23:04
     * @description: 获取用户权限信息
     */
    @Override
    public List<Permission> queryPermissionsByUser(User user) {
        return permissionMapper.queryPermissionsByUser(user);
    }

    /**
     * @return : java.util.List<io.hailiang.web.book.model.Permission>
     * @author: luhailiang
     * @date: 2019-03-26 23:29
     * @description: 获取所有权限列表
     */
    @Override
    public List<Permission> queryAll() {
        return permissionMapper.queryAll();
    }

    /**
     * @param roleId
     * @return : void
     * @author: luhailiang
     * @date: 2019-03-28 21:30
     * @description: 通过角色id删除角色权限表的关联关系
     */
    @Override
    public void deleteRolePermissionRsByRoleId(Integer roleId) {
        permissionMapper.deleteRolePermissionRsByRoleId(roleId);
    }
}
