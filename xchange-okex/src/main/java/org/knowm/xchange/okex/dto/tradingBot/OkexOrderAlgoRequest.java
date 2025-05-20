package org.knowm.xchange.okex.dto.tradingBot;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;

/* Author: Max Gao (gaamox@tutanota.com) Created: 09-06-2021 */

/** <a href="https://www.okx.com/docs-v5/zh/#order-book-trading-grid-trading-post-place-grid-algo-order">...</a> * */
@Builder
public class OkexOrderAlgoRequest {
  @JsonProperty("instId")
  private String instrumentId;

  @JsonProperty("algoOrdType")
  private String algoOrdType;

  @JsonProperty("maxPx")
  private String maxPx;

  @JsonProperty("minPx")
  private String minPx;

  @JsonProperty("gridNum")
  private String gridNum;


  @JsonProperty("tag")
  private String tag;

  @JsonProperty("algoClOrdId")
  private String algoClOrdId;



  @JsonProperty("sz")
  private String sz;

  @JsonProperty("direction")
  private String direction;

  @JsonProperty("lever")
  private String lever;

  @JsonProperty("triggerParams")
  private List<TriggerParams> triggerParams;


  public static class TriggerParams {

    @JsonProperty("triggerAction")
    private String triggerAction;

    @JsonProperty("triggerStrategy")
    private String triggerStrategy;
    @JsonProperty("triggerPx")
    private String triggerPx;
  }
}
