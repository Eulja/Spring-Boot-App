//package com.cos.app.model;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import org.hibernate.annotations.CreationTimestamp;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//public class Master {
//
//	@Id //primary key
//	@GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트에서 연결된 DB의 넘버링 전략을 따라간다
//	private int id; //시퀀스, auto_increment
//	
//	@Column(nullable = false, length = 30)
//	private String username;  //아이디
//	
//	@Column(nullable = false, length = 1000) //123456 => 해쉬 (비밀번호 암호화)
//	private String password; //비밀번호
//	 
//	@Enumerated(EnumType.STRING)  
//	private  RoleType role; //Enum을 쓰는게 좋다. // ADMIN,USER
//	
//	@CreationTimestamp //시간이 자동으로 입력
//	private Timestamp createDate;
//}
