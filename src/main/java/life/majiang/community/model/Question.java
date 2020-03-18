package life.majiang.community.model;

import lombok.Data;

/**
 * @ClassName Question
 * @Description TODO
 * @Author Li Guicheng
 * @Date 2020/3/10 23:12
 * @Version 1.0
 **/
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    
}
