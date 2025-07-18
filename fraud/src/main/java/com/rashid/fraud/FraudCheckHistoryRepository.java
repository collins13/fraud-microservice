package com.rashid.fraud;

import com.rashid.fraud.models.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer>{
}
