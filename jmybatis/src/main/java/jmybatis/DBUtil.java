package jmybatis;

import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtil {
	SqlSessionFactory sqlSessionFactory;

	public void init() {

		try {

			String resource = "jmybatis/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			System.out.println("MyBatis 연동 실패함 ㅠㅠ");

			e.printStackTrace();
		}
	}

	// select
	public ArrayList<user_DTO> getUsers() {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		ArrayList<user_DTO> userlist = mapper.getUser();
		return userlist;
	}

	// insert
//	public void insertUser(String user_id, String user_pw, String name, String phone, String grade, int age) {
//		SqlSession session = sqlSessionFactory.openSession();
//		UserMapper mapper = session.getMapper(UserMapper.class);
//		user_DTO userDTO = new user_DTO(user_id, user_pw, name, phone, grade, age);
//		mapper.insertUser(userDTO);
//		session.commit();
//	}

	// update
	public void updateUser(String name, String user_id) {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.updateUser(name, user_id);
		session.commit();
	}

	// delete
	public void deleteUser(String user_id) {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.deleteUser(user_id);
		session.commit();
	}


	public void login(String user_id, String user_pw) {
		user_DTO dto = new user_DTO();
		SqlSession session = sqlSessionFactory.openSession();
		int count = session.selectOne("loginCh", user_id);
		
		if(count == 0) {
			System.out.println("아이디가 존재하지 않음");
		}else {
			dto = session.selectOne("login",user_id);
			if(user_pw.equals(dto.getUser_pw())) {
				System.out.println(dto.getName() + "님 로그인 성공했습니다.");
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}
	}

}