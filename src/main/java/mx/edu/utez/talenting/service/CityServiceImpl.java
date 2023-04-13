package mx.edu.utez.talenting.service;

import mx.edu.utez.talenting.model.City;
import mx.edu.utez.talenting.repository.CityRepository;
import mx.edu.utez.talenting.service.base.CatalogServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl extends CatalogServiceImpl<City, Short, CityRepository> implements ICityService{
}
