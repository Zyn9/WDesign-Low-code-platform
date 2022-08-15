package Service;

import Pojo.Project;


import java.util.List;

public interface ProjectService {

    int addNewProject(Project project);

    void deleteProject(int id);

    void updateProjectInfo(int id, List<String> newValue,List<String> flags);

    void updateProjectContet(int id,List<String> update);

    List<Project> getAllProjectInfo(String account);

    Project getProjectInfo(int id);

    String getProjectContent(int id);

}
