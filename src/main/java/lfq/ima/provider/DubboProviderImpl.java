package lfq.ima.provider;


import lfq.ima.mapper.StudentMapper;
import lfq.ima.po.Student;
import org.springframework.beans.factory.annotation.Autowired;

@com.alibaba.dubbo.config.annotation.Service
public class DubboProviderImpl implements DubboProvider {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student sayDubbo() {
        System.out.println("I get ！！");
        Student student = new Student(107,"liufangqi","haha");
        return studentMapper.getStudentAll();
    }
}
