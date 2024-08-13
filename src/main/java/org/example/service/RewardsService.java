package org.example.service;

import org.example.model.Rewards;

public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
