package com.example.yggdrasil.service;


import com.example.yggdrasil.dto.MemberDto;
import com.example.yggdrasil.entity.Member;

public interface MemberService {



    default Member dtoToEntity(MemberDto dto){
        return Member.builder()
                .memberId(dto.getMemberId())
                .memberPassword(dto.getMemberPassword())
                .memberName(dto.getMemberName())
                .memberEmail(dto.getMemberEmail())
                .memberPhone(dto.getMemberPhone())
                .memberProfileImg(dto.getMemberProfileImg())

                .build();
    }

    default MemberDto entityToDto(Member entity){
        return MemberDto.builder()
                .memberId(entity.getMemberId())
                .memberPassword(entity.getMemberPassword())
                .memberName(entity.getMemberName())
                .memberEmail(entity.getMemberEmail())
                .memberPhone(entity.getMemberPhone())
                .memberProfileImg(entity.getMemberProfileImg())

                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();
    }
}
