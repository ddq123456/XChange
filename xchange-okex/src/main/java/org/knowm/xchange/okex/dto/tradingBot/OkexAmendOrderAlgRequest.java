package org.knowm.xchange.okex.dto.tradingBot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

/* Author: Max Gao (gaamox@tutanota.com) Created: 09-06-2021 */

/** <a href="https://www.okx.com/docs-v5/zh/#order-book-trading-grid-trading-post-amend-grid-algo-order">...</a> * */
@Builder
public class OkexAmendOrderAlgRequest {

  @JsonProperty("algoId")
  private String algoId;

  @JsonProperty("instId")
  private String instrumentId;

  @JsonProperty("slTriggerPx")
  private String slTriggerPx;

  @JsonProperty("tpTriggerPx")
  private String tpTriggerPx;

  @JsonProperty("tpRatio")
  private String tpRatio;

  @JsonProperty("slRatio")
  private String slRatio;

}
