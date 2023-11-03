package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {

	List<Load> getLoad();

	Load getLoad(long shipperId);

	Load addLoad(Load load);

	Load updateLoad(Long shipperId, Load load);

	

	void deleteload(Long shipperId);

}
