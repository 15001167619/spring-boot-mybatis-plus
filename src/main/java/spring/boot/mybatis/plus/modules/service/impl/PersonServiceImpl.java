package spring.boot.mybatis.plus.modules.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.mybatis.plus.modules.dao.PersonMapper;
import spring.boot.mybatis.plus.modules.entity.Person;
import spring.boot.mybatis.plus.modules.service.IPersonService;

/**
 * @author 武海升
 * @date 2018/9/7 15:03
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    private final PersonMapper personMapper;

    @Autowired
    public PersonServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public boolean transferAccounts(Person payment, Person receivables,Double balance) {
        try {
            if(payment.getBalance()>=balance){
                payment.setBalance(payment.getBalance()-balance);
                receivables.setBalance(receivables.getBalance()+balance);
                personMapper.updateById(payment);
                //添加异常
                int i = 1/0;
                personMapper.updateById(receivables);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
