package mybatis.model;

public class Painting {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PAINTING.ID
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PAINTING.NAME
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PAINTING.AUTHOR_ID
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    private Integer authorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PAINTING.ID
     *
     * @return the value of PUBLIC.PAINTING.ID
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PAINTING.ID
     *
     * @param id the value for PUBLIC.PAINTING.ID
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PAINTING.NAME
     *
     * @return the value of PUBLIC.PAINTING.NAME
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PAINTING.NAME
     *
     * @param name the value for PUBLIC.PAINTING.NAME
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PAINTING.AUTHOR_ID
     *
     * @return the value of PUBLIC.PAINTING.AUTHOR_ID
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PAINTING.AUTHOR_ID
     *
     * @param authorId the value for PUBLIC.PAINTING.AUTHOR_ID
     *
     * @mbg.generated Sun Mar 29 23:21:29 EEST 2020
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}