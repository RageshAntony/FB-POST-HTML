import com.JSON2POJO.Post;
import com.JSON2POJO.TagStore;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class POJOtoJSON {
public static void main(String args[])
{
    ObjectMapper mapper = new ObjectMapper();

    try {
        Post obj = mapper.readValue(new File("C:\\Users\\rocky\\Documents\\fb_comment\\FB_POST_20180204_144709.txt"), Post.class);
        //System.out.println("The output "+obj);
        System.out.println("The Message is ==> "+obj.getData().get(1).getMessage());
        System.out.println("The Liked count ==> "+obj.getData().get(1).getLikes().getData().size());
        System.out.println("The Comments count ==> "+obj.getData().get(0).getComments().getData().get(0).getMessage());

        Document doc = Jsoup.parse(new File("C:\\Users\\rocky\\Documents\\fb_comment\\fbcmnt.html"), "UTF-8");

        Element comments= doc.getElementById("comments");
        //Element commentsList = doc.getElementById("comment_layout");
        System.out.println("The comments html " +TagStore.CommentLi);
        comments.append(TagStore.CommentLi);

        Element post_comment =  doc.getElementById("post_comment");
        post_comment.text(obj.getData().get(1).getComments().getData().get(0).getMessage());

        Element post_content = doc.getElementById("post_content");
        post_content.text(obj.getData().get(1).getMessage());
        System.out.println("The post text is: "+ post_content.text());


        Element post_image = doc.getElementById("post_image");
        post_image.attr("src",obj.getData().get(5).getFullPicture());

        Element post_commenter = doc.getElementById("post_commenter");
        post_commenter.text(obj.getData().get(1).getComments().getData().get(0).getFrom().getName());

         File f = new File("C:\\Users\\rocky\\Documents\\fb_comment\\fbcmnt_new.html");
        FileUtils.writeStringToFile(f, doc.outerHtml(), "UTF-8");


    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
