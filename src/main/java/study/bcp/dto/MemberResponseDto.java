package study.bcp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.bcp.entity.Members;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberResponseDto {
    private String email;
    private String nickname;

    public static MemberResponseDto of(Members members) {
        return MemberResponseDto.builder()
                .email(members.getEmail())
                .nickname(members.getNickname())
                .build();
    }
}