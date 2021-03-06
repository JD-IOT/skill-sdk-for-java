package com.jd.alpha.skill.client.entity.response;

import com.jd.alpha.skill.client.constant.ResponseCardTypeConstants;
import lombok.*;

/**
 * 类描述
 *
 * @author <b>作者：</b> D.Yang（cdyangyang18@jd.com） <br/>
 * <b>时间：</b> 2017/11/29 17:07 <br/>
 * <b>Copyright (c)</b> 2018 京东智能-版权所有 <br/>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillResponseImageCard extends SkillResponseCard {

    @Builder.Default
    private String type = ResponseCardTypeConstants.IMAGE;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片对应文字内容显示
     */
    private String text;
    /**
     * 小图片url地址
     */
    private String smallImageUrl;
    /**
     * 大图片url地址
     */
    private String largeImageUrl;
}
