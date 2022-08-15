package Utils;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class FileCopyUtils {
    public static final String filepath="C:\\javaee\\WDesign_demo1\\web\\Project\\test.html";
    public static void copy(String updateFilePath) throws IOException {
        Writer r = null;
        InputStream in=null;
        OutputStream out=null;
        File newfile=new File(updateFilePath);
        File tempFile=new File(filepath);
        newfile.createNewFile();
        try {
            in=new FileInputStream(tempFile);
            out=new FileOutputStream(newfile);
            r = new FileWriter(newfile);
            r.write("");//清空
            r.flush();
            int len=0;
            byte[] data=new byte[1024];
            while((len=in.read(data))!=-1){
                out.write(data,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            r.close();
            in.close();
            out.close();
        }
    }

    public static void Write(Document document) throws IOException {
        File file=new File(filepath);
        Writer r=null;
        Elements elements = document.getAllElements();
        String string="";
        for(Element element:elements){
            string=element.toString();
            /*System.out.println(string);*/
            break;
            /*if(element.toString().equals("</html>")){
                break;
            }*/
        }
        try {
            r = new FileWriter(file);
            r.write("");
            r.write(string);
            r.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            r.close();
        }
    }
}
