package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Tb
 * author : jc
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-16         jc          최초 생성
 */
@Setter
@Getter
public class Tb {

    @JsonProperty(value = "userid")
    private String userid;
    @JsonProperty(value = "username")
    private String username;

    @JsonProperty(value = "userauth")
    private String userauth;

    @JsonProperty(value = "appenddate")
    private String appenddate;

    @JsonProperty(value = "updatedate")
    private String updatedate;

}
