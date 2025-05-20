package org.knowm.xchange.okex.dto.tradingBot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

/* Author: Max Gao (gaamox@tutanota.com) Created: 09-06-2021 */

/** <a href="https://www.okex.com/docs-v5/en/#rest-api-trade-place-order">...</a> * */
@Builder
@Getter
public class OkexOrderAlgoResponse {
  @JsonProperty("algoId")
  private String algoId;

  @JsonProperty("algoClOrdId")
  private String algoClOrdId;

  @JsonProperty("tag")
  private String tag;

  @JsonProperty("sCode")
  private String code;

  @JsonProperty("sMsg")
  private String message;
}
