package Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 1.读取Mybatis核心配置文件获取SqlSessionFactory对象
 * 2.获取SqlSession对象
 * 3.关闭SqlSession对象
 */
public class MybatisConfigUtil {

    private static SqlSessionFactory factory;

    //在类加载期间执行，并且只执行一次，通常用来加载配置文件，音频，视频，图片等
    static {
        try {
            //1.创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            //2.读取SqlMap.xml配置文件
            InputStream is = Resources.getResourceAsStream("SqlMap.xml");

            //3.获取SqlSessionFactory
            factory = builder.build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * factory.openSession(true):自动提交事务
     * @return
     */
    public static SqlSession getSession(){
        if(factory != null){
            return factory.openSession(true);
        }
        return null;
    }

    //关闭SqlSession
    public static void closeSession(SqlSession session){
        if(session !=null){
            session.close();
        }

    }
}
