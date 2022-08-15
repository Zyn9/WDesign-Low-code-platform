package servlet;

import mapper.UserMapper;
import Pojo.User;
import Utils.MybatisConfigUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    /**
     * 一个Servlet处理多个请求的问题
     * user?flag=regist   用户注册
     * user?flag=login    用户登录
     */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置请求和相应的编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //2.获取sqlsession对象
        SqlSession session = MybatisConfigUtil.getSession();
        //通过session得到IUserDAO对象
        UserMapper dao=session.getMapper(UserMapper.class);

       //3.根据请求参数名获取请求参数值
        String flag =req.getParameter("flag");
        if ("regist".equals(flag)){
            //注册
            String account = req.getParameter("account");
            String pwd = req.getParameter("pwd");
            String username = req.getParameter("username");
            String vip = req.getParameter("vip");
            Integer vip1 = Integer.parseInt(vip);
            User user = new User(account,pwd,username,vip1);
            //存到数据库
            dao.addUser(user);
            //跳转到登陆页面
            resp.sendRedirect("login.jsp");
        }
        if ("login".equals(flag)){
            //登录
            //1.获取用户名和密码
            String account = req.getParameter("account");
            String pwd =req.getParameter("pwd");
            //根据用户名和密码查询数据库
            User user=dao.findUserByUsernameAndPassword(account,pwd);
            if(user!=null){
                //将用户信息存储到Session里
                req.getSession().setAttribute("user",user);
                //登陆成功.跳转到首页index.jsp
                resp.sendRedirect("index.jsp");
            }else{
                //登陆失败,提示用户登录失败，重新跳转到登录页面
                req.setAttribute("login_error","用户名或密码错误");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        }
        //关闭sqlsession
        MybatisConfigUtil.closeSession(session);
    }
}
