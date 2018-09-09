package spring.boot.mybatis.plus;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.boot.mybatis.plus.modules.entity.Person;
import spring.boot.mybatis.plus.modules.service.IPersonService;

import javax.annotation.Resource;


/**
 * @author 武海升
 * @date 2018/9/7 14:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MybatisPlusTest {

    @Resource
    private IPersonService personService;

    @Test
    public void testSelect() {
        personService.insert(new Person());
    }

}
