package sof.uz.outlay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sof.uz.outlay.enums.Ccy;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency extends BasicEntity {

    @JsonProperty("Ccy")
    @Enumerated(EnumType.STRING)
    private Ccy usd;

    @JsonProperty("CcyNm_UZ")
    private String ccyNmUz;

    @JsonProperty("CcyNm_RU")
    private String ccyNmRu;

    @JsonProperty("CcyNm_EN")
    private String ccyNumEn;

    @JsonProperty("Rate")
    private Double rate;
}
