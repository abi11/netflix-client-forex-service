package com.abhi.netflix.microservices.netflixclientforexservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.netflix.microservices.netflixclientforexservice.model.ExchangeValue;

public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}