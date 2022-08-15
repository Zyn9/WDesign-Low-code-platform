package mapper;

import Pojo.Project;

import java.util.List;

public interface ProjectMapper {
    /**
     * 返回用户的所有项目
     * @param account
     * @return 所有内容的list集合
     */
     List<Project> getUserProject(String account);

    /**
     * 通过项目id获取项目的所有信息
     * @param id
     * @return project
     */
     Project getProjectInfo(int id);

    /**
     * 获取项目存取路径
     * @param id
     * @return json对象
     */
    String getProjectFilepath(int id);

    /**
     * 添加新项目
     * @param project
     * @return true表示添加成功，false失败
     */
    int addProject(Project project);

    /**
     * 删除项目
     * @param id
     * @return true表示成功，false失败
     */
     int deleteProject(int id);

    /**
     * update
     * @param id 修改的项目ID
     * @param flag 被改的字段
     * @param newValue 修改后的newValue
     * @return
     */
     int updateProject(int id, List<String> newValue, List<String> flag);

}
