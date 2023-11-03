package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;

@Service 			// this is a service class
public class LoadServiceImpl implements LoadService {

	@Autowired
	private LoadDao loadDao ;
	


	@Override
	public List<Load> getLoad() {
		
		return loadDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Load getLoad(long shipperId) {
		
		return loadDao.getOne(shipperId);
	}

	@Override
	public Load addLoad(Load load) {
		loadDao.save(load);
		return load;
	}

	@Override
	public Load updateLoad(Long shipperId, Load load) {
		loadDao.save(load);
		return load;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteload(Long shipperId) {

Load entity = loadDao.getOne(shipperId);
loadDao.delete(entity);
		
	}

	
}