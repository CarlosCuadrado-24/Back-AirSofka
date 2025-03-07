package com.airsofka.shared.application;

public class Request {
  private final String aggregateId;

  protected Request(String aggregateId) {
    this.aggregateId = aggregateId;
  }

  public String getAggregateId() {
    return aggregateId;
  }
}
