# spring-boot整合mybatis-plus

## 注意的细节
### mybatis-plus 全局配置
#### 1.db-column-underline: true 开启驼峰
#### 2.数据库表名与实体类映射,使用@TableName注解;假如 数据库表名为 spring_person 实体类为 SpringPerson 则必须使用@TableName指定数据库表名
