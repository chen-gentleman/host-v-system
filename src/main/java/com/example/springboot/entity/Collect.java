package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author @Chenxc
 * @date 2023/7/9 13:26
 **/
@Getter
@Setter
@ApiModel(value = "Collect对象", description = "")
public class Collect {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty("创建人id")
    private Integer userid;
    @ApiModelProperty("帖子id")
    private Integer postid;
    @ApiModelProperty("创建时间")
    private String time;

}
