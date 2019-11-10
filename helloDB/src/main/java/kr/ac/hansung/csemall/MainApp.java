package kr.ac.hansung.csemall;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/ac/hansung/comf/beans.xml"); // 스프링
																														// 컨테이너
																														// 생성

		OfferDao offerDao = (OfferDao) context.getBean("offerDao");
		System.out.println("The record count is : " + offerDao.getRowCount());

		// 전체 출력
		List<Offer> offerList = offerDao.getOffers();
		for (Offer offer : offerList) {
			System.out.println(offer);
		}

		// insert
		Offer offer = new Offer();
		offer.setName("chanhee");
		offer.setEmail("loloslols@nate.com");
		offer.setText("졸리다");
		if (offerDao.insert(offer)) {
			System.out.println("object is inserted successfully");
		} else
			System.out.println("object insert is failed");

		// 조회
		offer = offerDao.getOffer("chanhee");
		offer.setName("loloslols");
		// 수정
		if (offerDao.update(offer)) {
			System.out.println("object is update successfully");
		} else
			System.out.println("object update is failed");

		offer = offerDao.getOffer("loloslols");
		System.out.println(offer);
		//삭제
		if (offerDao.delete(offer.getId())) {
			System.out.println("object id deleted successfully");
		} else
			System.out.println("object delete is failed");

		context.close();

	}

}
