package life.majiang.community.mapper;

import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName QuestionMapper
 * @Description TODO
 * @Author Li Guicheng
 * @Date 2020/3/10 23:07
 * @Version 1.0
 **/
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, gmt_create, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    public void create(Question question);
}
