package spring.boot.mybatis.plus.modules.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import spring.boot.mybatis.plus.modules.dao.PersonMapper;
import spring.boot.mybatis.plus.modules.entity.Person;
import spring.boot.mybatis.plus.modules.service.IPersonService;

/**
 * @author 武海升
 * @date 2018/9/7 15:03
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {
}
