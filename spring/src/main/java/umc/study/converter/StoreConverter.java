package umc.study.converter;

import umc.study.domain.Store;
import umc.study.web.dto.StoreRequestDTO;
import umc.study.web.dto.StoreResponseDTO;

import java.time.LocalDateTime;

public class StoreConverter {
    public static StoreResponseDTO.JoinResultDTO toJoinResultDTO(Store store){
        return StoreResponseDTO.JoinResultDTO.builder()
                .storeID(store.getStore_id())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Store toStore(StoreRequestDTO.JoinDto request){
        return Store.builder()
                .name(request.getName())
                .score(request.getScore())
                .address(request.getAddress())
                .region(request.getRegion())
                .build();
    }
}
