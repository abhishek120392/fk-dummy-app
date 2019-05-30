package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class CountService {

	private static AtomicInteger bulkRequestCount = new AtomicInteger();
	private static AtomicInteger merchantCallbackCount = new AtomicInteger();
	private static AtomicInteger statusCount = new AtomicInteger();
	
	public void increaseBulkRequestCount() {
		bulkRequestCount.incrementAndGet();
	}
	
	public void increaseMerchantCallbackCount() {
		merchantCallbackCount.incrementAndGet();
	}
	
	public void increaseDigipaypaymentstatusCount() {
		statusCount.incrementAndGet();
	}
	
	public Integer getBulkRequestCount(){
		return bulkRequestCount.get();
	}

	public Integer getMerchantCallbackCount() {
		return merchantCallbackCount.get();
	}

	public Integer getDigipaypaymentstatusCount() {
		return statusCount.get();
	}
	
}
