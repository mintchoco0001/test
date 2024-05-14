package jmybatis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.ibatis.annotations.Param;

public class test {

	public static void main(String[] args) {

		DBUtil my = new DBUtil();

		my.init();
		Scanner s= new Scanner(System.in);
		user_DTO dto = new user_DTO();
		while(true) {
			System.out.println("아이디 입력");
			String id = s.next();
			id = dto.getUser_id();
			System.out.println("비밀번호 입력");
			String pw = s.next();
			pw = dto.getUser_pw();
			my.login(id, pw);
			
			
			System.out.println("Hi");

		}
		
//		System.out.print("[수행 기능 선택]\n ** 1. 입력 2. 수정 3. 삭제 4. 조회 **\n>> ");
//		while (true) {
//			int num = s.nextInt();
//			s.nextLine();
//			if (num == 1) {
//				System.out.println("[값을 입력합니다.]");
//				System.out.print("아이디 입력 : ");
//				String user_id = s.nextLine();
//				System.out.print("비밀번호 입력 : ");
//				String user_pw = s.nextLine();
//				System.out.print("이름 입력 : ");
//				String name = s.nextLine();
//				System.out.print("전화번호 입력 (예시:010-1111-1111) : ");
//				String phone = s.nextLine();
//				System.out.print("등급 입력 : ");
//				String grade = s.nextLine();
//				System.out.print("나이 입력 : ");
//				int age = s.nextInt();
//
//				my.insertUser(user_id, user_pw, name, phone, grade, age);
//
//				System.out.print("[수행 기능 선택]\n ** 1. 입력 2. 수정 3. 삭제 4. 조회 **\n>> ");
//			} else if (num == 2) {
//				System.out.println("[값을 수정합니다.]");
//
//				System.out.print("바꿀 이름 입력 : ");
//				String name = s.nextLine();
//				System.out.print("수정 할 아이디 입력 : ");
//				String user_id = s.nextLine();
//
//				my.updateUser(name, user_id);
//				System.out.print("[수행 기능 선택]\n ** 1. 입력 2. 수정 3. 삭제 4. 조회 **\n>> ");
//
//			} else if (num == 3) {
//				System.out.println("[값을 삭제합니다.]");
//				System.out.print("삭제 할 아이디 입력 : ");
//				String user_id = s.nextLine();
//				my.deleteUser(user_id);
//				System.out.print("[수행 기능 선택]\n ** 1. 입력 2. 수정 3. 삭제 4. 조회 **\n>> ");
//			} else if (num == 4) {
//				System.out.println("[값을 조회합니다.] "); // DAO 객체 생성
//				ArrayList<user_DTO> alllist = my.getUsers();
//
//				System.out.println(alllist);
//				System.out.print("[수행 기능 선택]\n ** 1. 입력 2. 수정 3. 삭제 4. 조회 **\n>> ");
//			} else {
//				System.out.println("잘못된 번호");
//				break;
//			}
//		}
	
		

	}

}
