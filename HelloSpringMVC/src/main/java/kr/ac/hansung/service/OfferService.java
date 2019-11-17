package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.OfferDao;
import kr.ac.hansung.model.Offer;

@Service
public class OfferService {
	
	@Autowired 
	private OfferDao offerDao;
	
	public List<Offer> getCurrent(){
		return offerDao.getOffers();
	}
}
