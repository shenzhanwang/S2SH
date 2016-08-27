package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CountryDao;
import po.Country;
import service.CountryService;
@Service("countryservice")
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryDao countryDao;
	
	public CountryDao getCountryDao() {
		return countryDao;
	}

	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	public List<Country> getallcountrys(){
		List<Country> list=countryDao.find("from Country where id=23");
		for(Country c:list)
			System.out.println(c.toString());
		return list;
	}
	
	public void addCountry(Country c){
		countryDao.save(c);
	}

	public void updatecountry(Country c) {
		countryDao.update(c);
	}


	public void deleteCountry(Country c) {
		countryDao.delete(c);
		
	}

	public Country findCountry(short id) {
		//Country c=countryDao.get(Country.class, id);
		List<Country> c=countryDao.find("from Country as c join fetch c.citys where c.id="+id);
		return c.get(0);
	}

	public void updateCountry(Country c) {
		countryDao.update(c);
	}


}
