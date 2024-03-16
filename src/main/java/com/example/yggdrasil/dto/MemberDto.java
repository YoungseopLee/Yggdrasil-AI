package com.example.yggdrasil.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MemberDto {

    private Long memberId;
    private String memberPassword;
    private String memberName;
    private String memberEmail;
    private String memberPhone;
    private String memberNickname;
    private byte[] memberProfileImg;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
