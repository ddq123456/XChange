package org.knowm.xchange.okex.dto.tradingBot;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import org.knowm.xchange.okex.dto.tradingBot.OkexOrderAlgoRequest.TriggerParams;

/* Author: Max Gao (gaamox@tutanota.com) Created: 09-06-2021 */

/** <a href="https://www.okx.com/docs-v5/zh/#order-book-trading-grid-trading-get-grid-algo-order-details">...</a> * */
@Getter
public class OkexOrdersAlgoDetailsResponse {
  @JsonProperty("algoId")
  private String algoId;

  @JsonProperty("algoClOrdId")
  private String algoClientOrderId;

  @JsonProperty("instType")
  private String instType;

  @JsonProperty("instId")
  private String instId;

  @JsonProperty("cTime")
  private String cTime;

  @JsonProperty("uTime")
  private String uTime;

  @JsonProperty("algoOrdType")
  private String algoOrdType;

  @JsonProperty("state")
  private String state;

  @JsonProperty("triggerParams")
  private List<TriggerParams> triggerParams;

  @JsonProperty("maxPx")
  private String maxPx;

  @JsonProperty("minPx")
  private String minPx;

  @JsonProperty("gridNum")
  private String gridNum;

  @JsonProperty("runType")
  private String runType;
  @JsonProperty("tpTriggerPx")
  private String tpTriggerPx;
  @JsonProperty("slTriggerPx")
  private String slTriggerPx;
  @JsonProperty("runPx")
  private String runPx;
  @JsonProperty("totalPnl")
  private String totalPnl;
  @JsonProperty("pnlRatio")
  private String pnlRatio;
  @JsonProperty("investment")
  private String investment;
  @JsonProperty("tpRatio")
  private String tpRatio;
  @JsonProperty("slRatio")
  private String slRatio;
  @JsonProperty("fee")
  private String fee;
  @JsonProperty("fundingFee")
  private String fundingFee;
  @JsonProperty("tag")
  private String tag;
  @JsonProperty("direction")
  private String direction;

  @JsonProperty("lever")
  private String lever;
  @JsonProperty("actualLever")
  private String actualLever;

  @JsonProperty("floatProfit")
  private String floatProfit;
  @JsonProperty("arbitrageNum")
  private String arbitrageNum;
  @JsonProperty("gridProfit")
  private String gridProfit;

}
