package jmybatis;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	// 리턴타입 , 메서드명, 매개변수

	// select
	public ArrayList<user_DTO> getUser();

	// insert
	public void insertUser(user_DTO user_DTO);

	// update
	public void updateUser(@Param("name") String name, @Param("user_id") String user_id);

	// delete
	public void deleteUser(String user_id);

	public ArrayList<user_DTO> login();
	
	public void loginCh(String user_id);
}
