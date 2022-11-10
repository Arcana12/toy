package com.toy.api.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Setter @ToString
@Getter
public class PostCreate {

    @NotBlank(message = "타이틀을 입력하세요.")
    private String title;

    @NotBlank(message = "컨텐츠를 입력해주세요.")
    private String content;


}
