package com.knu.fromnow.api.global.error.errorcode;

import com.knu.fromnow.api.domain.member.entity.Role;
import lombok.Getter;

@Getter
public enum MemberErrorCode {

    No_EXIST_EMAIL_MEMBER_EXCEPTION(404, "email에 해당하는 member가 없습니다"),
    NO_EXIST_PROFILE_NAME_MEMBER_EXCEPTION(404, "profileName에 해당하는 member가 없습니다"),
    CONFLICT_PROFILE_NAME_MEMBER_EXCEPTION(409, "이미 존재하는 profileName 입니다"),
    NO_MATCHING_MEMBER_EXCEPTION(404, "해당 다이어리에 소속된 멤버가 아닙니다. 다이어리를 조회 할 권한이 없습니다"),
    NO_OWNER_EXCEPTION(404, "해당 다이어리의 Owner가 아닙니다.");

    MemberErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    MemberErrorCode(int code, String message, Role type) {
        this.code = code;
        this.message = message;
        this.type = type;
    }

    private int code;
    private String message;
    private Role type;
}
