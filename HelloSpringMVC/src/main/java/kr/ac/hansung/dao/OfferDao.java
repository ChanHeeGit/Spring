package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
//Componenet->클래스위에선언하고 그 클래스를 빈으로 등록해 준다.
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;

@Repository
public class OfferDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) { // bean에 등록되있는 property로 인해 해당 set method가 불려지게 됨
		// 이때 인자로 dataSource가 들어가게 되는데 이는 빈에 등록된 BasicDataSource의 id이다
		// 그래서 BasicDataSource가 해당 set method의 인자로서 들어가게 됨
		jdbcTemplate = new JdbcTemplate(dataSource); // JdbdTemplate 객체 생성
	}

	public int getRowCount() {

		String sqlStatement = "select count(*) from offers";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class); // 인자로 sqlStatement넣어줌->Object가 넘어오기 땜ㄴ에
																			// Integer타입으로 바꿔줌
	}

	// query one object
	public Offer getOffer(String name) {
		String sqlStatement = "select * from offers where name=?"; // ? 는 placeholder
		// anonymous class : 한번 사용하고 말 클래스에 활용
		// RowMapper는 interface고 그 안에 mapRow는 반드시 구현해야 하는메소드
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name }, new RowMapper<Offer>() { // name이 위의 ?에
																											// 들어가게 된다.

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));

				return offer;
			}

		});
	}

	// query multiple object
	public List<Offer> getOffers() {
		String sqlStatement = "select * from offers";
		// anonymous class : 한번 사용하고 말 클래스에 활용
		// RowMapper는 interface고 그 안에 mapRow는 반드시 구현해야 하는메소드
		return jdbcTemplate.query(sqlStatement, new RowMapper<Offer>() {

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));

				return offer;
			}

		});
	}

	public boolean insert(Offer offer) {

		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();

		String sqlStatement = "insert into offers (name, email, text) values(?,?,?)";

		return (jdbcTemplate.update(sqlStatement, new Object[] { name, email, text }) == 1);

	}
	
	public boolean update(Offer offer) {
		
		int id = offer.getId(); //insert와 다른점
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();

		String sqlStatement = "update offers set name=?, email=?, text=? where id=?";

		return (jdbcTemplate.update(sqlStatement, new Object[] { name, email, text, id }) == 1);

	}
	
	public boolean delete(int id) {
		
		String sqlStatement = "delete from offers where id=?";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] { id }) == 1); // id는 위 int id 인자
	}
	
	

}
