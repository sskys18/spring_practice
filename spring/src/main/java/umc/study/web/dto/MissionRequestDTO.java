package umc.study.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MissionRequestDTO {
    @Getter
    public static class JoinDto {
        @NotNull
        Integer missionId;
        @NotBlank
        String status;
    }
}
