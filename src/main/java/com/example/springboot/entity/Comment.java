package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2023-07-09
 */
@Getter
@Setter
@ApiModel(value = "Comment对象", description = "")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("父级id")
    private Integer pid;

    @ApiModelProperty("用户id")
    private Integer userid;

    @ApiModelProperty("用户")
    private String user;

    @ApiModelProperty("回复给")
    private String replyUser;

    @ApiModelProperty("模块id")
    private Integer fid;

    @TableField(exist = false)
    private List<Comment> children;
}
