package com.finaltask.internet_provider_spring.repos;
import com.finaltask.internet_provider_spring.domain.Tariff;
import com.finaltask.internet_provider_spring.domain.TariffType;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TariffRepo extends CrudRepository<Tariff, Long>{
	List<Tariff> findByType(TariffType type);
}
