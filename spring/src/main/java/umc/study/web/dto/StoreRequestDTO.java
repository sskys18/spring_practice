package umc.study.web.dto;

import lombok.Getter;
import umc.study.domain.Region;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

public class StoreRequestDTO {

    @Getter
    public static class JoinDto{
        @NotBlank
        String name;
        @NotNull
        Float score;
        @Size(min = 5, max = 12)
        String address;
        @NotNull
        Region region;
    }
}