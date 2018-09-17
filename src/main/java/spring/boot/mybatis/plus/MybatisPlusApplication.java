package spring.boot.mybatis.plus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 武海升
 * @date 2018/9/7 14:01
 * @desc 数据库监控 http://localhost:6080/druid/index.html
 */
@SpringBootApplication
@Slf4j
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
        log.info("MybatisPlus Application start-up is success!");
    }

}
