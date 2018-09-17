package spring.boot.mybatis.plus.modules.service;

import com.baomidou.mybatisplus.service.IService;
import spring.boot.mybatis.plus.modules.entity.Person;

/**
 * @author 武海升
 * @date 2018/9/7 15:02
 */
public interface IPersonService extends IService<Person> {
    /**
     * @author 武海升
     * @param payment 支付账户
     * @param receivables 收款账户
     * @param balance 转账金额
     * @return boolean 是否转账成功
     */
    boolean transferAccounts(Person payment,Person receivables,Double balance);

}
