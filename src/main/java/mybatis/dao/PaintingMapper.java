package mybatis.dao;

import java.util.List;
import mybatis.model.Painting;
import org.mybatis.cdi.Mapper;

@Mapper
public interface PaintingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PAINTING
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PAINTING
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    int insert(Painting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PAINTING
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    Painting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PAINTING
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    List<Painting> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PAINTING
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    int updateByPrimaryKey(Painting record);
}