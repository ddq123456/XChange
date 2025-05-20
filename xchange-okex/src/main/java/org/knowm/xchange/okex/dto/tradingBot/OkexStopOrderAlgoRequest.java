package org.knowm.xchange.okex.dto.tradingBot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

/* Author: Max Gao (gaamox@tutanota.com) Created: 09-06-2021 */

/** <a href="https://www.okx.com/docs-v5/zh/#order-book-trading-grid-trading-post-stop-grid-algo-order">...</a> * */
@Builder
public class OkexStopOrderAlgoRequest {
  @JsonProperty("algoId")
  private String algoId;

  @JsonProperty("instId")
  private String instId;

  @JsonProperty("algoOrdType")
  private String algoOrdType;

  @JsonProperty("stopType")
  private String stopType;

}
