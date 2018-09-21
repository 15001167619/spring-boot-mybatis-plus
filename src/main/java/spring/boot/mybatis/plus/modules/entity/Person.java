package spring.boot.mybatis.plus.modules.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 武海升
 * @date 2018/9/7 14:49
 * @desc @TableName 注解作: 假如 数据库表名为 spring_person
 *       实体类为 SpringPerson 则必须使用@TableName指定数据库表名
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("person")
@Builder
public class Person extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Double balance;

    private Date addTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
