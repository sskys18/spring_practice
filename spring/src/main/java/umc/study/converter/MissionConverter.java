package umc.study.converter;

import umc.study.domain.Mission;
import umc.study.web.dto.MissionResponseDTO;

public class MissionConverter {
    public static MissionResponseDTO.JoinResultDTO joinResultDTO(Mission mission){
        return MissionResponseDTO.JoinResultDTO.builder()
                .missionId(mission.getMission_id())
                .build();
    }
}

