package lfq.ima.mapper;


import lfq.ima.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface StudentMapper {

    @Select("select id,name,password from student")
    public Student getStudentAll();
}
