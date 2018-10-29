package com.pankaj.microservices.currrencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.pankaj.microservices.currrencyexchangeservice.ExchangeValue;

//@FeignClient(name="currency-exchange-service",url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server") // so that the requests will go through zuul api gateway not directly to the ms
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	// when we have changed the name in feigh so that the req will go through zuil..now the url is no lognger rhe same we have to change that too..
	// we have to append the name of the service which is exposing that service
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")// we have to change the getMapping also so that the calls will go through the gateway....like append the service name 
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
//we have changed ExchangeVale to currencyConversionBean why?? 

}
