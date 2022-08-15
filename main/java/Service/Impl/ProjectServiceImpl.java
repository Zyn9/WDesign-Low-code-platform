package Service.Impl;

import mapper.ProjectMapper;
import Pojo.Project;
import Service.ProjectService;
import Utils.FileCopyUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    private ProjectMapper projectDao=new ProjectDaoImpl();

    @Override
    public int addNewProject(Project project) {
        String filepath=project.getFilepath();
        File file=new File(filepath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return projectDao.addProject(project);
    }

    @Override
    public void deleteProject(int id) {
        String filepath=projectDao.getProjectFilepath(id);
        File file=new File(filepath);
        if(file.exists()){
            file.delete();
        }else{
            System.out.println("查无此项目文件");
        }
        projectDao.deleteProject(id);
    }

    @Override
    public void updateProjectInfo(int id,List<String> newValue,List<String> flags) {
        projectDao.updateProject(id,newValue,flags);
    }

    @Override
    public void updateProjectContet(int id,List<String> update) {
        String path=projectDao.getProjectFilepath(id);
        try {
            Document document = Jsoup.parse(new File(path), "UTF-8");
            for(int i=0;i<update.size();i++){
                //定义每个update的内容前都要增加样式要加个前缀,~为分隔符
                String []tmp=update.get(i).split("~");
                //这里到时等她们页面编辑好后商量有哪几种组件是要update的，到时每种都设立一个flag
                //交互事件和样式都是依靠addclass函数绑定class
                document.getElementById(tmp[0]).append(tmp[1]);
            }
            FileCopyUtils.Write(document);
            FileCopyUtils.copy(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Project> getAllProjectInfo(String account) {
        return projectDao.getUserProject(account);
    }

    @Override
    public Project getProjectInfo(int id) {
        return projectDao.getProjectInfo(id);
    }

    @Override
    public String getProjectContent(int id) {
        String filepath=projectDao.getProjectFilepath(id);
        return filepath;
    }
}
