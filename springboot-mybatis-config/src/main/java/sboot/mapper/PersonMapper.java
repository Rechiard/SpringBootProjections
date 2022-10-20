package sboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import sboot.model.Person;

import java.util.List;

public interface PersonMapper {

    public Person selectById(int pid);

    public List<Person> selectAll();

    public void insert(Person p);

    public void delete(int pid);
}
