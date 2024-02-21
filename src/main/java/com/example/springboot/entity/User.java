package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 *
 * </p>
 *
 * @author
 * @since 2022-01-26
 */
@Getter
@Setter
@TableName("sys_user")
@ApiModel(value = "User对象", description = "")
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 角色
     */
    private String role;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 性别
     */
    private Short sex;

    /**
     * 年龄
     */
    private Short age;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 病人档案号
     */
    private String fileNumber;

    /**
     * 科室
     */
    private String dept;

    /**
     * 职务
     */
    private String job;

    /**
     * 0医生 1病人
     */
    private Short type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date gmtModified;

}
