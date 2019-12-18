package com.scs.web.blog;

/**
 * @author wenjie_lin
 * @ClassName Like
 * @Description TODO
 * @Data 2019/12/18
 * @Version 1.0
 **/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like {
    private Long id;
    private Long userId;
    private Long articleId;
}