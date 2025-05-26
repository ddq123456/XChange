package org.knowm.xchange.okex.service;

import static org.knowm.xchange.okex.OkexExchange.PARAM_PASSPHRASE;
import static org.knowm.xchange.okex.OkexExchange.PARAM_SIMULATED;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.knowm.xchange.client.ResilienceRegistries;
import org.knowm.xchange.okex.OkexAuthenticated;
import org.knowm.xchange.okex.OkexExchange;
import org.knowm.xchange.okex.dto.OkexException;
import org.knowm.xchange.okex.dto.OkexResponse;
import org.knowm.xchange.okex.dto.tradingBot.OkexAmendOrderAlgRequest;
import org.knowm.xchange.okex.dto.tradingBot.OkexOrderAlgoRequest;
import org.knowm.xchange.okex.dto.tradingBot.OkexOrderAlgoResponse;
import org.knowm.xchange.okex.dto.tradingBot.OkexOrdersAlgoDetailsResponse;
import org.knowm.xchange.okex.dto.tradingBot.OkexStopOrderAlgoRequest;
import org.knowm.xchange.service.trade.TradeService;
import org.knowm.xchange.utils.DateUtils;

/** Author: Max Gao (gaamox@tutanota.com) Created: 08-06-2021 */
public class OkexLeverOrGridTradeService extends OkexBaseService implements TradeService {
  public OkexLeverOrGridTradeService(OkexExchange exchange, ResilienceRegistries resilienceRegistries) {
    super(exchange, resilienceRegistries);
  }

  /**
   * 新增网格订单
   *
   * @param orders
   * @return
   * @throws IOException
   */
  public OkexResponse<OkexOrderAlgoResponse> gridOrderAlgo(OkexOrderAlgoRequest orders)
      throws IOException {
    try {
      return decorateApiCall(
          () ->
              okexAuthenticated.orderAlgo(
                  exchange.getExchangeSpecification().getApiKey(),
                  signatureCreator,
                  DateUtils.toUTCISODateString(new Date()),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_PASSPHRASE),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_SIMULATED),
                  orders))
          .withRateLimiter(rateLimiter(OkexAuthenticated.orderAlgo))
          .call();
    } catch (OkexException e) {
      throw handleError(e);
    }
  }

  /**
   * 修改网格订单
   *
   * @param orders
   * @return
   * @throws IOException
   */
  public OkexResponse<OkexOrderAlgoResponse> amendOrderAlg(OkexAmendOrderAlgRequest orders)
      throws IOException {
    try {
      return decorateApiCall(
          () ->
              okexAuthenticated.amendOrderAlg(
                  exchange.getExchangeSpecification().getApiKey(),
                  signatureCreator,
                  DateUtils.toUTCISODateString(new Date()),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_PASSPHRASE),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_SIMULATED),
                  orders))
          .withRateLimiter(rateLimiter(OkexAuthenticated.amendOrderAlg))
          .call();
    } catch (OkexException e) {
      throw handleError(e);
    }
  }

  /**
   * 暂停网格订单
   *
   * @param orders
   * @return
   * @throws IOException
   */
  public OkexResponse<OkexOrderAlgoResponse> stopOrderAlgo(OkexStopOrderAlgoRequest orders)
      throws IOException {
    try {
      return decorateApiCall(
          () ->
              okexAuthenticated.stopOrderAlgo(
                  exchange.getExchangeSpecification().getApiKey(),
                  signatureCreator,
                  DateUtils.toUTCISODateString(new Date()),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_PASSPHRASE),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_SIMULATED),
                  orders))
          .withRateLimiter(rateLimiter(OkexAuthenticated.stopOrderAlgo))
          .call();
    } catch (OkexException e) {
      throw handleError(e);
    }
  }

  /**
   * 查询历史完成网格订单
   *
   * @param algoOrdType
   * @param algoId
   * @return
   * @throws IOException
   */
  public OkexResponse<List<OkexOrdersAlgoDetailsResponse>> ordersAlgoHistory(String  algoOrdType,String  algoId)
      throws IOException {
    try {
      return decorateApiCall(
          () ->
              okexAuthenticated.ordersAlgoHistory(
                  exchange.getExchangeSpecification().getApiKey(),
                  signatureCreator,
                  DateUtils.toUTCISODateString(new Date()),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_PASSPHRASE),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_SIMULATED),
                  algoOrdType,algoId))
          .withRateLimiter(rateLimiter(OkexAuthenticated.ordersAlgoHistory))
          .call();
    } catch (OkexException e) {
      throw handleError(e);
    }
  }

  /**
   * 查询未完成网格订单
   *
   * @param algoOrdType
   * @param algoId
   * @return
   * @throws IOException
   */
  public OkexResponse<List<OkexOrdersAlgoDetailsResponse>> ordersAlgoPending(String  algoOrdType,String  algoId)
      throws IOException {
    try {
      return decorateApiCall(
          () ->
              okexAuthenticated.ordersAlgoPending(
                  exchange.getExchangeSpecification().getApiKey(),
                  signatureCreator,
                  DateUtils.toUTCISODateString(new Date()),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_PASSPHRASE),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_SIMULATED),
                  algoOrdType,algoId))
          .withRateLimiter(rateLimiter(OkexAuthenticated.ordersAlgoPending))
          .call();
    } catch (OkexException e) {
      throw handleError(e);
    }
  }

  /**
   * 查询网格订单详情
   *
   * @param algoOrdType
   * @param algoId
   * @return
   * @throws IOException
   */
  public OkexResponse<List<OkexOrdersAlgoDetailsResponse>> ordersAlgoDetails(String  algoOrdType,String  algoId)
      throws IOException {
    try {
      return decorateApiCall(
          () ->
              okexAuthenticated.ordersAlgoDetails(
                  exchange.getExchangeSpecification().getApiKey(),
                  signatureCreator,
                  DateUtils.toUTCISODateString(new Date()),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_PASSPHRASE),
                  (String)
                      exchange
                          .getExchangeSpecification()
                          .getExchangeSpecificParametersItem(PARAM_SIMULATED),
                  algoOrdType,algoId))
          .withRateLimiter(rateLimiter(OkexAuthenticated.ordersAlgoDetails))
          .call();
    } catch (OkexException e) {
      throw handleError(e);
    }
  }
}
