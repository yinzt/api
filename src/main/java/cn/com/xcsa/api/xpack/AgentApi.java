package cn.com.xcsa.api.xpack;

import cn.com.xcsa.api.dto.ThirdDeptDto;
import cn.com.xcsa.api.dto.ThirdUserDto;
import cn.com.xcsa.api.xpack.agent.AgentInfo;

import java.util.List;

public interface AgentApi {

    /**
     * 设置AgentInfo.
     * @param agentInfo
     * @param at
     * @return 代理对象
     */
    AgentApi agentInfo(AgentInfo agentInfo, AgentType at);

    /**
     * 查询第三方用户列表信息.
     * @param deptId 部门ID
     * @return 用户列表
     */
    List<ThirdUserDto> userList(String deptId);


    /**
     * 查询所有部门.
     * @return 所有部门
     */
    List<ThirdDeptDto> deptList();


}
