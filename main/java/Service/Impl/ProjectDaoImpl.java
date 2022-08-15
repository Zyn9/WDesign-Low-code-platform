package Service.Impl;

import mapper.ProjectMapper;
import Pojo.Project;

import javax.annotation.Resource;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public class ProjectDaoImpl implements ProjectMapper {

    @Resource
    private  ProjectMapper projectMapper;

    @Override
    public List<Project> getUserProject(String account) {
            projectMapper.getUserProject(account);
        return getUserProject(account);
    }

    @Override
    public Project getProjectInfo(int id) {
        projectMapper.getProjectInfo(id);
        return getProjectInfo(id);
    }

    @Override
    public String getProjectFilepath(int id) {
        projectMapper.getProjectFilepath(id);
        return getProjectFilepath(id);
    }

    @Override
    public int addProject(Project project) {
        projectMapper.addProject(project);
        return  addProject(project);
    }

    @Override
    public int deleteProject(int id) {
        projectMapper.deleteProject(id);
        return  deleteProject(id);
    }

    @Override
    public int updateProject(int id, List<String> newValue, List<String> flag) {
        return updateProject(id, newValue, flag);
    }
}
