package com.example.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
@ConfigurationProperties作用：
将配置文件中配置的每一个属性的值，映射到这个组件中；
告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
参数 prefix = “person” : 将配置文件中的person下面的所有属性一一对应
*/

@Component  //注册bean到容器中
@Data
@AllArgsConstructor
@NoArgsConstructor

// 从application.yml拿信息
@ConfigurationProperties(prefix = "person")

// 从person.properties拿信息
//@PropertySource(value = "classpath:person.properties")
// 从属性上面加  @Value("${name}")

@Validated  //数据校验
public class Person {

    // @Email(message = "邮箱格式错误") //name必须是邮箱格式
    @NotNull(message = "名字不能为空")
    private String name;
    @Max(value = 120, message = "年龄最大不能查过120")
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    //有参无参构造、get、set方法、toString()方法
}